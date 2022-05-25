package fr.eni.filmotheque.bo;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.validation.constraints.Min;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

@Entity
@Table(name = "Films")
public class Film {
	
	@Id
	@GeneratedValue
	private Integer 	 id;
	
	@Column(length=  100, nullable = false)
	@NotBlank
	@Size(max = 100)
	private String 		 title;
	
	@Column(nullable = false)
	@NotNull
	@Min(1850)
	private Integer 	 releaseYear;
	
	@Column(nullable = false)
	@NotNull
	@Min(1)
	private Integer 	 duration;
	
	@Column(length=  250)
	@Size(min = 20, max = 250)
	private String 		 synopsis;
	
	@ManyToOne
	private Genre 		 genre;
	
	@ManyToMany(fetch = FetchType.EAGER)
	@JoinTable( name = "filmActor",
				joinColumns = {@JoinColumn(name="filmId")},
				inverseJoinColumns = {@JoinColumn(name="personId")})	
	private List<Person> actors = new ArrayList<Person>();
		
	@ManyToOne
	private Person 		 director;
	
	@OneToMany(cascade = {CascadeType.PERSIST},fetch = FetchType.LAZY,orphanRemoval = true)
	private List<Review> reviews = new ArrayList<Review>();

	public Film() {
	}

	public Film(String title, Integer releaseYear, Integer duration, String synopsis) {

		this.title 		 = title;
		this.releaseYear = releaseYear;
		this.duration 	 = duration;
		this.synopsis 	 = synopsis;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public Integer getReleaseYear() {
		return releaseYear;
	}

	public void setReleaseYear(Integer releaseYear) {
		this.releaseYear = releaseYear;
	}

	public Integer getDuration() {
		return duration;
	}

	public void setDuration(Integer duration) {
		this.duration = duration;
	}

	public String getSynopsis() {
		return synopsis;
	}

	public void setSynopsis(String synopsis) {
		this.synopsis = synopsis;
	}

	public Genre getGenre() {
		return genre;
	}

	public void setGenre(Genre genre) {
		this.genre = genre;
	}

	public List<Person> getActors() {
		return actors;
	}

	public void setActors(List<Person> actors) {
		this.actors = actors;
	}

	public void addActor(Person actor) {
		
		this.actors.add(actor);
	}

	public Person getDirector() {
		return director;
	}

	public void setDirector(Person director) {
		this.director = director;
	}

	public List<Review> getReviews() {
		return reviews;
	}

	public void setReviews(List<Review> reviews) {
		this.reviews = reviews;
	}

	public void addReview(Review review) {
		this.reviews.add(review);
	}
}
