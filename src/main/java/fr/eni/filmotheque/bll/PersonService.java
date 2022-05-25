package fr.eni.filmotheque.bll;

import java.util.List;

import fr.eni.filmotheque.bo.Person;

public interface PersonService 
{
	public List<Person> getPersons();
	public Person 		getPersonById(Integer id);
	public void 		insertPerson(Person person);
	
	public List<Person> getActeurs();
	public List<Person> getProducteurs();
}
