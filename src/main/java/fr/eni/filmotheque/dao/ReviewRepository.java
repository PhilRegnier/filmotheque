package fr.eni.filmotheque.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import fr.eni.filmotheque.bo.Review;

public interface ReviewRepository extends JpaRepository<Review, Integer> {}
