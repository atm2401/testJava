package sn.java.test;

public class Afficher {

	public static void afficher(){
		System.out.println("Nom: DIOP Pr�nom: TAMSIR");
	}
	
	public static void afficherWithParam(String nom,String prenom){
		System.out.println("Nom: "+nom+" Pr�nom: "+prenom+"");
	}
	
	public static void afficherWithParams(String nom,String prenom,String adresse){
		System.out.println("Nom: "+nom+" Pr�nom: "+prenom+"");
	}
	
	public static void main(String args[]){
		
		afficher();
		
	}
}
