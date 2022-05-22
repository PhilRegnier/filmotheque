package fr.eni.filmotheque.config;

import java.util.List;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import fr.eni.filmotheque.bll.MetierService;
import fr.eni.filmotheque.bo.Metier;

@Configuration
public class MetierConfig 
{
	@Bean
	public List<Metier> metiers(MetierService service)
	{
		return service.getListeMetier();				
	}
}
