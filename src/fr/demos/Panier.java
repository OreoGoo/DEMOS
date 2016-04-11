package fr.demos;

import java.util.ArrayList;


public class Panier {
	
	private ArrayList <Article> contenu= new ArrayList <>();
	
	
	
	public void ajouterArticle(Article unArticle) throws ExceptionPanier{
		if (unArticle.getStock()<0){
			throw new ExceptionPanier("stock depasser");
			}
	
		contenu.add(unArticle);
	}
	
	
	public void retirerArticle (Article unArticle){
		contenu.remove(unArticle);
	}


	@Override
	public String toString() {
		return "Panier [contenu=" + contenu + "]";
	}

	
	}
	
	
	
	


