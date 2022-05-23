package fr.eni.filmotheque.ihm;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.convert.converter.Converter;
import org.springframework.stereotype.Component;

import fr.eni.filmotheque.bll.GenresServiceImpl;
import fr.eni.filmotheque.bo.Genre;

@Component
public class StringToGenreConverter implements Converter<String, Genre> {

	private GenresServiceImpl service;
	
	@Autowired
	public void setGenreService(GenresServiceImpl service) {
		this.service = service;
	}

	@Override
	public Genre convert(String id) {
		return this.service.getGenre(Integer.parseInt(id));
	}

}
