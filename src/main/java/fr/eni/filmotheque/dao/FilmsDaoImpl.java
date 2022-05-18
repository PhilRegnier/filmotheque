package fr.eni.filmotheque.dao;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Repository;

import fr.eni.filmotheque.bo.Film;

@Repository
public class FilmsDaoImpl implements FilmsDao  
{
	private List<Film> allFilms;
		
	public FilmsDaoImpl(GenresDao genresDao) 
	{
		Film filmTmp;
		
		this.allFilms = new ArrayList<Film>();
		
		filmTmp = new Film("Jurassic parc",1993,160,"bblkhq");
		filmTmp.setId(1);
		filmTmp.setGenre(genresDao.selectById(1));
		this.allFilms.add(filmTmp);
		
		filmTmp = new Film("The fly",1986,260,"blablabla");		
		filmTmp.setId(2);
		filmTmp.setGenre(genresDao.selectById(1));
		this.allFilms.add(filmTmp);
		
		filmTmp = new Film("The BFG",2016,654,"truc");
		filmTmp.setId(3);
		filmTmp.setGenre(genresDao.selectById(2));
		this.allFilms.add(filmTmp);
	}

	@Override
	public List<Film> selectAllFilms() {
		// TODO Auto-generated method stub
		return this.allFilms;
	}

	@Override
	public Film selectFilmById(long id) {
		int index = (int) (id - 1);
		return this.allFilms.get(index);
	}

	@Override
	public void insertFilm(Film film) {
		this.allFilms.add(film);
	}
	
}
