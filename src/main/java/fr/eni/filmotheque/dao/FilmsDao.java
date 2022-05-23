package fr.eni.filmotheque.dao;

import java.util.List;

import fr.eni.filmotheque.bo.Film;

public interface FilmsDao {
	
	public List<Film> selectAllFilms();
	public Film selectFilmById(Integer id);
	public void insert(Film film);
}
