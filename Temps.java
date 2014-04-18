public class Temps {
	
	//Attributs
	
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
	
	//Constructeur
	
	
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

	//Getters & setters
	
	public Temps() {
		liste_temps_unites = new ArrayList<String>();
		ajouterTempsUnites();
		
	}

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
	
	//M�thode ajouter une unit� du temps dans la liste pour l'affichage
	
	public void ajouterTempsUnites(){
		liste_temps_unites.add("Annee");
		liste_temps_unites.add("Mois");
		liste_temps_unites.add("Semaine");
		liste_temps_unites.add("Jour");
		liste_temps_unites.add("Heure");
		liste_temps_unites.add("Mnute");
		liste_temps_unites.add("Seconde");
		liste_temps_unites.add("Milliseconde");
		liste_temps_unites.add("Microseconde");
		liste_temps_unites.add("Nanoseconde");
	}
	
	//M�thode afficher les unit�s du temps
	
	public StringBuffer afficherUnitesTemps(){
		StringBuffer type=new StringBuffer();
		for (Iterator iterator = liste_temps_unites.iterator(); iterator.hasNext();) {
			 type.append(iterator.next()+", ");
			}return type;
	}


	
	
}
