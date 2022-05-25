package fr.eni.filmotheque.bll;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import fr.eni.filmotheque.bo.Person;
import fr.eni.filmotheque.dao.PersonRepository;

@Service
public class PersonServiceImpl implements PersonService 
{
	private PersonRepository personsDao;
	
	@Autowired
	public PersonServiceImpl(PersonRepository personsDao) 
	{
		this.personsDao = personsDao;
	}

	@Override
	public List<Person> getPersons() 
	{
		return this.personsDao.findAll();
	}

	@Override
	public Person getPersonById(Integer id) 
	{
		return this.personsDao.getById(id);
	}

	@Override
	public void insertPerson(Person person) 
	{
		this.personsDao.save(person);
	}

	@Override
	public List<Person> getActeurs() {
		return this.personsDao.findByActeur(true);
	}

	@Override
	public List<Person> getProducteurs() {
		return this.personsDao.findByProducteur(true);
	}
}
