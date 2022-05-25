package fr.eni.filmotheque.bo;

public class Metier 
{
	private Integer id;
	private String 	libelle;
	
	public Metier() 
	{	}
	
	public Metier(Integer id, String libelle) 
	{
		this.id 	 = id;
		this.libelle = libelle;
	}

	public Integer getId() 
	{
		return id;
	}

	public void setId(Integer id) 
	{
		this.id = id;
	}

	public String getLibelle() 
	{
		return libelle;
	}

	public void setLibelle(String libelle) 
	{
		this.libelle = libelle;
	}
}
