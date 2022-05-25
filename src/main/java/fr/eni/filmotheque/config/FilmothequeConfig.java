package fr.eni.filmotheque.config;

import java.util.List;

import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.web.context.annotation.ApplicationScope;

import fr.eni.filmotheque.bll.GenresService;
import fr.eni.filmotheque.bo.Genre;
import fr.eni.filmotheque.bo.User;
import fr.eni.filmotheque.dao.GenreRepository;
import fr.eni.filmotheque.dao.UserRepository;

@Configuration
public class FilmothequeConfig {

	@Bean
	public CommandLineRunner genresStarter(GenreRepository genreRepository, UserRepository userRepository, PasswordEncoder passwordEncoder) {
		return (args) -> {
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
		};
	}
	
	@Bean
	@ApplicationScope
	public List<Genre> genres(GenresService service) {
		return service.getGenres();
	}

}
