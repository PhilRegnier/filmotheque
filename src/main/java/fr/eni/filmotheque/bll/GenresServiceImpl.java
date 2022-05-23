package fr.eni.filmotheque.bll;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import fr.eni.filmotheque.bo.Genre;
import fr.eni.filmotheque.dao.GenreRepository;

@Service
public class GenresServiceImpl implements GenresService {
	
	private GenreRepository genresDao;
	
	@Autowired
	public GenresServiceImpl(GenreRepository genresDao) {
		this.genresDao = genresDao;
	}
	@Override
	public List<Genre> getGenres() {
		return genresDao.findAll();
	}

	@Override
	public Genre getGenre(Integer id) {
		return this.genresDao.getById(id);
	}

}
