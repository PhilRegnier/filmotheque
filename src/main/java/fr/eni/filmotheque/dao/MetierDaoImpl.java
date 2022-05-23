package fr.eni.filmotheque.dao;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.stereotype.Repository;

import fr.eni.filmotheque.bo.Metier;

@Repository
public class MetierDaoImpl implements MetiersDao 
{
	private List<Metier> 		metiers;
	private Map<Integer,Metier> mapMetiers;
	
	public MetierDaoImpl() 
	{
		this.metiers = new ArrayList<Metier>();
		
		this.metiers.add(new Metier(1,"Acteur"));
		this.metiers.add(new Metier(2,"Producteur"));
		this.metiers.add(new Metier(3,"Réalisateur"));
		
		mapMetiers = new HashMap<Integer, Metier>();
		metiers.forEach(m -> mapMetiers.put(m.getId(), m));
	}

	@Override
	public List<Metier> selectAllMetiers() 
	{
		return this.metiers;
	}

	@Override
	public Metier selectMetierById(Integer id) 
	{
		return metiers.get((int)id);
	}

	@Override
	public void insertMetier(Metier metier) 
	{
		this.metiers.add(metier);
	}

	@Override
	public Map<Integer, Metier> getMapMetier() 
	{
		return this.mapMetiers;
	}
}
