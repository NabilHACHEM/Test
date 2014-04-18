/**
* The Conversion class is a class which converts units of a system to another units
* @author Nabil HACHEM
* @version 2.0
* @since 2014-04-18
*/

public class Conversion {
			
			/**These attributs are private and two of them are in type String and the one another in type float
			  * unite_origine represents the caracter of the first unit
			  * unite_cible represents the caracter of the second unit
			  * valeur_unite is the number of the unit
			*/
			
			private String unite_origine;
			private String unite_cible;
			private float valeur_unite;
			
			//This constructor allows to initialized the method convertir_unite()
			
			public Conversion() {
				super();
				convertir_unite();
			}
			
			//This constructor allows to initialized all the attributs
			
			public Conversion(String unit_orig,String unit_cib, float val_unit){
				this.unite_cible=unit_cib;
				this.unite_origine=unit_orig;
				this.valeur_unite=val_unit;
				//convertir_unite();
			}
			
			//Getters & setters for all attributs
			
			public String getUnite_origine() {
				return unite_origine;
											 }
		
			public void setUnite_origine(String unite_origine) {
				this.unite_origine = unite_origine;
															   }
			
			public String getUnite_cible() {
				return unite_cible;
										   }
		
			public void setUnite_cible(String unite_cible) {
				this.unite_cible = unite_cible;
														   }
		
			public float getValeur_unite() {
				return valeur_unite;
			}
		
			public void setValeur_unite(float valeur_unite) {
				this.valeur_unite = valeur_unite;
			}
			
			
			//Methode allows to convertles units
			
			
			public void convertir_unite(){
								
				Formule f=new Formule();
				
			//Methods allows to multiply units between them  according to the number	
				
				f.multiplierUniteParUn(getUnite_origine(), getUnite_cible(), getValeur_unite());
				f.multiplierUniteParDix(getUnite_origine(),getUnite_cible(),getValeur_unite());
				f.multiplierUniteParCent(this.getUnite_origine(), this.getUnite_cible(), this.getValeur_unite());
				f.multiplierUniteParCentMille(unite_origine, unite_cible, valeur_unite);
				f.multiplierUniteParDixMille(this.getUnite_origine(), this.getUnite_cible(), this.getValeur_unite());
				f.multiplierUniteParCentMille(this.getUnite_origine(), this.getUnite_cible(), this.getValeur_unite());
				f.multiplierUniteParUnMillion(this.getUnite_origine(), this.getUnite_cible(), this.getValeur_unite());
				f.multiplierUniteParDixMillion(this.getUnite_origine(), this.getUnite_cible(), this.getValeur_unite());
				f.multiplierUniteParCentMillion(this.getUnite_origine(), this.getUnite_cible(), this.getValeur_unite());
				f.multiplierUniteParUnMilliard(this.getUnite_origine(), this.getUnite_cible(), this.getValeur_unite());

			//Methods allows to divide units between them  according to the number	
				
				f.diviserUniteParUn(this.getUnite_origine(), this.getUnite_cible(), this.getValeur_unite());
				f.diviserUniteParDix(this.getUnite_origine(), this.getUnite_cible(), this.getValeur_unite());
				f.diviserUniteParCent(this.getUnite_origine(), this.getUnite_cible(), this.getValeur_unite());
				f.diviserUniteParMille(this.getUnite_origine(), this.getUnite_cible(), this.getValeur_unite());
				f.diviserUniteParDixMille(this.getUnite_origine(), this.getUnite_cible(), this.getValeur_unite());
				f.diviserUniteParCentMille(this.getUnite_origine(), this.getUnite_cible(), this.getValeur_unite());
				f.diviserUniteParUnMillion(this.getUnite_origine(), this.getUnite_cible(), this.getValeur_unite());
				f.diviserUniteParUnMillion(this.getUnite_origine(), this.getUnite_cible(), this.getValeur_unite());
				
			//Methods allows to convert currencies 
				
				f.euro(this.getUnite_origine(), this.getUnite_cible(), this.getValeur_unite());
				f.dollar(this.getUnite_origine(), this.getUnite_cible(), this.getValeur_unite());
				f.Pound(this.getUnite_origine(), this.getUnite_cible(), this.getValeur_unite());
				f.Yen(this.getUnite_origine(), this.getUnite_cible(), this.getValeur_unite());
				
			//Methods allows to convert units of time between them  according to the number
				
				f.heure(this.getUnite_origine(), this.getUnite_cible(), this.getValeur_unite());
				f.minute(this.getUnite_origine(), this.getUnite_cible(), this.getValeur_unite());

			//Methods allows to convert units of speed between them  according to the number	
				
				f.kmph(this.getUnite_origine(), this.getUnite_cible(), this.getValeur_unite());
				f.mps(this.getUnite_origine(), this.getUnite_cible(), this.getValeur_unite());
				f.milesph(this.getUnite_origine(), this.getUnite_cible(), this.getValeur_unite());
				
			//Methods allows to convert units of temperature between them  according to the number	
				
				f.celsius(this.getUnite_origine(), this.getUnite_cible(), this.getValeur_unite());
				f.kelvin(this.getUnite_origine(), this.getUnite_cible(), this.getValeur_unite());
				f.newton(this.getUnite_origine(), this.getUnite_cible(), this.getValeur_unite());
			
			////Methods allows to convert units of system byte between them  according to the number
			
				f.bit(this.getUnite_origine(), this.getUnite_cible(), this.getValeur_unite());
				f.octet(this.getUnite_origine(), this.getUnite_cible(), this.getValeur_unite());
				f.ko(this.getUnite_origine(), this.getUnite_cible(), this.getValeur_unite());
				f.mo(this.getUnite_origine(), this.getUnite_cible(), this.getValeur_unite());
				f.go(this.getUnite_origine(), this.getUnite_cible(), this.getValeur_unite());
			
			}
		}
		
