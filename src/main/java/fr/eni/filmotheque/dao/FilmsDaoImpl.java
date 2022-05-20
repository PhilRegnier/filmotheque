package fr.eni.filmotheque.dao;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Repository;

import fr.eni.filmotheque.bo.Film;

@Repository
public class FilmsDaoImpl implements FilmsDao  
{
	private List<Film> allFilms;
		
	public FilmsDaoImpl(GenresDao genresDao, PersonsDao personDao,ReviewDao reviewDao) 
	{
		Film filmTmp;
		
		this.allFilms = new ArrayList<Film>();
		
		filmTmp = new Film("Jurassic parc",1993,160,"bblkhq");
		filmTmp.setId(1);		
		filmTmp.setGenre(genresDao.selectById(1));		
		filmTmp.addActor(personDao.selectPersonById(0));
		filmTmp.addActor(personDao.selectPersonById(1));
		filmTmp.addActor(personDao.selectPersonById(2));		
		filmTmp.setDirector(personDao.selectPersonById(3));		
		filmTmp.addReview(reviewDao.selectReviewById(0));		
		this.allFilms.add(filmTmp);
		
		filmTmp = new Film("The fly",1986,260,"blablabla");		
		filmTmp.setId(2);
		filmTmp.setGenre(genresDao.selectById(1));
		filmTmp.addActor(personDao.selectPersonById(2));
		filmTmp.setDirector(personDao.selectPersonById(4));		
		filmTmp.addReview(reviewDao.selectReviewById(1));
		filmTmp.addReview(reviewDao.selectReviewById(3));		
		this.allFilms.add(filmTmp);
		
		filmTmp = new Film("The BFG",2016,654,"truc");
		filmTmp.setId(3);
		filmTmp.setGenre(genresDao.selectById(2));
		filmTmp.addActor(personDao.selectPersonById(0));
		filmTmp.setDirector(personDao.selectPersonById(3));		
		filmTmp.addReview(reviewDao.selectReviewById(2));		
		this.allFilms.add(filmTmp);		
	}

	@Override
	public List<Film> selectAllFilms() {
		return this.allFilms;
	}

	@Override
	public Film selectFilmById(Integer id) {
		int index = (int) (id - 1);
		return this.allFilms.get(index);
	}

	@Override
	public void insertFilm(Film film) {
		this.allFilms.add(film);
	}
	
}
