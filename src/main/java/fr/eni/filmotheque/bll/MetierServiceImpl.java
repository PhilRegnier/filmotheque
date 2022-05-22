package fr.eni.filmotheque.bll;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.stereotype.Service;

import fr.eni.filmotheque.bo.Metier;

@Service
public class MetierServiceImpl implements MetierService 
{
	private List<Metier> 		metiers;
	private Map<Integer,Metier> mapMetiers;
	
	public MetierServiceImpl() 
	{
		metiers = new ArrayList<Metier>();
		metiers.add(new Metier(1,"Acteur"));
		metiers.add(new Metier(2,"Réalisateur"));
		
		mapMetiers = new HashMap<Integer, Metier>();
		metiers.forEach(m->mapMetiers.put(m.getId(), m));
	}

	@Override
	public List<Metier> getListeMetier() 
	{
		return metiers;
	}

	@Override
	public Map<Integer, Metier> getMapMetier() 
	{
		return mapMetiers;
	}
}
