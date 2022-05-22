package fr.eni.filmotheque.dao;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Repository;

import fr.eni.filmotheque.bo.Metier;

@Repository
public class MetierDaoImpl implements MetiersDao 
{

	List<Metier> metiers;
	
	public MetierDaoImpl() 
	{
		this.metiers = new ArrayList<Metier>();
		
		this.metiers.add(new Metier(1,"Acteur"));
		this.metiers.add(new Metier(2,"Producteur"));
		this.metiers.add(new Metier(3,"Réalisateur"));		
	}

	@Override
	public List<Metier> selectAllMetiers() 
	{
		return this.metiers;
	}

	@Override
	public Metier selectMetierById(long id) 
	{
		return metiers.get((int)id);
	}

	@Override
	public void insertMetier(Metier metier) 
	{
		this.metiers.add(metier);
	}
}
