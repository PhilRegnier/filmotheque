package fr.eni.filmotheque.bo;

public class Genre {

	private long id;
	private String name;
	
	public Genre() {
	}

	public Genre(long id, String name) {
		this.id = id;
		this.name = name;
	}
	
	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}
}
