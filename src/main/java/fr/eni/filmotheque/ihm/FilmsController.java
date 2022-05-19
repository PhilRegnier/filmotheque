package fr.eni.filmotheque.ihm;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import fr.eni.filmotheque.bll.FilmsService;
import fr.eni.filmotheque.bo.Film;

@Controller
public class FilmsController 
{
	private FilmsService filmsService;

	@Autowired
	public FilmsController(FilmsService filmsService) {	
		this.filmsService = filmsService;
	}
	
	@GetMapping({"/movies","/films"})
	public String movies(Model model)
	{
		List<Film> list = filmsService.getFilms();
		System.out.println(list);
		model.addAttribute("movies",filmsService.getFilms());
		
		return "movies";
	}	
}
