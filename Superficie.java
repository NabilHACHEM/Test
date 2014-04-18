import java.util.ArrayList;
import java.util.Iterator;

public class Superficie {
	
			//Attributs
			
			private String km2;
			private String hm2;
			private String dam2;
			private String m2;
			private String dm2;
			private String cm2;
			private String mm2;
			private ArrayList<String> liste_superficie_unites;
			
			//Constructeur
			
			public Superficie(String km2,String hm2,String dam2,String m2,String dm2,String cm2,String mm2){
				this.km2=km2;
				this.hm2=hm2;
				this.dam2=dam2;
				this.m2=m2;
				this.dm2=dm2;
				this.cm2=cm2;
				this.mm2=mm2;
			}
			
			public Superficie() {
				liste_superficie_unites=new ArrayList<String>();
				ajouterSuperficieUnites();
			}
		
			//Getters & setters
			
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
		
			//M�thode ajouter une unit� de la superficie dans la liste pour l'affichage
			
			public void ajouterSuperficieUnites(){
				liste_superficie_unites.add("Km2");
				liste_superficie_unites.add("Hm2");
				liste_superficie_unites.add("Dam2");
				liste_superficie_unites.add("M2");
				liste_superficie_unites.add("Dm2");
				liste_superficie_unites.add("Cm2");
				liste_superficie_unites.add("Mm2");
				}
			
			//M�thode afficher les unit�s de la superficie
			
			public StringBuffer afficherUnitesSuperficie(){
				StringBuffer type=new StringBuffer();
				for (Iterator iterator = liste_superficie_unites.iterator(); iterator.hasNext();) {
					 type.append(iterator.next()+", ");
					}return type;
			}
		}
