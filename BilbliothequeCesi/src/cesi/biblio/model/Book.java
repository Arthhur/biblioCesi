package cesi.biblio.model;

public class Book {
	private Long id = 1L ;
	private String titre = "" ;
	private String auteur = "" ;
	private boolean emprunt = false ;
	
	public Book(Long id, String titre, String auteur) {
		this.id = id ;
		this.titre = titre ;
		this.auteur = auteur ;
	}
	

	public Book(Long id, String titre, String auteur, boolean emprunt) {
		this.id = id ;
		this.titre = titre ;
		this.auteur = auteur ;
		this.emprunt = emprunt ;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getTitre() {
		return titre;
	}

	public void setTitre(String titre) {
		this.titre = titre;
	}

	public String getAuteur() {
		return auteur;
	}

	public void setAuteur(String auteur) {
		this.auteur = auteur;
	}
	
	public boolean isEmprunt() {
		return emprunt;
	}

	public void setEmprunt(boolean emprunt) {
		this.emprunt = emprunt;
	}
}
