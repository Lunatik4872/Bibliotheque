package app;

public class main {

	public static void main(String[] args) {
		Bibliotheque biblio = new Bibliotheque(50);
		
		biblio.ajouterOuvrage(GenreL.R,"Sans nom","Un mec random","inexistant",2077,"0-76-545-12");
		biblio.getOuv()[0].ajouterExemplaire();
		biblio.getOuv()[0].ajouterExemplaire();
		biblio.getOuv()[0].ajouterExemplaire();
		biblio.ajouterOuvrage(GenreL.R,"Sans nom2","Un mec random 2","inexistant",2077,"0-76-545-12");
		biblio.getOuv()[1].ajouterExemplaire();
		biblio.getOuv()[1].ajouterExemplaire();
		System.out.println(biblio.getOuv()[1]);
		
	}

}
