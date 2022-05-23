package fr.eni.filmotheque.bo;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "Genres")
public class Genre {

	@Id
	@GeneratedValue
	private Integer id;
	
	@Column(length = 30, nullable = false)
	private String name;
	
	public Genre() {
	}

	public Genre(Integer id, String name) {
		this.id = id;
		this.name = name;
	}
	
	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}
}
