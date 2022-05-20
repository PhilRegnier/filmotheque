package fr.eni.filmotheque.bll;

import java.util.List;

import fr.eni.filmotheque.bo.Film;

public interface FilmsService 
{
	public List<Film> getFilms();
	public Film getFilmById(Integer id);
	public void insertFilm(Film film);
}
