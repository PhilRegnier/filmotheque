package fr.eni.filmotheque.bo;

import java.time.LocalDate;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;

public class Person 
{
	private Integer 		id;
	
	@NotBlank(message 	= "Le prenom est obligatoire")
	@NotNull(message 	= "Le prenom est obligatoire")
	@NotEmpty(message 	= "Le prenom est obligatoire")
	private String 			firstName;
	
	@NotBlank(message 	= "Le nom est obligatoire")
	@NotNull(message 	= "Le nom est obligatoire")
	@NotEmpty(message 	= "Le nom est obligatoire")
	private String 			lastName;
	
	@NotNull(message = "La date est obligatoire")
	private LocalDate	 	birthday;
	
	private Metier			metier;
	//private List<Film> 		playedFilms;
	//private List<Film> 		directedFilms;
	
	public Person() 
	{
		//this.playedFilms = new ArrayList<>();
		//this.directedFilms = new ArrayList<>();
	}

	public Person(String firstName, String lastName, LocalDate birthday) {
		this();
		this.firstName = firstName;
		this.lastName  = lastName;
		this.birthday  = birthday;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public LocalDate getBirthday() {
		return birthday;
	}

	public void setBirthday(LocalDate birthday) {
		this.birthday = birthday;
	}

	public Metier getMetier() {
		return metier;
	}

	public void setMetier(Metier metier) {
		this.metier = metier;
	}
		
/*
	public List<Film> getPlayedFilms() {
		return playedFilms;
	}

	public void setPlayedFilms(List<Film> playedFilms) {
		this.playedFilms = playedFilms;
	}

	public List<Film> getDirectedFilms() {
		return directedFilms;
	}

	public void setDirectedFilms(List<Film> directedFilms) {
		this.directedFilms = directedFilms;
	}
	
	public void addPlayedFilm(Film film)
	{
		this.playedFilms.add(film);
	}
	
	public void addDirectedFilm(Film film)
	{
		this.directedFilms.add(film);
	}*/
}
