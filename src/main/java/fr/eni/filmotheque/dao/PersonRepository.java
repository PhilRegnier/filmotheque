package fr.eni.filmotheque.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import fr.eni.filmotheque.bo.Person;

public interface PersonRepository extends JpaRepository<Person, Integer> {}
