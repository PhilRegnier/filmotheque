package fr.eni.filmotheque.bll;

import java.util.List;

import fr.eni.filmotheque.bo.Genre;

public interface GenresService {

	public List<Genre> getGenres();
	public Genre getGenre(Integer id);
	
}
