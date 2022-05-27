package fr.eni.filmotheque.bo;

import java.time.LocalDateTime;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import javax.persistence.Transient;

@Entity
@Table(name = "Reviews")
public class Review 
{
	@Id
	@GeneratedValue
	private Integer			id;
	
	@Column(nullable = true)
	private String			comment;
	
	@Column(nullable = true)
	private Integer 		rating;
	
	@Column(nullable = true)
	private	LocalDateTime	date;
	
	@ManyToOne
	private	User			user;
	
	@ManyToOne
	private	Film film;
	
	public Review(){
	}

	public Review(String comment, Integer rating, LocalDateTime date) 
	{
		this.comment = comment;
		this.rating = rating;
		this.date = date;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getComment() {
		return comment;
	}

	public void setComment(String comment) {
		this.comment = comment;
	}

	public Integer getRating() {
		return rating;
	}

	public void setRating(Integer rating) {
		this.rating = rating;
	}

	public LocalDateTime getDate() {
		return date;
	}

	public void setDate(LocalDateTime date) {
		this.date = date;
	}

	public Film getFilm() {
		return film;
	}

	public void setFilm(Film film) {
		this.film = film;
	}

	public User getUser() {
		return user;
	}

	public void setUser(User user) {
		this.user = user;
	}		
}
