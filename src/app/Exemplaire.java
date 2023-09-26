package app;

public class Exemplaire {
	private boolean empruntable = true;
	private boolean enligne = true;
	private String cote;
	
	public Exemplaire(String cote) {
		this.cote = cote;
	}

	public boolean estEmpruntable() {
		return empruntable;
	}

	public boolean estEnligne() {
		return enligne;
	}

	public String getCote() {
		return cote;
	}

	@Override
	public String toString() {
		return "Exemplaire [empruntable=" + empruntable + ", enligne=" + enligne + ", cote=" + cote + "]";
	}
	

}
