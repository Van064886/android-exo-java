
public abstract class vehicule 
{
	protected String immatriculation;
	protected String marque;
	protected String modele;
	protected int annee;
	protected int vitesse;
	
	// Getters && setters
	public String getImmatriculation() 
	{
		return immatriculation;
	}
	public String getMarque() 
	{
		return marque;
	}
	public String getModele() 
	{
		return modele;
	}
	public int getAnnee() 
	{
		return annee;
	}
	public int getVitesse() 
	{
		return vitesse;
	}
	public void setVitesse(int vitesse) 
	{
		this.vitesse = vitesse;
	}
	public void setImmatriculation(String immatriculation) 
	{
		this.immatriculation = immatriculation;
	}
	public void setMarque(String marque) 
	{
		this.marque = marque;
	}
	public void setModele(String modele) 
	{
		this.modele = modele;
	}
	public void setAnnee(int annee) 
	{
		this.annee = annee;
	}
	
	
	// Methodes de la classe
	protected String presentation()
	{
		String str = "***********PRESENTATION**************\n" +  
				"Immatriculation : " + this.immatriculation +"\n" + 
				"Marque : " + this.marque +"\n" +
				"Modèle : " + this.modele +"\n" +
				"Année : " + this.annee +"\n" +
				"Vitesse : " + this.vitesse  + "km/h" +"\n";
		return str;
	}
	protected abstract void demarrer();
	
}
