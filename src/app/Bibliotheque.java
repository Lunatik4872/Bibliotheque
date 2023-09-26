package app;

import java.util.Arrays;

public class Bibliotheque {
	private Ouvrage[] ouv;
	private int nbouv = 0;
	
	public Bibliotheque(int nbMaxOuvrage) {
		ouv = new Ouvrage[nbMaxOuvrage];
	}

	public Ouvrage[] getOuv() {
		return ouv;
	}

	public void setOuv(Ouvrage[] ouv) {
		this.ouv = ouv;
	}
	
	public boolean ajouterOuvrage(GenreL genreL, String titre, String auteur, String editeur, int annee, String isbm) {
		if (nbouv < ouv.length) {
			ouv[nbouv] = new Ouvrage(genreL, titre,auteur,editeur,annee,isbm,"/"+(nbouv+1));
			nbouv++;
			return true;
		}
		return false;
	}

	@Override
	public String toString() {
		return "Bibliotheque [ouv=" + Arrays.toString(ouv) + ", nbouv=" + nbouv + "]";
	}
}
