package fr.eni.filmotheque.dao;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Repository;

import fr.eni.filmotheque.bo.User;

@Repository
public class UserDaoImpl implements UserDao
{
	private List<User> 	 users 		= new ArrayList<User>();
	
	public UserDaoImpl() 
	{
		User userTmp;
		
		userTmp = new User("Toto41", "Hercule", "Poirot", "123456", "Toto@eni.fr", true);
		userTmp.setId(1);
		users.add(userTmp);
		
		userTmp = new User("Bob987", "Boby", "Rasofsky", "123456", "Boby@eni.fr", false);
		userTmp.setId(1);
		users.add(userTmp);
		
		userTmp = new User("TheBoss", "Michel", "Trouduc", "123456", "Mimi@eni.fr", false);
		userTmp.setId(1);
		users.add(userTmp);
	}

	@Override
	public List<User> selectUsers() 
	{	
		return users;
	}

	@Override
	public User selectUserById(Integer id) 
	{	
		return this.users.get(id);
	}

	@Override
	public void insertUser(User user) 
	{
		this.users.add(user);
	}
}
