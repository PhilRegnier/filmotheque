package fr.eni.filmotheque.bll;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import fr.eni.filmotheque.bo.Film;
import fr.eni.filmotheque.dao.FilmsDao;

@Service
public class FilmsServiceImpl implements FilmsService
{
	private FilmsDao filmsDao;	
	
	@Autowired
	public FilmsServiceImpl(FilmsDao filmsDao) {
		this.filmsDao = filmsDao;
	}

	@Override
	public List<Film> getFilms() {
		return this.filmsDao.selectAllFilms();
	}

	@Override
	public Film getFilmById(long id) {
		
		return this.filmsDao.selectFilmById(id);
	}

	@Override
	public void insertFilm(Film film) {
		this.filmsDao.insertFilm(film);		
	}

}
