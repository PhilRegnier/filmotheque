package fr.eni.filmotheque.config;

import java.util.List;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.context.annotation.ApplicationScope;

import fr.eni.filmotheque.bll.GenresService;
import fr.eni.filmotheque.bo.Genre;

@Configuration
public class FilmothequeConfig {

	@Bean
	@ApplicationScope
	public List<Genre> genres(GenresService service) {
		return service.getGenres();
	}
	
}
