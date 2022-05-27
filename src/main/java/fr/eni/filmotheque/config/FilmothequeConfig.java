package fr.eni.filmotheque.config;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.List;

import fr.eni.filmotheque.bo.*;
import fr.eni.filmotheque.dao.*;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.web.context.annotation.ApplicationScope;

import fr.eni.filmotheque.bll.GenresService;

@Configuration
public class FilmothequeConfig 
{	
	@Bean
	public CommandLineRunner genresStarter
			(
			GenreRepository genreRepository,
			PersonRepository personRepository,
			FilmRepository filmRepository,
			ReviewRepository reviewRepository,
			UserRepository userRepository,
			PasswordEncoder passwordEncoder
			)
	{
		return (args) -> {
			genreRepository.save(new Genre("Drame"));
			genreRepository.save(new Genre("Comédie"));
			genreRepository.save(new Genre("Fantastique"));
			genreRepository.save(new Genre("Horreur"));
			genreRepository.save(new Genre("Comédie musicale"));
			genreRepository.save(new Genre("Documentaire"));
			genreRepository.save(new Genre("Comédie dramatique"));
			genreRepository.save(new Genre("Science-fiction"));
			genreRepository.save(new Genre("Thriller"));

			Genre genre = new Genre("Policier");
			genreRepository.save(genre);

			User user = new User(
					"admin",
					"John",
					"Doe",
					passwordEncoder.encode("admin"),
					"admin@eni.fr",
					true);

			userRepository.save(user);

			personRepository.save(new Person("jean-Paul","Belmondo",LocalDate.now()));
			personRepository.save(new Person("Jean","Dujardin",LocalDate.now()));
			personRepository.save(new Person("Gérard","Depardieu",LocalDate.now()));
			personRepository.save(new Person("Vincent","Cassel",LocalDate.now()));

			Person realisateur = new Person("Jean-Pierre", "Melville", LocalDate.now());
			Person acteur = new Person("Alain","Delon",LocalDate.now());

			Film film = new Film(
					"Le samouraï",
					1967,
					105,
					"Après que Jef Costello, tueur à gages professionnel, est vu par des témoins, ses efforts pour se procurer un alibi l'acculent davantage.");

			film.setGenre(genre);
			film.setDirector(realisateur);
			film.setActor(acteur);

			Review review = new Review(
					"Un super polar dramatique avec le fringuant Alain Delon.",
					4,
					LocalDateTime.now());

			review.setFilm(film);
			review.setUser(user);

			personRepository.save(realisateur);
			personRepository.save(acteur);
			filmRepository.save(film);
			reviewRepository.save(review);
		};
	}
	
	@Bean
	@ApplicationScope
	public List<Genre> genres(GenresService service) {
		return service.getGenres();
	}
}
