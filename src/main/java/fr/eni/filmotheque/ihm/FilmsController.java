package fr.eni.filmotheque.ihm;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import fr.eni.filmotheque.bll.FilmsService;

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
		model.addAttribute("movies",filmsService.getFilms());
		
		return "movies";
	}	
}
