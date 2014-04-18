import java.util.ArrayList;
import java.util.Iterator;

public class Byte {
	
			//Attributs	
			
			private String bit;
			private String octet;
			private String ko;
			private String mo;
			private String go;
			private ArrayList<String> liste_byte_unite;
			
			//Constructeur
			
			public Byte(String bit,String octet,String ko,String mo,String go){
				this.bit=bit;
				this.octet=octet;
				this.ko=ko;
				this.mo=mo;
				this.go=go;
			}
			
			public Byte() {
				liste_byte_unite= new ArrayList<String>();
				ajouterByteUnites();
			}
			
			//Getters & setters
		
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
			
			//M�thode ajouter une unit� de Byte dans la liste pour l'affichage
			
			public void ajouterByteUnites(){
				liste_byte_unite.add("Bit");
				liste_byte_unite.add("Octet");
				liste_byte_unite.add("Ko");
				liste_byte_unite.add("Mo");
				liste_byte_unite.add("Go");
				
				}
				
			//M�thode afficher les unit�s de Byte 
			
			public StringBuffer afficherUnitesByte(){
				StringBuffer type=new StringBuffer();
					for (Iterator iterator = liste_byte_unite.iterator(); iterator.hasNext();) {
					 type.append(iterator.next()+", ");
					}return type;
			}
		
		}
