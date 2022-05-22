package fr.eni.filmotheque.bll;

import java.util.List;
import java.util.Map;

import fr.eni.filmotheque.bo.Metier;

public interface MetierService 
{
	public List<Metier> 		getListeMetier();
	public Map<Integer,Metier> 	getMapMetier();
}
