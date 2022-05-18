package fr.eni.filmotheque.dao;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Repository;

import fr.eni.filmotheque.bo.Genre;

@Repository
public class GenresDaoImpl implements GenresDao {

	private List<Genre> genres;
	
	public GenresDaoImpl() {
		this.genres = new ArrayList<>();
		
		this.genres.add(new Genre(1,"Science-fiction"));
		this.genres.add(new Genre(2,"Comédie"));
	}
	
	@Override
	public List<Genre> selectAll() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void insert(Genre genre) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public Genre selectById(long id) {
		int index = (int) (id - 1);
		return this.genres.get(index);
	}

}
