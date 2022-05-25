package fr.eni.filmotheque.bll;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import fr.eni.filmotheque.bo.User;
import fr.eni.filmotheque.dao.UserDao;

@Service
public class UsersServiceImpl implements UsersService
{
	private UserDao userDao;
	
	@Autowired
	public UsersServiceImpl(UserDao userDao) 
	{
		this.userDao = userDao;
	}

	@Override
	public List<User> getUsers() 
	{
		//return this.userDao.findAll();
		return this.userDao.selectUsers();
	}

	@Override
	public User getUserById(Integer id) 
	{
		//return this.userDao.getById(id);
		return this.userDao.selectUserById(id);
	}

	@Override
	public void insert(User user) 
	{
		//this.userDao.save(user);
		this.userDao.insertUser(user);
	}	
}
