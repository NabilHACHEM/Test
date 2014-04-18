import java.util.ArrayList;
import java.util.Iterator;

/**
* The Byte class is a class which represents the Byte Data system in informatic 
* @author  Nabil HACHEM
* @version 2.0
* @since   2014-04-18
*/

public class Byte {
			
		
		
	
	
			//These attributs represent its units, they are private and in type String	
			
			private String bit;
			private String octet;
			private String ko;
			private String mo;
			private String go;
			private ArrayList<String> liste_byte_unite;
			
			//This constructor allows to initialized all the attributs
			
			public Byte(String bit,String octet,String ko,String mo,String go){
				this.bit=bit;
				this.octet=octet;
				this.ko=ko;
				this.mo=mo;
				this.go=go;
			}
			
			//This constructor allows to initialized the list liste_byte_unite and the method ajouterByteUnite
			
			public Byte() {
				liste_byte_unite= new ArrayList<String>();
				ajouterByteUnites();
			}
			
			//Getters & setters for all attributs
		
			public String getBit() {
				return bit;
			}
		
			public void setBit(String bit) {
				this.bit = bit;
			}
		
			public String getOctet() {
				return octet;
			}
		
			public void setOctet(String octet) {
				this.octet = octet;
			}
		
			public String getKo() {
				return ko;
			}
		
			public void setKo(String ko) {
				this.ko = ko;
			}
		
			public String getMo() {
				return mo;
			}
		
			public void setMo(String mo) {
				this.mo = mo;
			}
		
			public String getGo() {
				return go;
			}
		
			public void setGo(String go) {
				this.go = go;
			}
		
			public ArrayList<String> getListe_byte_unite() {
				return liste_byte_unite;
			}
		
			public void setListe_byte_unite(ArrayList<String> liste_byte_unite) {
				this.liste_byte_unite = liste_byte_unite;
			}
			
			//Method to add some examples of units in type String in the list 
			
			public void ajouterByteUnites(){
				liste_byte_unite.add("Bit");
				liste_byte_unite.add("Octet");
				liste_byte_unite.add("Ko");
				liste_byte_unite.add("Mo");
				liste_byte_unite.add("Go");
				
				}
				
			//Method to print on screen all units added in the list 
			
			public StringBuffer afficherUnitesByte(){
				StringBuffer type=new StringBuffer();
					for (Iterator iterator = liste_byte_unite.iterator(); iterator.hasNext();) {
					 type.append(iterator.next()+", ");
					}return type;
			}
		
		}
