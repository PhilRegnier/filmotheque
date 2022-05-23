package fr.eni.filmotheque.bll;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import fr.eni.filmotheque.bo.Film;
import fr.eni.filmotheque.dao.FilmRepository;

@Service
public class FilmsServiceImpl implements FilmsService
{
	private FilmRepository filmsDao;
	
	@Autowired
	public FilmsServiceImpl(FilmRepository filmsDao) {
		this.filmsDao = filmsDao;
	}

	@Override
	public List<Film> getFilms() {
		return this.filmsDao.findAll();
	}

	@Override
	public Film getFilmById(Integer id) {
		return this.filmsDao.getById(id);
	}

	@Override
	public void insert(Film film) {
		this.filmsDao.save(film);		
	}	
}
