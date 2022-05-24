package fr.eni.filmotheque.ihm;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import fr.eni.filmotheque.bll.UsersService;
import fr.eni.filmotheque.bo.User;

@Controller
public class UsersController 
{
	private UsersService usersService;

	@Autowired
	public UsersController(UsersService usersService) 
	{
		this.usersService = usersService;
	}
	
	@GetMapping("/connecter")
	public String connecter(Model model)
	{
		model.addAttribute("user",new User());
		
		return "connexion";
	}
}
