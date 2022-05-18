package fr.eni.filmotheque.bo;

import java.util.List;

public class Film 
{
	private long 	id;
	private String 	title;
	private long 	releaseYear;
	private long 	duration;
	private String	synopsis;
	private Genre	genre;
	private List<Person> person;
	private Person 	director;
	private List<Review>	reviews;
	
	
	public Film() {
		super();
	}
		
	public Film(String title, long releaseYear, long duration, String synopsis) {
		super();
		this.title = title;
		this.releaseYear = releaseYear;
		this.duration = duration;
		this.synopsis = synopsis;
	}

	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public long getReleaseYear() {
		return releaseYear;
	}
	public void setReleaseYear(long releaseYear) {
		this.releaseYear = releaseYear;
	}
	public long getDuration() {
		return duration;
	}
	public void setDuration(long duration) {
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
	public List<Person> getPerson() {
		return person;
	}
	public void setPerson(List<Person> person) {
		this.person = person;
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
