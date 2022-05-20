package fr.eni.filmotheque.dao;

import java.util.List;

import fr.eni.filmotheque.bo.User;

public interface UserDao 
{
	public List<User>	selectUsers();	
	public User 		selectUserById(long id);	
	public void 		insertUser(User user);
}
