package fr.eni.filmotheque.ihm;

import java.time.LocalDate;

import org.springframework.core.convert.converter.Converter;
import org.springframework.stereotype.Component;

@Component
public class StringToLocalDate implements Converter<String,LocalDate>
{
	@Override
	public LocalDate convert(String source) 
	{
		return LocalDate.parse(source);
	}
}
