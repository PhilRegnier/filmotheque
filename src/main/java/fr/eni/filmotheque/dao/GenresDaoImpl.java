package fr.eni.filmotheque.dao;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.stereotype.Repository;

import fr.eni.filmotheque.bo.Genre;

@Repository
public class GenresDaoImpl implements GenresDao {

	private List<Genre> genres;
	private Map<Integer, Genre> mapGenres;
	
	public GenresDaoImpl() {
		this.genres = new ArrayList<>();
		this.genres.add(new Genre(1,"Science-fiction"));
		this.genres.add(new Genre(2,"Comédie"));
		this.genres.add(new Genre(3,"Drame"));
		
		this.mapGenres = new HashMap<Integer, Genre>();
		this.genres.forEach(g -> this.mapGenres.put(g.getId(), g));
	}
	
	@Override
	public List<Genre> selectAll() {
		return this.genres;
	}

	@Override
	public void insert(Genre genre) {
		this.genres.add(genre);
	}

	@Override
	public Genre selectById(Integer id) {
		return this.mapGenres.get(id);
	}

}
