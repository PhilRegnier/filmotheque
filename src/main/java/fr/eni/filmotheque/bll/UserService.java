package fr.eni.filmotheque.bll;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

import fr.eni.filmotheque.bo.User;
import fr.eni.filmotheque.dao.UserRepository;

@Service
public class UserService implements UserDetailsService
{
	private UserRepository userRepository;
	
	@Autowired
	public UserService(UserRepository userRepository) 
	{
		this.userRepository = userRepository;
	}

	@Override
	public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
		return this.userRepository.getByPseudo(username);
	}
	
	public List<User> getUsers() 
	{
		return this.userRepository.findAll();
	}

	public User getById(Integer id) 
	{
		return this.userRepository.getById(id);
	}

	public void insert(User user) 
	{
		this.userRepository.save(user);
	}

	public User getByUsername(String pseudo) {
		return this.userRepository.getByPseudo(pseudo);
	}

}
