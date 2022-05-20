package fr.eni.filmotheque.bll;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import fr.eni.filmotheque.bo.Genre;
import fr.eni.filmotheque.dao.GenresDao;

@Service
public class GenresServiceImpl implements GenresService {
	
	private GenresDao genresDao;
	
	@Autowired
	public GenresServiceImpl(GenresDao genresDao) {
		this.genresDao = genresDao;
	}
	@Override
	public List<Genre> getGenres() {
		return genresDao.selectAll();
	}

	@Override
	public Genre getGenre(Integer id) {
		return this.genresDao.selectById(id);
	}

}
