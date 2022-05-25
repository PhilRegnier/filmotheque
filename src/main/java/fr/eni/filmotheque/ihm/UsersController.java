package fr.eni.filmotheque.ihm;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import fr.eni.filmotheque.bll.UserService;

@Controller
public class UsersController 
{
	private UserService userService;

	@Autowired
	public UsersController(UserService userService) 
	{
		this.userService = userService;
	}
	
	@GetMapping("/connecter")
	public String connecter(Model model)
	{		
		return "connexion";
	}
}
