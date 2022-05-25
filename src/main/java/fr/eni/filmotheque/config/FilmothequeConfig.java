package fr.eni.filmotheque.config;

import java.time.LocalDate;
import java.util.List;

import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.context.annotation.ApplicationScope;

import fr.eni.filmotheque.bll.GenresService;
import fr.eni.filmotheque.bo.Genre;
import fr.eni.filmotheque.bo.Person;
import fr.eni.filmotheque.dao.GenreRepository;
import fr.eni.filmotheque.dao.PersonRepository;

@Configuration
public class FilmothequeConfig 
{	
	@Bean
	public CommandLineRunner genresStarter(GenreRepository repository,PersonRepository perRepo) {
		return (args) -> {
			repository.save(new Genre(1, "Drame"));
			repository.save(new Genre(2, "Comédie"));
			repository.save(new Genre(3, "Fantastique"));
			repository.save(new Genre(4, "Horreur"));
			repository.save(new Genre(5, "Comédie musicale"));
			
			perRepo.save(new Person("Alain","Delon",LocalDate.now()));
			perRepo.save(new Person("jean-Paul","Belmondo",LocalDate.now()));
			perRepo.save(new Person("Jean","Dujardin",LocalDate.now()));
			perRepo.save(new Person("Gérard","Depardieu",LocalDate.now()));
			perRepo.save(new Person("Vincent","Cassel",LocalDate.now()));			
		};
	}
	
	@Bean
	@ApplicationScope
	public List<Genre> genres(GenresService service) {
		return service.getGenres();
	}
}
