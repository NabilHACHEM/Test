import java.util.ArrayList;
import java.util.Iterator;

public class Poids {
	
	//Attributs	

	private String tonne;
	private String quintal;
	private String kg;
	private String hg;
	private String dag;
	private String g;
	private String dg;
	private String cg;
	private String mg;
	private ArrayList<String> liste_unites_poids;
	
	//Constructeur
	
	public Poids (String tonne,String quintal,String kg,String hg,String dag,String g,String dg, String cg,String mg){
		this.tonne=tonne;
		this.quintal=quintal;
		this.kg=kg;
		this.hg=hg;
		this.dag=dag;
		this.g=g;
		this.dg=dg;
		this.cg=cg;
		this.mg=mg;
		}

	public Poids() {
		 liste_unites_poids = new ArrayList<String>();
		 ajouterUnitesPoids();
	}

	//Getters & setters
	
	public String getKg() {
		return kg;
	}

	public void setKg(String kg) {
		this.kg = kg;
	}

	public String getHg() {
		return hg;
	}

	public void setHg(String hg) {
		this.hg = hg;
	}

	public String getDag() {
		return dag;
	}

	public void setDag(String dag) {
		this.dag = dag;
	}

	public String getG() {
		return g;
	}

	public void setG(String g) {
		this.g = g;
	}

	public String getDg() {
		return dg;
	}

	public void setDg(String dg) {
		this.dg = dg;
	}

	public String getCg() {
		return cg;
	}

	public void setCg(String cg) {
		this.cg = cg;
	}

	public String getMg() {
		return mg;
	}

	public void setMg(String mg) {
		this.mg = mg;
	}
	
	public ArrayList<String> getListe_unites_poids() {
		return liste_unites_poids;
	}

	public void setListe_unites_poids(ArrayList<String> liste) {
		this.liste_unites_poids = liste;
	}

	public String getTonne() {
		return tonne;
	}

	public void setTonne(String tonne) {
		this.tonne = tonne;
	}

	public String getQuintal() {
		return quintal;
	}

	public void setQuintal(String quintal) {
		this.quintal = quintal;
	}
	
	//M�thode ajouter une unit� de poids dans la liste pour l'affichage
	
	public void ajouterUnitesPoids(){
		liste_unites_poids.add("Tonne");
		liste_unites_poids.add("Quintal");
		liste_unites_poids.add("Kg");
		liste_unites_poids.add("Hg");
		liste_unites_poids.add("Dag");
		liste_unites_poids.add("G");
		liste_unites_poids.add("Dg");
		liste_unites_poids.add("Cg");
		liste_unites_poids.add("Mg");
	}
	
	//M�thode afficher les unit�s de Poids

	public StringBuffer afficherUnitesPoids(){
		StringBuffer type=new StringBuffer();
		for (Iterator iterator = liste_unites_poids.iterator(); iterator.hasNext();) {
			 type.append(iterator.next()+", ");
			}return type;
	}
	
}
