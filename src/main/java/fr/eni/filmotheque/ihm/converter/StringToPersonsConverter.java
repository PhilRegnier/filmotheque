package fr.eni.filmotheque.ihm.converter;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.convert.converter.Converter;
import org.springframework.stereotype.Component;

import fr.eni.filmotheque.bll.PersonService;
import fr.eni.filmotheque.bo.Person;

@Component
public class StringToPersonsConverter implements Converter<String, List<Person>> 
{
	private PersonService service;
	
	@Autowired
	public void setPersonService(PersonService service) {
		this.service = service;
	}

	@Override
	public List<Person> convert(String id) 
	{		
		List<Person> ret = new ArrayList<Person>();
		
		String[] lstId = id.split(",");
		
		for(int iloop=0;iloop<lstId.length;iloop++)
		{				
			ret.add(this.service.getPersonById(Integer.parseInt(lstId[iloop])));
		}
		
		return ret;
	}
}
