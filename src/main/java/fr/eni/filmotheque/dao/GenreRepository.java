package fr.eni.filmotheque.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import fr.eni.filmotheque.bo.Genre;


public interface GenreRepository extends JpaRepository<Genre, Integer> {}
