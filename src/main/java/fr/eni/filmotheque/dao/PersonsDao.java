package fr.eni.filmotheque.dao;

import java.util.List;

import fr.eni.filmotheque.bo.Film;
import fr.eni.filmotheque.bo.Person;

public interface PersonsDao 
{
	public List<Person> selectPersonByFilm(Film film);
	public List<Person> selectAllPersons();
	public Person selectPersonById(long id);	
	public void insertPerson(Person person);
}
