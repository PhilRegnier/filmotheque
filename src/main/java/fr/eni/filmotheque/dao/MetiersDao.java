package fr.eni.filmotheque.dao;

import java.util.List;
import java.util.Map;

import fr.eni.filmotheque.bo.Metier;

public interface MetiersDao 
{
	public List<Metier> 		selectAllMetiers();
	public Metier 				selectMetierById(Integer id);
	public void 				insertMetier(Metier metier);
	public Map<Integer,Metier> 	getMapMetier();
}
