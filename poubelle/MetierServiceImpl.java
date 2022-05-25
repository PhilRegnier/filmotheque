package fr.eni.filmotheque.bll;

import java.util.List;
import java.util.Map;

import org.springframework.stereotype.Service;

import fr.eni.filmotheque.bo.Metier;
import fr.eni.filmotheque.dao.MetiersDao;

@Service
public class MetierServiceImpl implements MetierService 
{
	private MetiersDao			metiersDao;
	
	public MetierServiceImpl(MetiersDao	metiersDao) 
	{
		this.metiersDao = metiersDao;	
	}

	@Override
	public List<Metier> getListeMetier() 
	{
		return this.metiersDao.selectAllMetiers();
	}

	@Override
	public Map<Integer, Metier> getMapMetier() 
	{
		return this.metiersDao.getMapMetier();
	}

	@Override
	public Metier selectMetierById(Integer id) 
	{
		return this.metiersDao.selectMetierById(id);
	}
}
