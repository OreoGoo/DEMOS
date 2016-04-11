package fr.demos;

public class Article{
	
	private double PrixHT;
	private String Description;
	private String Reference;
	private int Stock;
	
	
	public Article (int unPrixHT, String uneDescription, String uneReference, int unStock){
		PrixHT=unPrixHT;
		Description=uneDescription;
		Reference=uneReference;
		Stock=unStock;
	}


	public double getPrixHT() {
		return PrixHT;
	}


	public void setPrixHT(double prixHT) {
		PrixHT = prixHT;
	}


	public String getDescription() {
		return Description;
	}


	public void setDescription(String description) {
		Description = description;
	}


	public String getReference() {
		return Reference;
	}


	public void setReference(String reference) {
		Reference = reference;
	}


	public int getStock() {
		return Stock;
	}


	public void setStock(int stock) {
		Stock = stock;
	}


	@Override
	public String toString() {
		return "Article [PrixHT=" + PrixHT + ", Description=" + Description + ", Reference=" + Reference + ", Stock="
				+ Stock + "]";
	}
	

}
