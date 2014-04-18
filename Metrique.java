import java.util.ArrayList;
import java.util.Iterator;

public class Metrique {
	
	//Attributs	
	
	private String km;
	private String hm;
	private String dam;
	private String m;
	private String dm;
	private String cm;
	private String mm;
	private ArrayList<String> liste_metrique_unites;
	
	//Constructeurs

	public Metrique() {
			super();
			liste_metrique_unites = new ArrayList<String>();
			ajouterUnitesMetrique();
					  }

	public Metrique (String km,String hm,String dam,String m,String dm,String cm,String mm){
			this.km=km;
			this.hm=hm;
			this.dam=dam;
			this.m=m;
			this.dm=dm;
			this.cm=cm;
			this.mm=mm;
					   }
	
	//Getters & setters

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
		
	//M�thode ajouter une unit� de M�trique dans la liste pour l'affichage
	
	public void ajouterUnitesMetrique(){
		liste_metrique_unites.add("Km");
		liste_metrique_unites.add("Hm");
		liste_metrique_unites.add("Dam");
		liste_metrique_unites.add("M");
		liste_metrique_unites.add("Dm");
		liste_metrique_unites.add("Cm");
		liste_metrique_unites.add("Mm");
	}
	
	//M�thode afficher les unit�s de M�trique 
	
	public StringBuffer afficherUnitesMetrique(){
		StringBuffer type=new StringBuffer();
		for (Iterator iterator = liste_metrique_unites.iterator(); iterator.hasNext();) {
			 type.append(iterator.next()+", ");
			}return type;
	}
		
	}
