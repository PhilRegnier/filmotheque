package fr.eni.filmotheque.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import fr.eni.filmotheque.bo.User;

public interface UserRepository extends JpaRepository<User, Integer>{
	
	//public User getByPseudoOrEmail(String pseudo,String email);
}
