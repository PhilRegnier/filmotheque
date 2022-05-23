package fr.eni.filmotheque.ihm;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import fr.eni.filmotheque.bll.FilmsService;
import fr.eni.filmotheque.bll.PersonService;
import fr.eni.filmotheque.bo.Film;

@Controller
public class FilmsController 
{
	private FilmsService  filmsService;
	
	@Autowired
	public FilmsController(FilmsService filmsService,PersonService personService)
	{	
		this.filmsService  = filmsService;
	}
	
	@GetMapping({"/", "/movies", "/films"})
	public String movies(Model model)
	{
		model.addAttribute("movies", this.filmsService.getFilms());
		return "movies";
	}
	
	@GetMapping({"/addfilm", "/addmovie"})
	public String add(Model model)
	{
		model.addAttribute("film", new Film());
		return "addmovie";
	}
	
	@PostMapping({"/addfilm", "/addmovie"})
	public String add(
			@Valid @ModelAttribute("film") Film film,
			BindingResult validationResult
			)
	{
		if (validationResult.hasErrors()) {
			return "addmovie";
		}
		this.filmsService.insert(film);
		return "redirect:/movies";
	}
	
	@GetMapping({"/movie"})
	public String movies(@RequestParam Integer id, Model model)
	{	
		model.addAttribute("movie",this.filmsService.getFilmById(id));
		
		return "details";
	}
}
