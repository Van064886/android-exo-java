EXERCICE
	IL s'agit de construire une classe abstraite nommé vehicule et possédant les propriétés suivantes : 
	immatriculation , marque ,modele , annee , vitesse .Cette classe possède la méthode presentation 
	qui retourne une chaine de caractères et la méthode abstraite demarrer qui ne retournera rien.
	Il a deux classes filles ( marin et terrestre ) qui sont abstraites et quib ont une méthode 
	lieuDeplacement qui affiche juste un  texte a l'ecran.
	La classe terrestre possède une classe fille du nom de voiture.Cette dernière dispose d'une 
	propriété constante nbreRoues.Vous aurez a redefinir la méthode presentation en fonction 
	du nouvel attribut de cette classe et de rediger la fonction demarrer a ce niveau.
    Cette classe implémente une interface usages qui possède une fonction usage.
    La classe marin possède deux classes filles ( voilier , croiseur ).Elles disposent d'une propriété 
    hauteurMin et redefinissent les methodes presentation et demarrer.Elles disposent d'une methode 
    usage qu'ils héritent de l'interface usages.
