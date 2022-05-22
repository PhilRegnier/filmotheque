package fr.eni.filmotheque.ihm;

import java.time.LocalDate;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.origin.SystemEnvironmentOrigin;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import ch.qos.logback.core.net.SyslogOutputStream;
import ch.qos.logback.core.recovery.ResilientSyslogOutputStream;

import fr.eni.filmotheque.bll.FilmsService;
import fr.eni.filmotheque.bll.PersonService;
import fr.eni.filmotheque.bo.Film;
import fr.eni.filmotheque.bo.Person;

@Controller
public class FilmsController 
{
	private FilmsService  filmsService;
	private PersonService personService;
	
	@Autowired
	public FilmsController(FilmsService filmsService,PersonService personService)
	{	
		this.filmsService  = filmsService;
		this.personService = personService;
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
	public String movies(@RequestParam Integer id, Model model)
	{	
		model.addAttribute("movie",filmsService.getFilmById(id));
		
		return "details";
	}
	
	@GetMapping({"/addMovie"})
	public String addMovie(Model model)
	{
		LocalDate ld = LocalDate.now();
		
		System.out.print(ld.toString());
		
		
		model.addAttribute("person",new Person());
		model.addAttribute("liste",personService.getPersons());
		
		return "ajout_person";
	}
	
	@PostMapping({"/ajoutPerson"})
	public String traitForm(Model model,@ModelAttribute("person") Person personne)	
	{
		personService.insertPerson(personne);
		
		return "redirect:addMovie";
	}
}
