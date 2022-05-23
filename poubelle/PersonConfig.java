package fr.eni.filmotheque.config;

import java.util.List;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import fr.eni.filmotheque.bll.PersonService;
import fr.eni.filmotheque.bo.Person;

@Configuration
public class PersonConfig 
{
	@Bean
	public List<Person> persons(PersonService service)
	{
		return service.getPersons();				
	}
}
