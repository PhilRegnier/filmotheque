package fr.eni.filmotheque.ihm.converter;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.convert.converter.Converter;
import org.springframework.stereotype.Component;

import fr.eni.filmotheque.bll.MetierServiceImpl;
import fr.eni.filmotheque.bo.Metier;

@Component
public class StringToMetierConverter implements Converter<String, Metier>
{
	private MetierServiceImpl service;
	
	@Autowired
	public void setMetierService(MetierServiceImpl service)
	{
		this.service = service;
	}
	
	public Metier convert(String id)
	{
		Integer theid = Integer.parseInt(id);
		
		return service.getMapMetier().get(theid);
	}
}
