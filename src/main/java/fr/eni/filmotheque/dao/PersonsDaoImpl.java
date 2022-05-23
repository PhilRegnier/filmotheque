package fr.eni.filmotheque.dao;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Repository;

import fr.eni.filmotheque.bo.Film;
import fr.eni.filmotheque.bo.Person;

@Repository
public class PersonsDaoImpl implements PersonsDao  
{
	private List<Person> persons;
		
	public PersonsDaoImpl(MetiersDao metierDao) {
		
		this.persons = new ArrayList<Person>(); 
				
		Person personTmp;
		
		personTmp = new Person("Sam","Neill",LocalDate.of(1947, 9, 14));
		personTmp.setId(1);
		personTmp.setMetier(metierDao.selectMetierById(0));
		this.persons.add(personTmp);
		
		personTmp = new Person("Laura","Dern",LocalDate.of(1967, 2, 10));
		personTmp.setId(2);
		personTmp.setMetier(metierDao.selectMetierById(0));		
		this.persons.add(personTmp);
		
		personTmp = new Person("Jeff","Goldblum",LocalDate.of(1952, 10, 22));
		personTmp.setId(3);
		personTmp.setMetier(metierDao.selectMetierById(0));		
		this.persons.add(personTmp);
		
		personTmp = new Person("Steven","Spielberg",LocalDate.of(1946, 12, 18));
		personTmp.setId(4);
		personTmp.setMetier(metierDao.selectMetierById(2));		
		this.persons.add(personTmp);
		
		personTmp = new Person("David","Cronenberg",LocalDate.of(1943, 3, 15));
		personTmp.setId(5);
		personTmp.setMetier(metierDao.selectMetierById(0));		
		this.persons.add(personTmp);
		
	}
	
	@Override
	public List<Person> selectAllPersons() {
		return this.persons;
	}

	public void setPerson(List<Person> persons) 
	{
		this.persons = persons;
	}

	@Override
	public List<Person> selectPersonByFilm(Film film) {
		return null;
	}

	@Override
	public void insertPerson(Person person) {
		this.persons.add(person);
	}

	@Override
	public Person selectPersonById(Integer id) {
		return this.persons.get(0);
	}
}
