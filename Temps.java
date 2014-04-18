import java.util.ArrayList;
import java.util.Iterator;

/**
* The Temps class is a class which represents the Time system 
* @author Nabil HACHEM
* @version 2.0
* @since 2014-04-18
*/

public class Temps {
	
	
	//These attributs represent its units, they are private and in type String
	
	private String annee;
	private String mois;
	private String semaine;
	private String jour;
	private String heure;
	private String minute;
	private String secondes;
	private String millisecondes;
	private String microsecondes;
	private String nanosecondes;
	private ArrayList<String> liste_temps_unites;
	
	//This constructor allows to initialized all the attributs

	public Temps(String annee,String mois,String semaine,String jour,String heure,String minute,String secondes,String millisecondes,String microsecondes,String nanosecondes){
		this.annee=annee;
		this.mois=mois;
		this.semaine=semaine;
		this.jour=jour;
		this.heure=heure;
		this.minute=minute;
		this.secondes=secondes;
		this.millisecondes=millisecondes;
		this.microsecondes=microsecondes;
		this.nanosecondes=nanosecondes;
	}

	//This constructor allows to initialized the list liste_temps_unites and the method ajouterTempsUnites()
	
	public Temps() {
		liste_temps_unites = new ArrayList<String>();
		ajouterTempsUnites();
		
	}

	//Getters & setters for all attributs
		
	public String getHeure() {
		return heure;
	}

	public void setHeure(String heure) {
		this.heure = heure;
	}

	public String getMinute() {
		return minute;
	}

	public void setMinute(String minute) {
		this.minute = minute;
	}

	public String getSecondes() {
		return secondes;
	}

	public void setSecondes(String secondes) {
		this.secondes = secondes;
	}

	public String getMillisecondes() {
		return millisecondes;
	}

	public void setMillisecondes(String millisecondes) {
		this.millisecondes = millisecondes;
	}

	public String getMicrosecondes() {
		return microsecondes;
	}

	public void setMicrosecondes(String microsecondes) {
		this.microsecondes = microsecondes;
	}

	public String getNanosecondes() {
		return nanosecondes;
	}

	public void setNanosecondes(String nanosecondes) {
		this.nanosecondes = nanosecondes;
	}

	public String getAnnee() {
		return annee;
	}

	public void setAnnee(String annee) {
		this.annee = annee;
	}

	public String getMois() {
		return mois;
	}

	public void setMois(String mois) {
		this.mois = mois;
	}

	public String getSemaine() {
		return semaine;
	}

	public void setSemaine(String semaine) {
		this.semaine = semaine;
	}

	public String getJour() {
		return jour;
	}

	public void setJour(String jour) {
		this.jour = jour;
	}
	
	public ArrayList<String> getListe_temps_unites() {
		return liste_temps_unites;
	}

	public void setListe_temps_unites(ArrayList<String> liste_temps_unites) {
		this.liste_temps_unites = liste_temps_unites;
	}
	
	//Method to add some examples of units in type String in the list 
	
	public void ajouterTempsUnites(){
		liste_temps_unites.add("Annee");
		liste_temps_unites.add("Mois");
		liste_temps_unites.add("Semaine");
		liste_temps_unites.add("Jour");
		liste_temps_unites.add("Heure");
		liste_temps_unites.add("Minute");
		liste_temps_unites.add("Seconde");
		liste_temps_unites.add("Milliseconde");
		liste_temps_unites.add("Microseconde");
		liste_temps_unites.add("Nanoseconde");
	}
	
	//Method to print on screen all units added in the list
	
	public StringBuffer afficherUnitesTemps(){
		StringBuffer type=new StringBuffer();
		for (Iterator iterator = liste_temps_unites.iterator(); iterator.hasNext();) {
			 type.append(iterator.next()+", ");
			}return type;
	}


	
	
}
