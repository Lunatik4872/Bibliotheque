package app;

import java.util.Arrays;

public class Ouvrage {
	private static int MAX_EXEMPLAIR = 50;
	
	private String titre; 
	private String auteur;
	private String editeur;
	private int annee;
	private String isbm;
	private int nbex = 0;
	private Exemplaire[] lesExempalires = new Exemplaire[MAX_EXEMPLAIR];
	private String  prefixeCote;
	private GenreL genreL;
	
	public Ouvrage(GenreL genreL, String titre, String auteur, String editeur, int annee, String isbm, String  prefixeCote) {
		this.genreL = genreL;
		this.titre = titre;
		this.auteur = auteur;
		this.editeur = editeur;
		this.annee = annee;
		this.isbm = isbm;
		this.prefixeCote = prefixeCote;
	}

	public static int getMAX_EXEMPLAIR() {
		return MAX_EXEMPLAIR;
	}

	public String getTitre() {
		return titre;
	}

	public String getAuteur() {
		return auteur;
	}

	public String getEditeur() {
		return editeur;
	}

	public int getAnnee() {
		return annee;
	}

	public String getIsbm() {
		return isbm;
	}
	
	public Exemplaire[] getLesExempalires() {
		return lesExempalires;
	}

	public boolean ajouterExemplaire() {
		if(nbex < MAX_EXEMPLAIR) {
			lesExempalires[nbex] = new Exemplaire(prefixeCote + "_" + (nbex+1));
			nbex++;
			return true;
		}
		return false;
	}

	@Override
	public String toString() {
		return "Ouvrage [titre=" + titre + ", auteur=" + auteur + ", editeur=" + editeur + ", annee=" + annee
				+ ", isbm=" + isbm + ", lesExempalires=" + Arrays.toString(lesExempalires) + ", genreL=" + genreL + "]";
	}

}
