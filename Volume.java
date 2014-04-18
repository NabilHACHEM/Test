import java.util.ArrayList;
import java.util.Iterator;

/**
* The Volume class is a class which represents the Volume Data system 
* @author Nabil HACHEM
* @version 2.0
* @since 2014-04-18
*/

public class Volume {
	
			//These attributs represent its units, they are private and in type String		
			
			private String m3;
			private String dm3;
			private String cm3;
			private String l;
			private String dl;
			private String cl;
			private String ml;
			private ArrayList<String> liste_volume_unite;
			
			//This constructor allows to initialized all the attributs
			
			public Volume(String m3,String dm3, String cm3,String l,String dl,String cl,String ml){
				this.m3=m3;
				this.dm3=dm3;
				this.cm3=cm3;
				this.l=l;
				this.dl=dl;
				this.cl=cl;
				this.ml=ml;
			}
		
			//This constructor allows to initialized the list liste_volume_unite and the method ajouterVolumeUnite()	  
			public Volume() {
				liste_volume_unite=new ArrayList<String>();
				ajouterVolumeUnite();
			}
			
			//Getters & setters for all attributs
			
			public String getM3() {
				return m3;
			}
		
			public void setM3(String m3) {
				this.m3 = m3;
			}
		
			public String getDm3() {
				return dm3;
			}
		
			public void setDm3(String dm3) {
				this.dm3 = dm3;
			}
		
			public String getCm3() {
				return cm3;
			}
		
			public void setCm3(String cm3) {
				this.cm3 = cm3;
			}
		
			public String getL() {
				return l;
			}
		
			public void setL(String l) {
				this.l = l;
			}
		
			public String getDl() {
				return dl;
			}
		
			public void setDl(String dl) {
				this.dl = dl;
			}
		
			public String getCl() {
				return cl;
			}
		
			public void setCl(String cl) {
				this.cl = cl;
			}
		
			public String getMl() {
				return ml;
			}
		
			public void setMl(String ml) {
				this.ml = ml;
			}
		
			public ArrayList<String> getListe_volume_unite() {
				return liste_volume_unite;
			}
		
			public void setListe_volume_unite(ArrayList<String> liste_volume_unite) {
				this.liste_volume_unite = liste_volume_unite;
			}
		
			//Method to add some examples of units in type String in the list 
			
			public void ajouterVolumeUnite(){
				liste_volume_unite.add("m3");
				liste_volume_unite.add("dm3");
				liste_volume_unite.add("cm3");
				liste_volume_unite.add("l");
				liste_volume_unite.add("dl");
				liste_volume_unite.add("cl");
				liste_volume_unite.add("ml");
			}
			
			//Method to print on screen all units added in the list 
			
			public StringBuffer afficherUnitesVolume(){
				StringBuffer type=new StringBuffer();
				for (Iterator iterator = liste_volume_unite.iterator(); iterator.hasNext();) {
					 type.append(iterator.next()+", ");
					}return type;
			  
		
			}
			
		}
