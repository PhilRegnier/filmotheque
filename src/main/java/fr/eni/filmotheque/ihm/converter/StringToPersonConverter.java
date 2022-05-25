package fr.eni.filmotheque.ihm.converter;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.convert.converter.Converter;
import org.springframework.stereotype.Component;

import fr.eni.filmotheque.bll.PersonService;
import fr.eni.filmotheque.bo.Person;

@Component
public class StringToPersonConverter implements Converter<String, Person> {

	private PersonService service;
	
	@Autowired
	public void setPersonService(PersonService service) {
		this.service = service;
	}

	@Override
	public Person convert(String id) {		
		return this.service.getPersonById(Integer.parseInt(id));
	}
}
