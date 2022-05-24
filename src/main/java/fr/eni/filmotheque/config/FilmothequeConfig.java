package fr.eni.filmotheque.config;

import java.util.List;

import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.context.annotation.ApplicationScope;
import org.springframework.web.context.annotation.RequestScope;

import fr.eni.filmotheque.bll.GenresService;
import fr.eni.filmotheque.bll.MetierService;
import fr.eni.filmotheque.bll.PersonService;
import fr.eni.filmotheque.bo.Genre;
import fr.eni.filmotheque.bo.Metier;
import fr.eni.filmotheque.bo.Person;
import fr.eni.filmotheque.dao.GenreRepository;

@Configuration
public class FilmothequeConfig {

	@Bean
	public CommandLineRunner genresStarter(GenreRepository repository) {
		return (args) -> {
			repository.save(new Genre(1, "Drame"));
			repository.save(new Genre(2, "Comédie"));
			repository.save(new Genre(3, "Fantastique"));
			repository.save(new Genre(4, "Horreur"));
			repository.save(new Genre(5, "Comédie musicale"));
		};
	}
	
	@Bean
	@ApplicationScope
	public List<Genre> genres(GenresService service) {
		return service.getGenres();
	}

}
