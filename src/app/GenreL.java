package app;

public enum GenreL {
	R("roman"),RP("roman policier"),SF("roman fantasy / science-fiction"),T("théâtre"), S("Savoir");
		
	private String nom;
		
	private GenreL(String nom) {
		this.nom = nom;
	}
	
}
