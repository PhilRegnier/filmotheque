package fr.eni.filmotheque.ihm;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestParam;

import ch.qos.logback.core.recovery.ResilientSyslogOutputStream;
import fr.eni.filmotheque.bll.FilmsService;
import fr.eni.filmotheque.bo.Film;

@Controller
public class FilmsController 
{
	private FilmsService filmsService;
	
	@Autowired
	public FilmsController(FilmsService filmsService)
	{	
		this.filmsService = filmsService;
	}
	
	@GetMapping({"/", "/movies", "/films"})
	public String movies(Model model)
	{
		model.addAttribute("movies", filmsService.getFilms());
		return "movies";
	}
	
	@GetMapping({"/addfilm", "/addmovie"})
	public String add(Model model)
	{
		model.addAttribute("film", new Film());
		return "addmovie";
	}
	
	@PostMapping({"/addfilm", "/addmovie"})
	public String add( @ModelAttribute("film") Film film) {
		System.out.println(film.getTitle() + ' ' + film.getGenre());
		return "redirect:movies";
	}
	
	@GetMapping({"/movies"})
	public String movies(@RequestParam long id, Model model)
	{	
		model.addAttribute("movie",filmsService.getFilmById(id));
		
		return "details";
	}
}
