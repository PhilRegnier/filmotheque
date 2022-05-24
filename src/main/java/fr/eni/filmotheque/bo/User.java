package fr.eni.filmotheque.bo;

import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Transient;


@Entity
@Table(name = "Users")
public class User 
{
	@Id
	@GeneratedValue

	private Integer id;

	@Column(length = 20, nullable = false)
	private String pseudo;
	
	@Column(length = 50, nullable = false)
	private String			firstName;
	
	@Column(length = 50, nullable = false)
	private String			lastName;
	
	@Column(length = 20, nullable = false)
	private String password;
	
	@Column(length = 80, nullable = false)
	private String email;
	
	@Column(columnDefinition = "boolean default false")
	private Boolean admin;
	
	@Transient
	private List<Review> reviews;
	
	public User() {
		super();
	}

	public User(String pseudo, String firstname, String lastname, String password, String email, Boolean admin) {
		super();
		this.pseudo = pseudo;
		this.firstName = firstname;
		this.lastName = lastname;
		this.password = password;
		this.email = email;
		this.admin = admin;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getPseudo() {
		return pseudo;
	}

	public void setPseudo(String pseudo) {
		this.pseudo = pseudo;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstname) {
		this.firstName = firstname;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastname) {
		this.lastName = lastname;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public Boolean getAdmin() {
		return admin;
	}

	public void setAdmin(Boolean admin) {
		this.admin = admin;
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
