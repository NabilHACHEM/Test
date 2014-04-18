ublic class Conversion {
			
			//Attributs	
		
			private String unite_origine;
			private String unite_cible;
			private float valeur_unite;
			
			//Constructeurs
			
			public Conversion() {
				super();
				convertir_unite();
			}
			
			public Conversion(String unit_orig,String unit_cib, float val_unit){
				this.unite_cible=unit_cib;
				this.unite_origine=unit_orig;
				this.valeur_unite=val_unit;
				//convertir_unite();
			}
			
			//Getters & setters
			
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
			
			
			//M�thode permettant de convertir les unit�s
			
			
			public void convertir_unite(){
								
				Formule f=new Formule();
				
			//Les formules permettant de multiplier les unit�s entre eux selon la valeur	
				
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

			//Les formules permettant de diviser les unit�s entre eux selon la valeur	
				
				f.diviserUniteParUn(this.getUnite_origine(), this.getUnite_cible(), this.getValeur_unite());
				f.diviserUniteParDix(this.getUnite_origine(), this.getUnite_cible(), this.getValeur_unite());
				f.diviserUniteParCent(this.getUnite_origine(), this.getUnite_cible(), this.getValeur_unite());
				f.diviserUniteParMille(this.getUnite_origine(), this.getUnite_cible(), this.getValeur_unite());
				f.diviserUniteParDixMille(this.getUnite_origine(), this.getUnite_cible(), this.getValeur_unite());
				f.diviserUniteParCentMille(this.getUnite_origine(), this.getUnite_cible(), this.getValeur_unite());
				f.diviserUniteParUnMillion(this.getUnite_origine(), this.getUnite_cible(), this.getValeur_unite());
				f.diviserUniteParUnMillion(this.getUnite_origine(), this.getUnite_cible(), this.getValeur_unite());
				
			//Les formules permettant de convertir les devises entre eux
				
				f.euro(this.getUnite_origine(), this.getUnite_cible(), this.getValeur_unite());
				f.dollar(this.getUnite_origine(), this.getUnite_cible(), this.getValeur_unite());
				f.Pound(this.getUnite_origine(), this.getUnite_cible(), this.getValeur_unite());
				f.Yen(this.getUnite_origine(), this.getUnite_cible(), this.getValeur_unite());
				
			//Les formules permettant de convertir les unit�s de temps entre eux
				
				f.heure(this.getUnite_origine(), this.getUnite_cible(), this.getValeur_unite());
				f.minute(this.getUnite_origine(), this.getUnite_cible(), this.getValeur_unite());

			//Les formules permettant de convertir les unit�s de vitesse entre eux	
				
				f.kmph(this.getUnite_origine(), this.getUnite_cible(), this.getValeur_unite());
				f.mps(this.getUnite_origine(), this.getUnite_cible(), this.getValeur_unite());
				f.milesph(this.getUnite_origine(), this.getUnite_cible(), this.getValeur_unite());
				
			//Les formules permettant de convertir les unit�s de temp�rature entre eux	
				
				f.celsius(this.getUnite_origine(), this.getUnite_cible(), this.getValeur_unite());
				f.kelvin(this.getUnite_origine(), this.getUnite_cible(), this.getValeur_unite());
				f.newton(this.getUnite_origine(), this.getUnite_cible(), this.getValeur_unite());
			
			//Les formules permettant de convertir les unit�s de byte entre eux
				
				f.bit(this.getUnite_origine(), this.getUnite_cible(), this.getValeur_unite());
				f.octet(this.getUnite_origine(), this.getUnite_cible(), this.getValeur_unite());
				f.ko(this.getUnite_origine(), this.getUnite_cible(), this.getValeur_unite());
				f.mo(this.getUnite_origine(), this.getUnite_cible(), this.getValeur_unite());
				f.go(this.getUnite_origine(), this.getUnite_cible(), this.getValeur_unite());
			
			}
		}
		
