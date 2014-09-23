import java.util.ArrayList;
public class Banque {

	/**
	 * @param args
	 */
	
	private String nomBanque;
	private ArrayList <Compte> listeComptes;
	
	public Banque (){
		
	}
	public void voirCompte (){
		int i = 0;
		while(i <= listeComptes.size()){
			listeComptes.get(i);
		}
	}
	public void ajouterCompte(Compte unCompte){
		listeComptes.add(unCompte);
	}
	public void supprimerCompte (Compte unCompte){
		listeComptes.remove(unCompte);
		
	}
	public String getNomBanque (){
		return this.nomBanque;
	}
	
	public void setNomBanque (String unNomBanque){
		this.nomBanque = unNomBanque ;
	}
}

	
	
	
		



