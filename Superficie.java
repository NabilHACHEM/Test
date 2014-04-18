import java.util.ArrayList;
import java.util.Iterator;

/**
* The Superficie class is a class which represents the Area system 
* @author Nabil HACHEM
* @version 2.0
* @since 2014-04-18
*/

public class Superficie {
	
			
	
			//These attributs represent its units, they are private and in type String
			
			private String km2;
			private String hm2;
			private String dam2;
			private String m2;
			private String dm2;
			private String cm2;
			private String mm2;
			private ArrayList<String> liste_superficie_unites;
			
			//This constructor allows to initialized all the attributs
			
			public Superficie(String km2,String hm2,String dam2,String m2,String dm2,String cm2,String mm2){
				this.km2=km2;
				this.hm2=hm2;
				this.dam2=dam2;
				this.m2=m2;
				this.dm2=dm2;
				this.cm2=cm2;
				this.mm2=mm2;
			}
			
			//This constructor allows to initialized the list liste_byte_unite and the method ajouterSuperficieUnites()
			
			public Superficie() {
				liste_superficie_unites=new ArrayList<String>();
				ajouterSuperficieUnites();
			}
		
			//Getters & setters for all attributs
			
			public String getKm2() {
				return km2;
			}
		
			public void setKm2(String km2) {
				this.km2 = km2;
			}
		
			public String getHm2() {
				return hm2;
			}
		
			public void setHm2(String hm2) {
				this.hm2 = hm2;
			}
		
			public String getDam2() {
				return dam2;
			}
		
			public void setDam2(String dam2) {
				this.dam2 = dam2;
			}
		
			public String getM2() {
				return m2;
			}
		
			public void setM2(String m2) {
				this.m2 = m2;
			}
		
			public String getDm2() {
				return dm2;
			}
		
			public void setDm2(String dm2) {
				this.dm2 = dm2;
			}
		
			public String getCm2() {
				return cm2;
			}
		
			public void setCm2(String cm2) {
				this.cm2 = cm2;
			}
		
			public String getMm2() {
				return mm2;
			}
		
			public void setMm2(String mm2) {
				this.mm2 = mm2;
			}
		
			public ArrayList<String> getListe_superficie_unites() {
				return liste_superficie_unites;
			}
		
			public void setListe_superficie_unites(ArrayList<String> liste_superficie_unites) {
				this.liste_superficie_unites = liste_superficie_unites;
			}
		
		//Method to add some examples of units in type String in the list 
			
			public void ajouterSuperficieUnites(){
				liste_superficie_unites.add("Km2");
				liste_superficie_unites.add("Hm2");
				liste_superficie_unites.add("Dam2");
				liste_superficie_unites.add("M2");
				liste_superficie_unites.add("Dm2");
				liste_superficie_unites.add("Cm2");
				liste_superficie_unites.add("Mm2");
				}
			
			//Method to print on screen all units added in the list
			
			public StringBuffer afficherUnitesSuperficie(){
				StringBuffer type=new StringBuffer();
				for (Iterator iterator = liste_superficie_unites.iterator(); iterator.hasNext();) {
					 type.append(iterator.next()+", ");
					}return type;
			}
		}
