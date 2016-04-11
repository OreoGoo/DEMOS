package fr.demos;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		Article bonbon= new Article (10, "un aribo","AADS", 3);
		Livre Lovecraft=new Livre (20, "ce qui est a mon sens...", "ROXXOR",2, "l'appel de Ctuhulu","HP LOVECRAFT",
			"Weird Tales", "SF");
		
		
		Panier PanierAmazon=new Panier();
		
	//	PanierAmazon.ajouterArticle(bonbon);
		//PanierAmazon.ajouterArticle(Lovecraft);
		
		System.out.println(PanierAmazon);
		

	}

}
