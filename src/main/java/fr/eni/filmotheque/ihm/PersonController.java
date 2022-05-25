package fr.eni.filmotheque.ihm;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import fr.eni.filmotheque.bll.PersonService;
import fr.eni.filmotheque.bo.Person;

@Controller
@RequestMapping("/person")
public class PersonController 
{
	private PersonService personService;
	
	@Autowired
	public PersonController(PersonService personService) 
	{
		this.personService = personService;
	}

	@GetMapping({"/add"})
	public String addPerson(Model model)
	{				
		model.addAttribute("person",new Person());
		model.addAttribute("liste",personService.getPersons());
		
		return "ajout_person";
	}
	
	@PostMapping({"/add"})
	public String traitForm(@Valid @ModelAttribute("person") Person personne,
							BindingResult validationResult)	
	{
		if(validationResult.hasErrors()) 
		{
			return "ajout_person";
		}
		
		personService.insertPerson(personne);
		
		return "redirect:/add";
	}
}
