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
import fr.eni.filmotheque.bll.ReviewService;
import fr.eni.filmotheque.bo.Review;

@Controller
public class ReviewsController 
{
	private PersonService personService;
	private FilmsService filmsService;
	private ReviewService reviewService;
	
	@Autowired
	public ReviewsController(PersonService personService, ReviewService reviewService, FilmsService filmsService) 
	{
		this.personService = personService;
		this.reviewService = reviewService;
		this.filmsService  = filmsService;
	}

	@GetMapping({"/AjoutReview"})
	public String addPerson(@RequestParam Integer id, Model model)
	{	
		Review review = new Review();
		
		//review.setUser();
		
		review.setFilm(this.filmsService.getFilmById(id));		
		model.addAttribute("review",review);
		
		return "ajout_review";
	}
	
	@PostMapping({"/addreview"})
	public String traitForm(@Valid @ModelAttribute("review") Review review,
							BindingResult validationResult)	
	{
		if(validationResult.hasErrors()) 
		{
			return "addreview";
		}
		
		this.reviewService.insert(review);
		
		return "redirect:/";
	}
}
