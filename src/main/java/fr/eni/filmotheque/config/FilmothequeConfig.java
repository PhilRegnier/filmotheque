package fr.eni.filmotheque.config;

import java.time.LocalDate;
import java.util.List;

import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.web.context.annotation.ApplicationScope;

import fr.eni.filmotheque.bll.GenresService;
import fr.eni.filmotheque.bo.Genre;
<<<<<<< HEAD
import fr.eni.filmotheque.bo.User;
=======
import fr.eni.filmotheque.bo.Person;
>>>>>>> branch 'master' of https://github.com/PhilRegnier/filmotheque.git
import fr.eni.filmotheque.dao.GenreRepository;
<<<<<<< HEAD
import fr.eni.filmotheque.dao.UserRepository;
=======
import fr.eni.filmotheque.dao.PersonRepository;
>>>>>>> branch 'master' of https://github.com/PhilRegnier/filmotheque.git

@Configuration
public class FilmothequeConfig 
{	
	@Bean
<<<<<<< HEAD
	public CommandLineRunner genresStarter(GenreRepository genreRepository, UserRepository userRepository, PasswordEncoder passwordEncoder) {
=======
	public CommandLineRunner genresStarter(GenreRepository repository,PersonRepository perRepo) {
>>>>>>> branch 'master' of https://github.com/PhilRegnier/filmotheque.git
		return (args) -> {
<<<<<<< HEAD
			genreRepository.save(new Genre(1, "Drame"));
			genreRepository.save(new Genre(2, "Comédie"));
			genreRepository.save(new Genre(3, "Fantastique"));
			genreRepository.save(new Genre(4, "Horreur"));
			genreRepository.save(new Genre(5, "Comédie musicale"));
			genreRepository.save(new Genre(6, "Documentaire"));
			genreRepository.save(new Genre(7, "Comédie dramatique"));
			genreRepository.save(new Genre(8, "Science-fiction"));
			genreRepository.save(new Genre(9, "Thriller"));
			genreRepository.save(new Genre(9, "Policier"));
			
			User admin = new User();
			admin.setId(1);
			admin.setPseudo("admin");
			admin.setFirstName("John");
			admin.setLastName("Doe");
			admin.setEmail("admin@eni.fr");
			admin.setPassword(passwordEncoder.encode("admin"));
			admin.setAdmin(true);
			
			userRepository.save(admin);
=======
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
>>>>>>> branch 'master' of https://github.com/PhilRegnier/filmotheque.git
		};
	}
	
	@Bean
	@ApplicationScope
	public List<Genre> genres(GenresService service) {
		return service.getGenres();
	}
}
