package fr.eni.filmotheque.bll;

import java.util.List;

import fr.eni.filmotheque.bo.User;

public interface UsersService
{
	public List<User> 	getUsers();
	public User 		getUserById(Integer id);
	public void 		insert(User user);
}
