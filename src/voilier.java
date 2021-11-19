
public class voilier extends marin implements usages
{
	protected int hauteurMin = 100;
	
	// Constructeur par defaut
	public voilier()
	{
		this.immatriculation = "Inconnu";
		this.marque = "Inconnu";
		this.modele = "Inconnu";
		this.annee = 0;
		this.vitesse = 0;  
	}
	
	// Constructeur paramétré
	public voilier( String immatriculation , String marque , String modele , int annee ,
			int vitesse)
	{
		this.immatriculation = immatriculation;
		this.marque = marque;
		this.modele = modele;
		this.annee =  annee;
		this.vitesse = vitesse; 
	}

	// Getters and setters 
	public int getHauteurMin() 
	{
		return hauteurMin;
	} 

	
	// Methodes de la classe
	public String presentation()
	{ 
		String str = super.presentation() + "Hauteur minimale :" + this.hauteurMin + "m" + "\n";
		return str;
	}
	
	@Override
	public void demarrer() 
	{
		System.out.println("Je vogue sur les océans");
	}
	
	public void usage()
	{
		System.out.println("Je suis un navire d'explorations");
	}
}
