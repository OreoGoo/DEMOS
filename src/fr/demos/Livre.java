package fr.demos;

public class Livre extends Article {
	
	private String Titre;
	private String Auteur;
	private String Editeur;
	private String Genre;
	private String date;
	/**
	 * @param unPrixHT
	 * @param uneDescription
	 * @param uneReference
	 * @param unStock
	 * @param titre
	 * @param auteur
	 * @param editeur
	 * @param genre
	 */
	public Livre(int unPrixHT, String uneDescription, String uneReference, int unStock, String unTitre, String unAuteur,
			String unEditeur, String unGenre) {
		super(unPrixHT, uneDescription, uneReference, unStock);
		this.Titre = unTitre;
		this.Auteur = unAuteur;
		this.Editeur = unEditeur;
		this.Genre = unGenre;
	}
	public String getTitre() {
		return Titre;
	}
	public void setTitre(String titre) {
		Titre = titre;
	}
	public String getAuteur() {
		return Auteur;
	}
	public void setAuteur(String auteur) {
		Auteur = auteur;
	}
	public String getEditeur() {
		return Editeur;
	}
	public void setEditeur(String editeur) {
		Editeur = editeur;
	}
	public String getGenre() {
		return Genre;
	}
	public void setGenre(String genre) {
		Genre = genre;
	}
	@Override
	public String toString() {
		return "Livre [Titre=" + Titre + ", Auteur=" + Auteur + "]";
	}

	
	
	
	
	
	

}
