package fr.eni.filmotheque.dao;

import java.util.List;

import fr.eni.filmotheque.bo.Genre;

public interface GenresDao {

	public List<Genre> selectAll();
	public void insert(Genre genre);
	public Genre selectById(Integer id);
	
}
