import java.util.ArrayList;
import java.util.Iterator;

public class Finance {
	
				/**
				   @author Nabil HACHEM
				   @version 2.0
			           @since 2014-04-18
				  */
	
	//Attributs	
	
	private String euro;
	private String dollar;
	private String pound;
	private String yen;
	private ArrayList<String> liste_finance_unites;
	
	//Constructeurs
	
	public Finance() {
		super();
		liste_finance_unites = new ArrayList<String>();
		 ajouterFinanceUnites();
	}

	public Finance(String euro, String dollar, String pound,String yen){
		this.euro=euro;
		this.dollar=dollar;
		this.pound=pound;
		this.yen=yen;
			}
	
	//Getters & setters

	public String getEuro() {
		return euro;
	}

	public void setEuro(String euro) {
		this.euro = euro;
	}

	public String getDollar() {
		return dollar;
	}

	public void setDollar(String dollar) {
		this.dollar = dollar;
	}

	public String getPound() {
		return pound;
	}

	public void setPound(String pound) {
		this.pound = pound;
	}

	public String getYen() {
		return yen;
	}

	public void setYen(String yen) {
		this.yen = yen;
	}
	
	public ArrayList<String> getListe_finance_unites() {
		return liste_finance_unites;
	}

	public void setListe_finance_unites(ArrayList<String> liste_finance_unites) {
		this.liste_finance_unites = liste_finance_unites;
	}
	
	//M�thode ajouter une unit� de Finance dans la liste pour l'affichage
	
	public void ajouterFinanceUnites(){
		liste_finance_unites.add("Euro");
		liste_finance_unites.add("Dollar");
		liste_finance_unites.add("Pound");
		liste_finance_unites.add("Yen");
		}
	
	//M�thode afficher les unit�s de Finance 
	
	public StringBuffer afficherUnitesFinane(){
		StringBuffer type=new StringBuffer();
		for (Iterator iterator = liste_finance_unites.iterator(); iterator.hasNext();) {
			 type.append(iterator.next()+", ");
			}return type;
	}
	
}
