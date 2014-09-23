import java.util.ArrayList;

public class Compte {

	/**
	 * @param args
	 */
	//Attribut privés
	private int numCompte;
	private String nomCompte;
	private float solde;
	private Client unClient;
	
	//Methode publiques
	public Compte (){
			
	}
	public void debiter (float montant){
	
	}
	
	public void crediter (float montant){
		
	}

	public int getNumCompte(){
		return numCompte;
		
	}
	public void setNumCompte (int numCompte){
		this.numCompte = numCompte;
	}
	
	public String toString (){
		String chaine = this.nomCompte;
		return chaine;
	}
	 public String getNomCompte (){
		 return this.nomCompte;
	 }

	 public void setNomCompte (String unNomCompte){
		 this.nomCompte = unNomCompte;
	 }
	 
	 public float getSolde(){
		 return this.solde;
		 
	 }
	 public void setSolde (float unSolde){
		 this.solde = unSolde;
	 }
}







