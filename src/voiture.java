
public class voiture extends terrestre
{
	protected int nbreRoues = 4;
	
	// Constructeur par defaut
	public voiture()
	{
		this.immatriculation = "Inconnu";
		this.marque = "Inconnu";
		this.modele = "Inconnu";
		this.annee = 0;
		this.vitesse = 0;  
	}
	
	// Constructeur paramétré
	public voiture( String immatriculation , String marque , String modele , int annee ,
			int vitesse)
	{
		this.immatriculation = immatriculation;
		this.marque = marque;
		this.modele = modele;
		this.annee =  annee;
		this.vitesse = vitesse; 
	}

	// Getters and setters 
	public int getNbreRoues() 
	{
		return nbreRoues;
	} 

	
	// Methodes de la classe
	public String presentation()
	{ 
		String str = super.presentation() + "Nombre de roues :" + this.nbreRoues + "\n";
		return str;
	}
	
	@Override
	public void demarrer() 
	{
		System.out.println("Je roule sur la terre ferme");
	}
	
	public void usage()
	{
		System.out.println("Je suis un moyen de déplacement sure , rapide "
				+ "et eficace en voie terrestre.");
	}
}
