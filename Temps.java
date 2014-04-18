import java.util.ArrayList;
import java.util.Iterator;

public class Temperature {

				//Attributs
				
				private String celsius;
				private String kelvin;
				private String newton;
				private ArrayList<String> liste_temperature_unites;
				
				//Constructeur
				
				public Temperature(String celsius,String kelvin,String newton){
					this.celsius=celsius;
					this.kelvin=kelvin;
					this.newton=newton;
				}
				
				public Temperature(){
					liste_temperature_unites=new ArrayList<String>();
					afficherUnitesTemperature();
				}
				
				//Getters & setters
				
				public String getCelsius() {
					return celsius;
				}
			
				public void setCelsius(String celsius) {
					this.celsius = celsius;
				}
			
				public String getKelvin() {
					return kelvin;
				}
			
				public void setKelvin(String kelvin) {
					this.kelvin = kelvin;
				}
			
				public String getNewton() {
					return newton;
				}
			
				public void setNewton(String newton) {
					this.newton = newton;
				}
			
				public ArrayList<String> getListe_temperature_unites() {
					return liste_temperature_unites;
				}
			
				public void setListe_temperature_unites(
						ArrayList<String> liste_temperature_unites) {
					this.liste_temperature_unites = liste_temperature_unites;
				}
			
				//M�thode ajouter une unit� de la temp�rature dans la liste pour l'affichage
				
				public void ajouterTemperatureUnites(){
					liste_temperature_unites.add("Celsius");
					liste_temperature_unites.add("Kelvin");
					liste_temperature_unites.add("Newton");
					}
				
				//M�thode afficher les unit�s de la temp�rature
				
				public StringBuffer afficherUnitesTemperature(){
					StringBuffer type=new StringBuffer();
					for (Iterator iterator = liste_temperature_unites.iterator(); iterator.hasNext();) {
						 type.append(iterator.next()+", ");
						}return type;
				}
				
			}
