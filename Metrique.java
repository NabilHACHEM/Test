import java.util.ArrayList;
import java.util.Iterator;

/**
* The Metrique class is a class which represents the Metrique system 
* @author Nabil HACHEM
* @version 2.0
* @since 2014-04-18
*/

public class Metrique {
	
	//These attributs represent its units, they are private and in type String		
	
	private String km;
	private String hm;
	private String dam;
	private String m;
	private String dm;
	private String cm;
	private String mm;
	private ArrayList<String> liste_metrique_unites;
	
	//This constructor allows to initialized the list liste_metrique_unites and the method ajouterUnitesMetrique

	public Metrique() {
			super();
			liste_metrique_unites = new ArrayList<String>();
			ajouterUnitesMetrique();
					  }

	//This constructor allows to initialized all the attributs
	
	public Metrique (String km,String hm,String dam,String m,String dm,String cm,String mm){
			this.km=km;
			this.hm=hm;
			this.dam=dam;
			this.m=m;
			this.dm=dm;
			this.cm=cm;
			this.mm=mm;
					   }
	
	//Getters & setters for all attributs

	public String getKm() {
		return km;
	}

	public void setKm(String km) {
		this.km = km;
	}

	public String getHm() {
		return hm;
	}

	public void setHm(String hm) {
		this.hm = hm;
	}

	public String getDam() {
		return dam;
	}

	public void setDam(String dam) {
		this.dam = dam;
	}

	public String getM() {
		return m;
	}

	public void setM(String m) {
		this.m = m;
	}

	public String getDm() {
		return dm;
	}

	public void setDm(String dm) {
		this.dm = dm;
	}

	public String getCm() {
		return cm;
	}

	public void setCm(String cm) {
		this.cm = cm;
	}

	public String getMm() {
		return mm;
	}

	public void setMm(String mm) {
		this.mm = mm;
	}
	

	public ArrayList<String> getListe_metrique_unites() {
		return liste_metrique_unites;
	}

	public void setListe_metrique_unites(ArrayList<String> liste) {
		this.liste_metrique_unites = liste;
	}
		
	//Method to add some examples of units in type String in the list
	
	public void ajouterUnitesMetrique(){
		liste_metrique_unites.add("Km");
		liste_metrique_unites.add("Hm");
		liste_metrique_unites.add("Dam");
		liste_metrique_unites.add("M");
		liste_metrique_unites.add("Dm");
		liste_metrique_unites.add("Cm");
		liste_metrique_unites.add("Mm");
	}
	
	//Method to print on screen all units added in the list
	
	public StringBuffer afficherUnitesMetrique(){
		StringBuffer type=new StringBuffer();
		for (Iterator iterator = liste_metrique_unites.iterator(); iterator.hasNext();) {
			 type.append(iterator.next()+", ");
			}return type;
	}
		
	}
