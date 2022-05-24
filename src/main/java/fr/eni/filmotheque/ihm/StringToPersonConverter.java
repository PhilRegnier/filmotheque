package fr.eni.filmotheque.ihm;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.convert.converter.Converter;
import org.springframework.stereotype.Component;

import fr.eni.filmotheque.bll.PersonServiceImpl;
import fr.eni.filmotheque.bo.Person;

@Component
public class StringToPersonConverter implements Converter<String, Person> {

	private PersonServiceImpl service;
	
	@Autowired
	public void setPersonService(PersonServiceImpl service) {
		this.service = service;
	}

	@Override
	public Person convert(String id) {
		return this.service.getPersonById(Integer.parseInt(id));
	}
}
