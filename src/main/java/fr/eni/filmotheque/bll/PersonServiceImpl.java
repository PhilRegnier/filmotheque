package fr.eni.filmotheque.bll;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import fr.eni.filmotheque.bo.Person;
import fr.eni.filmotheque.dao.PersonsDao;

@Service
public class PersonServiceImpl implements PersonService 
{
	private PersonsDao personsDao;
	
	@Autowired
	public PersonServiceImpl(PersonsDao personsDao) 
	{
		this.personsDao = personsDao;
	}

	@Override
	public List<Person> getPersons() 
	{
		return this.personsDao.selectAllPersons();
	}

	@Override
	public Person getPersonById(long id) 
	{
		return this.personsDao.selectPersonById(id);
	}

	@Override
	public void insertPerson(Person person) 
	{
		this.personsDao.insertPerson(person);
	}
}
