package fr.eni.filmotheque.bo;

import java.util.ArrayList;
import java.util.List;

public class Film {
	private Integer 	 id;
	private String 		 title;
	private Integer 	 releaseYear;
	private Integer 	 duration;
	private String 		 synopsis;
	private Genre 		 genre;
	private List<Person> actors;
	private Person 		 director;
	private List<Review> reviews;

	public Film() {
	}

	public Film(String title, Integer releaseYear, Integer duration, String synopsis) {
		this.title 		 = title;
		this.releaseYear = releaseYear;
		this.duration 	 = duration;
		this.synopsis 	 = synopsis;

		this.actors 	 = new ArrayList<Person>();
		this.reviews 	 = new ArrayList<Review>();
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

	public void setActor(List<Person> actors) {
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
}
