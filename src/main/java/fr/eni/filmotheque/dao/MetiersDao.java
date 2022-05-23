package fr.eni.filmotheque.dao;

import java.util.List;

import fr.eni.filmotheque.bo.Metier;

public interface MetiersDao 
{
	public List<Metier> selectAllMetiers();
	public Metier 		selectMetierById(long id);
	public void 		insertMetier(Metier metier);
}
