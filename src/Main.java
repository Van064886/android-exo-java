
public class Main 
{

	public static void main(String[] args) 
	{
		// Voiture
		voiture v = new voiture();
		System.out.println(v.presentation());
		voiture v1 = new voiture("0556NBHU47" , "RAVA" , "711P" , 2004 , 15);
		System.out.println(v1.presentation());
		v1.demarrer();
		v1.lieuDeplacement();
		v1.usage();
		// Voilier
		voilier p = new voilier();
		System.out.println(p.presentation());
		voilier p1 = new voilier("0CECE856VE" , "BLISS" , "AF11P" , 2005 , 32);
		System.out.println(p1.presentation());
		p1.demarrer();
		p1.lieuDeplacement();
		p1.usage();
		// Croiseur
		croiseur x = new croiseur();
		System.out.println(x.presentation());
		voilier x1 = new voilier("CXE5757" , "RAVA" , "KOL6" , 2004 , 80);
		System.out.println(x1.presentation());
		x1.demarrer();
		x1.lieuDeplacement();
		x1.usage();
	}

}
