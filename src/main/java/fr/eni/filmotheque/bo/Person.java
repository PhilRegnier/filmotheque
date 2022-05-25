package fr.eni.filmotheque.bo;

import java.time.LocalDate;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

@Entity
@Table(name = "Persons")
public class Person 
{
	@Id
	@GeneratedValue
	private Integer id;
	
	@Column(length = 20, nullable = false)
	@NotBlank(message = "Le prenom est obligatoire")
	@Size(min=1,max=20)
	private String firstName;
	
	@Column(length = 50, nullable = false)
	@NotBlank(message 	= "Le nom est obligatoire")
	@Size(min=1,max=50)
	private String lastName;
	
	@Column(nullable = false)
	@NotNull(message = "La date est obligatoire")
	private LocalDate birthday;
		
	@ManyToMany(mappedBy="actors")
	private List<Film> playedFilms;
	
	@OneToMany(cascade = {CascadeType.PERSIST},
			mappedBy="director")
	private List<Film> directedFilms;
	
<<<<<<< HEAD
	public Person() {}
=======
	public Person()	{ }
>>>>>>> branch 'master' of https://github.com/PhilRegnier/filmotheque.git

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
	}
}
