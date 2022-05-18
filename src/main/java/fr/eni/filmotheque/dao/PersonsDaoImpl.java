package fr.eni.filmotheque.dao;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.List;

import org.springframework.stereotype.Repository;

import fr.eni.filmotheque.bo.Film;
import fr.eni.filmotheque.bo.Person;

@Repository
public class PersonsDaoImpl implements PersonsDao  
{
	private List<Person> persons;
		
	public PersonsDaoImpl() {
		
		Person personTmp;
		
		personTmp = new Person("Sam","Neill",LocalDate.of(1947, 9, 14));
		personTmp.setId(1);		
		this.persons.add(personTmp);
		
		personTmp = new Person("Laura","Dern",LocalDate.of(1967, 2, 10));
		personTmp.setId(2);		
		this.persons.add(personTmp);
		
		personTmp = new Person("Jeff","Goldblum",LocalDate.of(1952, 10, 22));
		personTmp.setId(3);		
		this.persons.add(personTmp);
		
		
		
		personTmp = new Person("Steven","Spielberg",LocalDate.of(1946, 12, 18));
		personTmp.setId(4);		
		this.persons.add(personTmp);
		
		personTmp = new Person("David","Cronenberg",LocalDate.of(1943, 3, 15));
		personTmp.setId(5);		
		this.persons.add(personTmp);
	}
	
	public List<Person> getPersons() {
		return persons;
	}

	public void setPerson(List<Person> persons) {
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
	public Person selectPersonById(long id) {
		
		return this.persons.get(0);
	}

}
