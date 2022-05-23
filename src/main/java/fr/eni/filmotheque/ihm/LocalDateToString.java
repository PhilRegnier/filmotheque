package fr.eni.filmotheque.ihm;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

import javax.swing.text.DateFormatter;

import org.springframework.core.convert.converter.Converter;
import org.springframework.stereotype.Component;

@Component
public class LocalDateToString implements Converter<LocalDate,String>
{
	@Override
	public String convert(LocalDate source) 
	{
		return source.format(DateTimeFormatter.ofPattern("yyyy-MM-dd"));
	}
}
