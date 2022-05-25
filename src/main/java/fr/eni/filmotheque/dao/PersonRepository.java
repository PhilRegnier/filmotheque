package fr.eni.filmotheque.dao;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import fr.eni.filmotheque.bo.Person;

public interface PersonRepository extends JpaRepository<Person, Integer> {
	
	public List<Person> findByActeur(Boolean acteur);
	public List<Person> findByProducteur(Boolean producteur);
}
