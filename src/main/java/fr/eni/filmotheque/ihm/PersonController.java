package fr.eni.filmotheque.ihm;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import fr.eni.filmotheque.bll.PersonService;
import fr.eni.filmotheque.bo.Person;

@Controller
public class PersonController 
{
	private PersonService personService;
	
	@Autowired
	public PersonController(PersonService personService) 
	{
		this.personService = personService;
	}

	@GetMapping({"/addPerson"})
	public String addPerson(Model model)
	{				
		model.addAttribute("person",new Person());
		model.addAttribute("liste",personService.getPersons());
		
		return "ajout_person";
	}
	
	@PostMapping({"/ajoutPerson"})
	public String traitForm(Model model,@ModelAttribute("person") Person personne)	
	{
		personService.insertPerson(personne);
		
		return "redirect:addPerson";
	}
}
