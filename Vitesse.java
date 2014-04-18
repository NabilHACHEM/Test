import java.util.ArrayList;
import java.util.Iterator;

public class Vitesse {
	
				/**
				   @author Nabil HACHEM
				   @version 2.0
			           @since 2014-04-18
				  */
	
			//Attributs	
		
			private String kmph;
			private String mps;
			private String milesph;
			private ArrayList<String> liste_vitesse_unites;
			
			//Constructeur
			
			public Vitesse(String kmph,String mps,String milesph){
				this.kmph=kmph;
				this.mps=mps;
				this.milesph=milesph;
			}
		
			public Vitesse() {
				liste_vitesse_unites=new ArrayList<String>();	
				ajouterVitesseeUnites();
			}
			
			//Getters & setters
			
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
			
			//M�thode ajouter une unit� de la vitesse dans la liste pour l'affichage
			
			public void ajouterVitesseeUnites(){
				liste_vitesse_unites.add("Kmph");
				liste_vitesse_unites.add("Mps");
				liste_vitesse_unites.add("Milesph");
				
				}
			
			//M�thode afficher les unit�s de vitesse
			
			public StringBuffer afficherUnitesVitesse(){
				StringBuffer type=new StringBuffer();
				for (Iterator iterator = liste_vitesse_unites.iterator(); iterator.hasNext();) {
					 type.append(iterator.next()+", ");
					}return type;
			}
		}
