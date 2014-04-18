import java.util.ArrayList;
import java.util.Iterator;

/**
* The Vitesse class is a class which represents the Speed  system 
* @author Nabil HACHEM
* @version 2.0
* @since 2014-04-18
*/

public class Vitesse {
	
			//These attributs represent its units, they are private and in type String	
		
			private String kmph;
			private String mps;
			private String milesph;
			private ArrayList<String> liste_vitesse_unites;
			
			//This constructor allows to initialized all the attributs
			
			public Vitesse(String kmph,String mps,String milesph){
				this.kmph=kmph;
				this.mps=mps;
				this.milesph=milesph;
			}
		
			//This constructor allows to initialized the list liste_vitesse_unite and the method ajouterVitesseUnite()
		
			public Vitesse() {
				liste_vitesse_unites=new ArrayList<String>();	
				ajouterVitesseeUnites();
			}
			
			//Getters & setters for all attributs
			
			public String getKmph() {
				return kmph;
			}
		
			public void setKmph(String kmph) {
				this.kmph = kmph;
			}
		
			public String getMps() {
				return mps;
			}
		
			public void setMps(String mps) {
				this.mps = mps;
			}
		
			public String getMilesph() {
				return milesph;
			}
		
			public void setMilesph(String milesph) {
				this.milesph = milesph;
			}
		
			public ArrayList<String> getListe_vitesse_unites() {
				return liste_vitesse_unites;
			}
		
			public void setListe_vitesse_unites(ArrayList<String> liste_vitesse_unites) {
				this.liste_vitesse_unites = liste_vitesse_unites;
			}
			
			//Method to add some examples of units in type String in the list
			
			public void ajouterVitesseeUnites(){
				liste_vitesse_unites.add("Kmph");
				liste_vitesse_unites.add("Mps");
				liste_vitesse_unites.add("Milesph");
				
				}
			
			//Method to print on screen all units added in the list 
			
			public StringBuffer afficherUnitesVitesse(){
				StringBuffer type=new StringBuffer();
				for (Iterator iterator = liste_vitesse_unites.iterator(); iterator.hasNext();) {
					 type.append(iterator.next()+", ");
					}return type;
			}
		}
