public class Formule {
	
				/**
				   @author Nabil HACHEM
				   @version 2.0
			           @since 2014-04-18
				  */
	
	
			//Attributs	
	
			static private Metrique met;
			static private Finance fin;
			static private Poids p;
			static private Temps t;
			static private Volume v;
			static private Superficie s;
			static private Vitesse vit;
			static private Temperature temp;
			static private Byte b;
			
			
			//Constructeurs
			
			public Formule(){
				 met=new Metrique("km","hm","dam","m","dm","cm","mm");
				 fin=new Finance("euro","dollar","pound","yen");
				 p=new Poids("tonne", "quintal","kg","hg","dag","g","dg","cg","mg");
				 t=new Temps("annee", "mois", "semaine", "jour", "heure", "minute", "secondes", "millisecondes", "microsecondes", "nanosecondes");
				 v=new Volume("m3","dm3","cm3","l","dl","cl","ml");
				 s=new Superficie("km2","hm2","dam2","m2","dm2","cm2","mm2");
				 vit=new Vitesse("kmph","mps","milesph");
				 temp=new Temperature("celsius", "kelvin", "newton");
				 b=new Byte("bit","octet","ko","mo","go");
				
			}
			
			//M�thode permettant d'abord de comparer et ensuite de multiplier les unit�s par un
			
			public static double multiplierUniteParUn(String unite_depart, String unite_arrivee, double val){
				if((unite_depart.equalsIgnoreCase(v.getDm3()) && unite_arrivee.equalsIgnoreCase(v.getL())) || (unite_depart.equalsIgnoreCase(v.getCm3()) && unite_arrivee.equalsIgnoreCase(v.getL())) || (unite_depart.equalsIgnoreCase(v.getL()) && unite_arrivee.equalsIgnoreCase(v.getDm3())) ||(unite_depart.equalsIgnoreCase(v.getMl()) && unite_arrivee.equalsIgnoreCase(v.getCm3()))
						||(unite_depart.equalsIgnoreCase(v.getM3()) && unite_arrivee.equalsIgnoreCase(v.getM3())) || (unite_depart.equalsIgnoreCase(v.getDm3()) && unite_arrivee.equalsIgnoreCase(v.getDm3())) ||(unite_depart.equalsIgnoreCase(v.getCm3()) && unite_arrivee.equalsIgnoreCase(v.getCm3())) ||(unite_depart.equalsIgnoreCase(v.getL()) && unite_arrivee.equalsIgnoreCase(v.getL())) ||(unite_depart.equalsIgnoreCase(v.getDl()) && unite_arrivee.equalsIgnoreCase(v.getDl())) ||(unite_depart.equalsIgnoreCase(v.getCl()) && unite_arrivee.equalsIgnoreCase(v.getCl()))||(unite_depart.equalsIgnoreCase(v.getMl()) && unite_arrivee.equalsIgnoreCase(v.getMl())) 
						||(unite_depart.equalsIgnoreCase(met.getKm()) && unite_arrivee.equalsIgnoreCase(met.getKm())) ||(unite_depart.equalsIgnoreCase(met.getHm()) && unite_arrivee.equalsIgnoreCase(met.getHm()))||(unite_depart.equalsIgnoreCase(met.getDam()) && unite_arrivee.equalsIgnoreCase(met.getDam()))||(unite_depart.equalsIgnoreCase(met.getM()) && unite_arrivee.equalsIgnoreCase(met.getM()))||(unite_depart.equalsIgnoreCase(met.getDm()) && unite_arrivee.equalsIgnoreCase(met.getDm()))||(unite_depart.equalsIgnoreCase(met.getCm()) && unite_arrivee.equalsIgnoreCase(met.getCm()))||(unite_depart.equalsIgnoreCase(met.getMm()) && unite_arrivee.equalsIgnoreCase(met.getMm()))
						||(unite_depart.equalsIgnoreCase(t.getAnnee()) && unite_arrivee.equalsIgnoreCase(t.getAnnee())) ||(unite_depart.equalsIgnoreCase(t.getMois()) && unite_arrivee.equalsIgnoreCase(t.getMois())) ||(unite_depart.equalsIgnoreCase(t.getSecondes()) && unite_arrivee.equalsIgnoreCase(t.getSecondes()))||(unite_depart.equalsIgnoreCase(t.getSemaine()) && unite_arrivee.equalsIgnoreCase(t.getSemaine()))||(unite_depart.equalsIgnoreCase(t.getHeure()) && unite_arrivee.equalsIgnoreCase(t.getHeure()))||(unite_depart.equalsIgnoreCase(t.getJour()) && unite_arrivee.equalsIgnoreCase(t.getJour()))||(unite_depart.equalsIgnoreCase(t.getMinute()) && unite_arrivee.equalsIgnoreCase(t.getMinute())) || (unite_depart.equalsIgnoreCase(t.getMillisecondes()) && unite_arrivee.equalsIgnoreCase(t.getMillisecondes())) || (unite_depart.equalsIgnoreCase(t.getMicrosecondes()) && unite_arrivee.equalsIgnoreCase(t.getMicrosecondes())) ||(unite_depart.equalsIgnoreCase(t.getNanosecondes()) && unite_arrivee.equalsIgnoreCase(t.getNanosecondes()))
						||(unite_depart.equalsIgnoreCase(p.getTonne()) && unite_arrivee.equalsIgnoreCase(p.getTonne())) ||(unite_depart.equalsIgnoreCase(p.getQuintal()) && unite_arrivee.equalsIgnoreCase(p.getQuintal()))||(unite_depart.equalsIgnoreCase(p.getKg()) && unite_arrivee.equalsIgnoreCase(p.getKg()))||(unite_depart.equalsIgnoreCase(p.getHg()) && unite_arrivee.equalsIgnoreCase(p.getHg()))||(unite_depart.equalsIgnoreCase(p.getDag()) && unite_arrivee.equalsIgnoreCase(p.getDag()))||(unite_depart.equalsIgnoreCase(p.getG()) && unite_arrivee.equalsIgnoreCase(p.getG())) ||(unite_depart.equalsIgnoreCase(p.getDg()) && unite_arrivee.equalsIgnoreCase(p.getDg()))||(unite_depart.equalsIgnoreCase(p.getCg()) && unite_arrivee.equalsIgnoreCase(p.getCg()))||(unite_depart.equalsIgnoreCase(p.getMg()) && unite_arrivee.equalsIgnoreCase(p.getMg()))
						||(unite_depart.equalsIgnoreCase(fin.getDollar()) && unite_arrivee.equalsIgnoreCase(fin.getDollar()))||(unite_depart.equalsIgnoreCase(fin.getYen()) && unite_arrivee.equalsIgnoreCase(fin.getYen()))||(unite_depart.equalsIgnoreCase(fin.getEuro()) && unite_arrivee.equalsIgnoreCase(fin.getEuro()))||(unite_depart.equalsIgnoreCase(fin.getPound()) && unite_arrivee.equalsIgnoreCase(fin.getPound()))
						||(unite_depart.equalsIgnoreCase(s.getKm2()) && unite_arrivee.equalsIgnoreCase(s.getKm2())) ||(unite_depart.equalsIgnoreCase(s.getHm2()) && unite_arrivee.equalsIgnoreCase(s.getHm2()))||(unite_depart.equalsIgnoreCase(s.getDam2()) && unite_arrivee.equalsIgnoreCase(s.getDam2()))||(unite_depart.equalsIgnoreCase(s.getM2()) && unite_arrivee.equalsIgnoreCase(s.getM2()))||(unite_depart.equalsIgnoreCase(s.getDm2()) && unite_arrivee.equalsIgnoreCase(s.getDm2()))||(unite_depart.equalsIgnoreCase(s.getCm2()) && unite_arrivee.equalsIgnoreCase(s.getCm2()))||(unite_depart.equalsIgnoreCase(s.getMm2()) && unite_arrivee.equalsIgnoreCase(s.getMm2())) 
						||(unite_depart.equalsIgnoreCase(vit.getKmph()) && unite_arrivee.equalsIgnoreCase(vit.getKmph()))||(unite_depart.equalsIgnoreCase(vit.getMps()) && unite_arrivee.equalsIgnoreCase(vit.getMps()))||(unite_depart.equalsIgnoreCase(vit.getMilesph()) && unite_arrivee.equalsIgnoreCase(vit.getMilesph()))
						||(unite_depart.equalsIgnoreCase(temp.getCelsius()) && unite_arrivee.equalsIgnoreCase(temp.getCelsius()))||(unite_depart.equalsIgnoreCase(temp.getKelvin()) && unite_arrivee.equalsIgnoreCase(temp.getKelvin()))||(unite_depart.equalsIgnoreCase(temp.getNewton()) && unite_arrivee.equalsIgnoreCase(temp.getNewton()))
						||(unite_depart.equalsIgnoreCase(b.getBit()) && unite_arrivee.equalsIgnoreCase(b.getBit()))||(unite_depart.equalsIgnoreCase(b.getOctet()) && unite_arrivee.equalsIgnoreCase(b.getOctet()))||(unite_depart.equalsIgnoreCase(b.getKo()) && unite_arrivee.equalsIgnoreCase(b.getKo()))||(unite_depart.equalsIgnoreCase(b.getMo()) && unite_arrivee.equalsIgnoreCase(b.getMo()))||(unite_depart.equalsIgnoreCase(b.getGo()) && unite_arrivee.equalsIgnoreCase(b.getGo())))
				{
					val=val*1;
					System.out.print(val);
					
				}	
					return val;
			
			}
			
			//M�thode permettant d'abord de comparer et ensuite de multiplier les unit�s par dix
			
			
			public static double multiplierUniteParDix(String unite_depart, String unite_arrivee, double val){
				
				if((unite_depart.equalsIgnoreCase(p.getTonne())&& unite_arrivee.equalsIgnoreCase(p.getQuintal())) 
					|| (unite_depart.equalsIgnoreCase(p.getQuintal()) && unite_arrivee.equalsIgnoreCase(p.getKg())) || (unite_depart.equalsIgnoreCase(p.getKg()) && unite_arrivee.equalsIgnoreCase(p.getHg())) || (unite_depart.equalsIgnoreCase(p.getHg()) && unite_arrivee.equalsIgnoreCase(p.getDag())) || (unite_depart.equalsIgnoreCase(p.getDag()) && unite_arrivee.equalsIgnoreCase(p.getG())) || (unite_depart.equalsIgnoreCase(p.getG()) && unite_arrivee.equalsIgnoreCase(p.getDg())) || (unite_depart.equalsIgnoreCase(p.getDg()) && unite_arrivee.equalsIgnoreCase(p.getCg())) || (unite_depart.equalsIgnoreCase(p.getCg()) && unite_arrivee.equalsIgnoreCase(p.getMg()))
					||(unite_depart.equalsIgnoreCase(met.getKm()) && unite_arrivee.equalsIgnoreCase(met.getHm())) || (unite_depart.equalsIgnoreCase(met.getHm()) && unite_arrivee.equalsIgnoreCase(met.getDam())) || (unite_depart.equalsIgnoreCase(met.getDam()) && unite_arrivee.equalsIgnoreCase(met.getM())) || (unite_depart.equalsIgnoreCase(met.getM()) && unite_arrivee.equalsIgnoreCase(met.getDm())) || (unite_depart.equalsIgnoreCase(met.getDm()) && unite_arrivee.equalsIgnoreCase(met.getCm())) || (unite_depart.equalsIgnoreCase(met.getCm()) && unite_arrivee.equalsIgnoreCase(met.getMm()))
					||(unite_depart.equalsIgnoreCase(v.getDm3()) && unite_arrivee.equalsIgnoreCase(v.getDl())) ||(unite_depart.equalsIgnoreCase(v.getL()) && unite_arrivee.equalsIgnoreCase(v.getDl())) || (unite_depart.equalsIgnoreCase(v.getDl()) && unite_arrivee.equalsIgnoreCase(v.getCl())) ||(unite_depart.equalsIgnoreCase(v.getCl()) && unite_arrivee.equalsIgnoreCase(v.getCm3()))||(unite_depart.equalsIgnoreCase(v.getCl()) && unite_arrivee.equalsIgnoreCase(v.getMl())))
				{
					
					val=val*10;
					System.out.print(val);
					
				}
					return val;
				
			
			}
			
			//M�thode permettant d'abord de comparer et ensuite de multiplier les unit�s par mille
			
			public static float multiplierUniteParMille(String unite_depart, String unite_arrivee, float val){
				if((unite_depart.equalsIgnoreCase(p.getTonne()) && unite_arrivee.equalsIgnoreCase(p.getKg())) || (unite_depart.equalsIgnoreCase(p.getQuintal()) && unite_arrivee.equalsIgnoreCase(p.getDag())) || (unite_depart.equalsIgnoreCase(p.getKg()) && unite_arrivee.equalsIgnoreCase(p.getG())) || (unite_depart.equalsIgnoreCase(p.getHg()) && unite_arrivee.equalsIgnoreCase(p.getDg())) || (unite_depart.equalsIgnoreCase(p.getDag()) && unite_arrivee.equalsIgnoreCase(p.getCg())) || (unite_depart.equalsIgnoreCase(p.getG()) && unite_arrivee.equalsIgnoreCase(p.getMg())) 
					||(unite_depart.equalsIgnoreCase(met.getKm()) && unite_arrivee.equalsIgnoreCase(met.getM())) || (unite_depart.equalsIgnoreCase(met.getHm()) && unite_arrivee.equalsIgnoreCase(met.getDm())) || (unite_depart.equalsIgnoreCase(met.getDam()) && unite_arrivee.equalsIgnoreCase(met.getCm())) || (unite_depart.equalsIgnoreCase(met.getM()) && unite_arrivee.equalsIgnoreCase(met.getMm())) 
					|| (unite_depart.equalsIgnoreCase(v.getM3()) && unite_arrivee.equalsIgnoreCase(v.getDm3())) || (unite_depart.equalsIgnoreCase(v.getL()) && unite_arrivee.equalsIgnoreCase(v.getMl())) || (unite_depart.equalsIgnoreCase(v.getDm3()) && unite_arrivee.equalsIgnoreCase(v.getMl())) ||(unite_depart.equalsIgnoreCase(v.getDm3()) && unite_arrivee.equalsIgnoreCase(v.getL())) || (unite_depart.equalsIgnoreCase(v.getDm3()) && unite_arrivee.equalsIgnoreCase(v.getCm3())) || (unite_depart.equalsIgnoreCase(v.getM3()) && unite_arrivee.equalsIgnoreCase(v.getL())) || (unite_depart.equalsIgnoreCase(v.getL()) && unite_arrivee.equalsIgnoreCase(v.getCm3()))) 
				{
					val=val*1000;
					System.out.print(val);
					
				}
					return val;
			}
			
			//M�thode permettant d'abord de comparer et ensuite de multiplier les unit�s par cent
			
			public static float multiplierUniteParCent(String unite_depart, String unite_arrivee, float val){
				if((unite_depart.equalsIgnoreCase(p.getTonne()) && unite_arrivee.equalsIgnoreCase(p.getKg())) || (unite_depart.equalsIgnoreCase(p.getQuintal()) && unite_arrivee.equalsIgnoreCase(p.getHg())) || (unite_depart.equalsIgnoreCase(p.getKg()) && unite_arrivee.equalsIgnoreCase(p.getDag())) || (unite_depart.equalsIgnoreCase(p.getHg()) && unite_arrivee.equalsIgnoreCase(p.getG())) || (unite_depart.equalsIgnoreCase(p.getDag()) && unite_arrivee.equalsIgnoreCase(p.getDg())) || (unite_depart.equalsIgnoreCase(p.getG()) && unite_arrivee.equalsIgnoreCase(p.getCg())) || (unite_depart.equalsIgnoreCase(p.getDg()) && unite_arrivee.equalsIgnoreCase(p.getMg()))
						||(unite_depart.equalsIgnoreCase(met.getKm()) && unite_arrivee.equalsIgnoreCase(met.getDam())) || (unite_depart.equalsIgnoreCase(met.getHm()) && unite_arrivee.equalsIgnoreCase(met.getM())) || (unite_depart.equalsIgnoreCase(met.getDam()) && unite_arrivee.equalsIgnoreCase(met.getDm())) || (unite_depart.equalsIgnoreCase(met.getM()) && unite_arrivee.equalsIgnoreCase(met.getCm())) || (unite_depart.equalsIgnoreCase(met.getDm()) && unite_arrivee.equalsIgnoreCase(met.getMm()))
						||(unite_depart.equalsIgnoreCase(v.getDm3()) && unite_arrivee.equalsIgnoreCase(v.getCl())) ||(unite_depart.equalsIgnoreCase(v.getL()) && unite_arrivee.equalsIgnoreCase(v.getCl())) ||(unite_depart.equalsIgnoreCase(v.getDl()) && unite_arrivee.equalsIgnoreCase(v.getCm3())) ||(unite_depart.equalsIgnoreCase(v.getDl()) && unite_arrivee.equalsIgnoreCase(v.getMl())) 
						||(unite_depart.equalsIgnoreCase(s.getKm2()) && unite_arrivee.equalsIgnoreCase(s.getHm2()))||(unite_depart.equalsIgnoreCase(s.getHm2()) && unite_arrivee.equalsIgnoreCase(s.getDam2()))||(unite_depart.equalsIgnoreCase(s.getDam2()) && unite_arrivee.equalsIgnoreCase(s.getM2()))||(unite_depart.equalsIgnoreCase(s.getM2()) && unite_arrivee.equalsIgnoreCase(s.getDm2()))||(unite_depart.equalsIgnoreCase(s.getDm2()) && unite_arrivee.equalsIgnoreCase(s.getCm2()))||(unite_depart.equalsIgnoreCase(s.getCm2()) && unite_arrivee.equalsIgnoreCase(s.getMm2())))
					{
						val=val*100;
						System.out.print(val);
					}
						return val;
						
				}
			
			//M�thode permettant d'abord de comparer et ensuite de multiplier les unit�s par dix mille
			
			public static float multiplierUniteParDixMille(String unite_depart, String unite_arrivee, float val){
				if((unite_depart.equalsIgnoreCase(p.getTonne()) && unite_arrivee.equalsIgnoreCase(p.getDag())) || (unite_depart.equalsIgnoreCase(p.getQuintal()) && unite_arrivee.equalsIgnoreCase(p.getG())) || (unite_depart.equalsIgnoreCase(p.getKg()) && unite_arrivee.equalsIgnoreCase(p.getDg())) || (unite_depart.equalsIgnoreCase(p.getHg()) && unite_arrivee.equalsIgnoreCase(p.getCg())) || (unite_depart.equalsIgnoreCase(p.getDag()) && unite_arrivee.equalsIgnoreCase(p.getMg())) 
						||(unite_depart.equalsIgnoreCase(met.getKm()) && unite_arrivee.equalsIgnoreCase(met.getDm())) || (unite_depart.equalsIgnoreCase(met.getHm()) && unite_arrivee.equalsIgnoreCase(met.getCm())) || (unite_depart.equalsIgnoreCase(met.getDam()) && unite_arrivee.equalsIgnoreCase(met.getMm()))
						||(unite_depart.equalsIgnoreCase(v.getM3()) && unite_arrivee.equalsIgnoreCase(v.getDl())) ||(unite_depart.equalsIgnoreCase(v.getL()) && unite_arrivee.equalsIgnoreCase(v.getMl())) 
						||(unite_depart.equalsIgnoreCase(s.getKm2()) && unite_arrivee.equalsIgnoreCase(s.getDam2()))||(unite_depart.equalsIgnoreCase(s.getHm2()) && unite_arrivee.equalsIgnoreCase(s.getM2()))||(unite_depart.equalsIgnoreCase(s.getDam2()) && unite_arrivee.equalsIgnoreCase(s.getDm2()))||(unite_depart.equalsIgnoreCase(s.getM2()) && unite_arrivee.equalsIgnoreCase(s.getCm2()))||(unite_depart.equalsIgnoreCase(s.getDm2()) && unite_arrivee.equalsIgnoreCase(s.getMm2())))
					{
						val=val*10000;
						System.out.print(val);
						
					}
						return val;
				}
			
			//M�thode permettant d'abord de comparer et ensuite de multiplier les unit�s par cent mille
			
			public float multiplierUniteParCentMille(String unite_depart, String unite_arrivee, float val){
				if((unite_depart.equalsIgnoreCase(p.getTonne()) && unite_arrivee.equalsIgnoreCase(p.getG())) || (unite_depart.equalsIgnoreCase(p.getQuintal()) && unite_arrivee.equalsIgnoreCase(p.getDg())) || (unite_depart.equalsIgnoreCase(p.getKg()) && unite_arrivee.equalsIgnoreCase(p.getCg())) || (unite_depart.equalsIgnoreCase(p.getHg()) && unite_arrivee.equalsIgnoreCase(p.getMg()))  
						||(unite_depart.equalsIgnoreCase(met.getKm()) && unite_arrivee.equalsIgnoreCase(met.getCm())) || (unite_depart.equalsIgnoreCase(met.getHm()) && unite_arrivee.equalsIgnoreCase(met.getMm()))  
						||(unite_depart.equalsIgnoreCase(v.getM3()) && unite_arrivee.equalsIgnoreCase(v.getCl())))
					{
						val=val*100000;
						System.out.print(val);
					}
						return val;
				}
			
			//M�thode permettant d'abord de comparer et ensuite de multiplier les unit�s par un million
			
			public float multiplierUniteParUnMillion(String unite_depart, String unite_arrivee, float val){
				if((unite_depart.equalsIgnoreCase(p.getTonne()) && unite_arrivee.equalsIgnoreCase(p.getDg())) || (unite_depart.equalsIgnoreCase(p.getQuintal()) && unite_arrivee.equalsIgnoreCase(p.getCg())) || (unite_depart.equalsIgnoreCase(p.getKg()) && unite_arrivee.equalsIgnoreCase(p.getMg()))  
						||(unite_depart.equalsIgnoreCase(met.getKm()) && unite_arrivee.equalsIgnoreCase(met.getMm()))
						||(unite_depart.equalsIgnoreCase(v.getM3()) && unite_arrivee.equalsIgnoreCase(v.getCm3())) ||(unite_depart.equalsIgnoreCase(v.getM3()) && unite_arrivee.equalsIgnoreCase(v.getMl()))
						||(unite_depart.equalsIgnoreCase(s.getKm2()) && unite_arrivee.equalsIgnoreCase(s.getM2()))||(unite_depart.equalsIgnoreCase(s.getHm2()) && unite_arrivee.equalsIgnoreCase(s.getDm2()))||(unite_depart.equalsIgnoreCase(s.getDam2()) && unite_arrivee.equalsIgnoreCase(s.getCm2()))||(unite_depart.equalsIgnoreCase(s.getM2()) && unite_arrivee.equalsIgnoreCase(s.getMm2()))) 
					{
						val=val*1000000;
						System.out.print(val);
					}
						return val;
				}
			
			//M�thode permettant d'abord de comparer et ensuite de multiplier les unit�s par dix million
			
			public static float multiplierUniteParDixMillion(String unite_depart, String unite_arrivee, float val){
				if((unite_depart.equalsIgnoreCase(s.getKm2()) && unite_arrivee.equalsIgnoreCase(s.getDm2() ))) 
					{
						val=val*10000000;
						System.out.print(val);
					}
						return val;
				}
			
			//M�thode permettant d'abord de comparer et ensuite de multiplier les unit�s par cent million
			
			public float multiplierUniteParCentMillion(String unite_depart, String unite_arrivee, float val){
				if((unite_depart==s.getKm2() && unite_arrivee==s.getCm2() )||(unite_depart==s.getHm2() && unite_arrivee==s.getCm2())||(unite_depart==s.getDam2() && unite_arrivee==s.getMm2())) 
					{
						val=val*100000000;
						System.out.print(val);
					}
						return val;
				}
			//M�thode permettant d'abord de comparer et ensuite de multiplier les unit�s par un milliard
		
			public static float multiplierUniteParUnMilliard(String unite_depart, String unite_arrivee, float val){
				if((unite_depart==s.getKm2() && unite_arrivee==s.getMm2() )) 
					{
						val=val*1000000000;
						System.out.print(val);
					}
						return val;
				}
			
			//M�thode permettant d'abord de comparer et ensuite de diviser les unit�s par un
				
			public float diviserUniteParUn(String unite_depart, String unite_arrivee, float val){
				if((unite_depart==v.getL() && unite_arrivee==v.getDm3()) || (unite_depart==v.getL() && unite_arrivee==v.getM3()) ||(unite_depart==v.getL() && unite_arrivee==v.getCm3()) ||(unite_depart==v.getCm3() && unite_arrivee==v.getDm3()) ||(unite_depart==v.getCm3() && unite_arrivee==v.getL())||(unite_depart==v.getMl() && unite_arrivee==v.getDm3())||(unite_depart==v.getMl() && unite_arrivee==v.getL())) 
				{
					val=val/1;
					System.out.print(val);
				}
				
					return val;
				}
			
			//M�thode permettant d'abord de comparer et ensuite de diviser les unit�s par dix
			
		   public static float diviserUniteParDix(String unite_depart, String unite_arrivee, float val){
			   if((unite_depart==p.getMg() && unite_arrivee==p.getCg()) || (unite_depart==p.getCg() && unite_arrivee==p.getDg()) || (unite_depart==p.getDg() && unite_arrivee==p.getG()) || (unite_depart==p.getG() && unite_arrivee==p.getDag()) || (unite_depart==p.getDag() && unite_arrivee==p.getHg()) || (unite_depart==p.getHg() && unite_arrivee==p.getKg()) || (unite_depart==p.getKg() && unite_arrivee==p.getQuintal()) || (unite_depart==p.getQuintal() && unite_arrivee==p.getTonne())
						||(unite_depart==met.getMm() && unite_arrivee==met.getCm()) || (unite_depart==met.getCm() && unite_arrivee==met.getDm()) || (unite_depart==met.getDm() && unite_arrivee==met.getM()) || (unite_depart==met.getM() && unite_arrivee==met.getDam()) || (unite_depart==met.getDam() && unite_arrivee==met.getHm()) || (unite_depart==met.getHm() && unite_arrivee==met.getKm())
						||(unite_depart==v.getDl() && unite_arrivee==v.getDm3()) ||(unite_depart==v.getL() && unite_arrivee==v.getDl()) ||(unite_depart==v.getCm3() && unite_arrivee==v.getDl())||(unite_depart==v.getCl() && unite_arrivee==v.getDm3()) ||(unite_depart==v.getCl() && unite_arrivee==v.getL())||(unite_depart==v.getMl() && unite_arrivee==v.getDl())
						||(unite_depart==s.getHm2() && unite_arrivee==s.getKm2()) ||(unite_depart==s.getDam2() && unite_arrivee==s.getHm2())||(unite_depart==s.getM2() && unite_arrivee==s.getDam2())||(unite_depart==s.getDm2() && unite_arrivee==s.getM2())||(unite_depart==s.getMm2() && unite_arrivee==s.getCm2())) 
					{
						val=val/10;
						System.out.print(val);
					}
				return val;
		   		}
		   
		     //M�thode permettant d'abord de comparer et ensuite de diviser les unit�s par cent
		   
		   public float diviserUniteParCent(String unite_depart, String unite_arrivee, float val){
			   if((unite_depart==p.getMg() && unite_arrivee==p.getDg()) || (unite_depart==p.getCg() && unite_arrivee==p.getG()) || (unite_depart==p.getDg() && unite_arrivee==p.getDag()) || (unite_depart==p.getG() && unite_arrivee==p.getHg()) || (unite_depart==p.getDag() && unite_arrivee==p.getKg()) || (unite_depart==p.getHg() && unite_arrivee==p.getQuintal()) || (unite_depart==p.getKg() && unite_arrivee==p.getTonne()) 
						||(unite_depart==met.getMm() && unite_arrivee==met.getDm()) || (unite_depart==met.getCm() && unite_arrivee==met.getM()) || (unite_depart==met.getDm() && unite_arrivee==met.getDam()) || (unite_depart==met.getM() && unite_arrivee==met.getHm()) || (unite_depart==met.getDam() && unite_arrivee==met.getKm()) 
						||(unite_depart==v.getCl() && unite_arrivee==v.getDm3())  ||(unite_depart==v.getCl() && unite_arrivee==v.getL()) ||(unite_depart==v.getCm3() && unite_arrivee==v.getCl()) || (unite_depart==v.getDl() && unite_arrivee==v.getDm3()) || (unite_depart==v.getDl() && unite_arrivee==v.getL()) ||(unite_depart==v.getCl() && unite_arrivee==v.getDl())||(unite_depart==v.getMl() && unite_arrivee==v.getCl())) 
					{
						val=val/100;
						System.out.print(val);
					}
				return val;
			   
		   		}
			
		   	  //M�thode permettant d'abord de comparer et ensuite de diviser les unit�s par mille
		   
		   public static float diviserUniteParMille(String unite_depart, String unite_arrivee, float val){
			   if((unite_depart==p.getMg() && unite_arrivee==p.getG()) || (unite_depart==p.getCg() && unite_arrivee==p.getDag()) || (unite_depart==p.getDg() && unite_arrivee==p.getHg()) || (unite_depart==p.getG() && unite_arrivee==p.getKg()) || (unite_depart==p.getDag() && unite_arrivee==p.getQuintal()) || (unite_depart==p.getHg() && unite_arrivee==p.getTonne())  
						||(unite_depart==met.getMm() && unite_arrivee==met.getM()) || (unite_depart==met.getCm() && unite_arrivee==met.getDam()) || (unite_depart==met.getDm() && unite_arrivee==met.getHm()) || (unite_depart==met.getM() && unite_arrivee==met.getKm()) 
						|| (unite_depart==v.getDm3() && unite_arrivee==v.getM3()) || (unite_depart==v.getMl() && unite_arrivee==v.getL()) || (unite_depart==v.getMl() && unite_arrivee==v.getDm3()) || (unite_depart==v.getCm3() && unite_arrivee==v.getDm3()) || (unite_depart==v.getL() && unite_arrivee==v.getM3())||(unite_depart==v.getCm3() && unite_arrivee==v.getMl())
						|| (unite_depart==b.getOctet() && unite_arrivee==b.getKo())|| (unite_depart==b.getKo() && unite_arrivee==b.getMo())|| (unite_depart==b.getMo() && unite_arrivee==b.getGo())) 
					{
						val=val/1000;
						System.out.print(val);
					}
				return val;
		   		}
		   
		       //M�thode permettant d'abord de comparer et ensuite de diviser les unit�s par dix mille
		   
		   public float diviserUniteParDixMille(String unite_depart, String unite_arrivee, float val){
			   if((unite_depart==p.getMg() && unite_arrivee==p.getDag()) || (unite_depart==p.getCg() && unite_arrivee==p.getHg()) || (unite_depart==p.getDg() && unite_arrivee==p.getKg()) || (unite_depart==p.getG() && unite_arrivee==p.getQuintal()) || (unite_depart==p.getDag() && unite_arrivee==p.getTonne())   
						||(unite_depart==met.getMm() && unite_arrivee==met.getDam()) || (unite_depart==met.getCm() && unite_arrivee==met.getHm()) || (unite_depart==met.getDm() && unite_arrivee==met.getKm())  
						||(unite_depart==v.getDl() && unite_arrivee==v.getM3())||(unite_depart==s.getCm2() && unite_arrivee==s.getDm2()))
					{
						val=val/10000;
						System.out.print(val);
					}
				return val;
			   
		   	    }
		   
		       //M�thode permettant d'abord de comparer et ensuite de diviser les unit�s par cent mille
		   
		   public static float diviserUniteParCentMille(String unite_depart, String unite_arrivee, float val){
			   if((unite_depart==p.getMg() && unite_arrivee==p.getHg()) || (unite_depart==p.getCg() && unite_arrivee==p.getKg()) || (unite_depart==p.getDg() && unite_arrivee==p.getQuintal()) || (unite_depart==p.getG() && unite_arrivee==p.getTonne())    
						||(unite_depart==met.getMm() && unite_arrivee==met.getHm()) || (unite_depart==met.getCm() && unite_arrivee==met.getKm())   
						||(unite_depart==v.getCl() && unite_arrivee==v.getM3())) 
					{
						val=val/100000;
						System.out.print(val);
					}
				return val;	   
		   	    }
		   
		   	    //M�thode permettant d'abord de comparer et ensuite de diviser les unit�s par un million	
		   
		   public static float diviserUniteParUnMillion(String unite_depart, String unite_arrivee, float val){
			   if((unite_depart==p.getMg() && unite_arrivee==p.getKg()) || (unite_depart==p.getCg() && unite_arrivee==p.getQuintal()) || (unite_depart==p.getDg() && unite_arrivee==p.getTonne())     
						||(unite_depart==met.getMm() && unite_arrivee==met.getKm()) 
						||(unite_depart==v.getCm3() && unite_arrivee==v.getM3() )) 
					{
						val=val/1000000;
						System.out.print(val);
					}
				return val;
				}
		   
		   		//M�thode permettant d'abord de comparer et ensuite de convertir l'euro avec d'autres devises 
		   
		   public static double euro(String unite_depart, String unite_arrivee, double val){
			   double taux_echange=0;
			   		if(unite_depart==fin.getEuro() && unite_arrivee==fin.getDollar())
			   			{
			   				taux_echange=1.3796;
			   				val=Math.round(val*taux_echange);
			   				System.out.print(val);
			   				return val;
			   				
			   			}  
			  
			   		if(unite_depart==fin.getEuro() && unite_arrivee==fin.getPound())
			   			{
			   				taux_echange=0.8368;
			   				val=Math.round(val*taux_echange);
			   				System.out.print(val);
							return val;
			   			}  
			   			
			   		if(unite_depart==fin.getEuro() && unite_arrivee==fin.getYen())
			   			{
			   				taux_echange=141.43;
			   				val=Math.round(val*taux_echange);
			   				System.out.print(val);
						}  
			   				return val;
			     }
		   
		   		//M�thode permettant d'abord de comparer et ensuite de convertir le dollar avec d'autres devises
		   
		   public static double dollar(String unite_depart, String unite_arrivee, double val){
			   double taux_echange=0;
			   		if(unite_depart==fin.getDollar() && unite_arrivee==fin.getEuro())
			   			{
			   				taux_echange=1.3796;
			   				val=Math.round(val*taux_echange);
			   				System.out.print(val);
			   				return val;
			   			} 
			   
			   		if(unite_depart==fin.getDollar() && unite_arrivee==fin.getPound())
			   			{
			   				taux_echange=1.6493;
			   				val=Math.round(val*taux_echange);
			   				System.out.print(val);
			   				return val;
			   			} 
			   
			   		if(unite_depart==fin.getDollar() && unite_arrivee==fin.getYen())
			   			{
			   				taux_echange=102.80;
			   				val=Math.round(val*taux_echange);
			   				System.out.print(val);
			   			}  
			   				return val;
		   		  }
			   
		          //M�thode permettant d'abord de comparer et ensuite de convertir le pound avec d'autres devises
			
		   public static double Pound(String unite_depart, String unite_arrivee, double val){
			   double taux_echange=0;
			   		if(unite_depart==fin.getPound() && unite_arrivee==fin.getEuro())
			   			{
			   				taux_echange=0.8368;
			   				val=Math.round(val*taux_echange);
			   				System.out.print(val);
			   				return val; 
			     		}  	
			
			   		if(unite_depart==fin.getPound() && unite_arrivee==fin.getDollar())
				   		{
			   				taux_echange=1.6493;
			   				val=Math.round(val*taux_echange);
			   				System.out.print(val);
			   				return val; 
				   		}  
					 
					if(unite_depart==fin.getPound() && unite_arrivee==fin.getYen())
			   			{
			   				taux_echange=171.11;
			   				val=Math.round(val*taux_echange);
			   				System.out.print(val);
			   				
						}  
							return val;
			     }
		   
		   		//M�thode permettant d'abord de comparer et ensuite de convertir le yen avec d'autres devises
		   
		   public static double Yen(String unite_depart, String unite_arrivee, double val){
			   double taux_echange=0;
					if(unite_depart==fin.getYen() && unite_arrivee==fin.getEuro())
						{
							taux_echange=141.43;
							val=Math.round(val*taux_echange);
							System.out.print(val);
							return val;
						}  
			
					if(unite_depart==fin.getYen () && unite_arrivee==fin.getDollar())
				   		{
							taux_echange=102.80;
							val=Math.round(val*taux_echange);
							System.out.print(val);
							return val; 
				   		}  
					 
					 
					if(unite_depart==fin.getYen() && unite_arrivee==fin.getPound())
			   			{
			   				taux_echange=171.11;
			   				val=Math.round(val*taux_echange);
			   				System.out.print(val);
						}  
			   				return val;
			     }
		   
		   		//M�thode permettant d'abord de comparer et ensuite de convertir l'heure avec d'autres unit�s du temps
		   
		   public static double heure(String unite_depart, String unite_arrivee, double val){
			  
			   		if(unite_depart==t.getHeure() && unite_arrivee==t.getMinute())
			   			{
				 	   		val=val*60;
				 	   		System.out.print(val);
				 	   		return val;
				 	   		
			   			}  
				  
			   		if(unite_depart==t.getHeure() && unite_arrivee==t.getSecondes())
				   		{
				   			val=val*3600;
				   			System.out.print(val);
				   			return val; 
				   		}  
					
			   		if(unite_depart==t.getHeure() && unite_arrivee==t.getMillisecondes())
				   		{
			   				val=val*3600000;
			   				System.out.print(val);
			   				return val; 
				   		}  
					 
			   		if(unite_depart==t.getHeure() && unite_arrivee==t.getMicrosecondes())
				   		{
			   				val=val*360000000; 
			   				System.out.print(val);
			   				return val;
				   		}  
				 
			   		if(unite_depart==t.getHeure() && unite_arrivee==t.getAnnee())
				   		{
					 
			   				val=val/1000;
			   				System.out.print(val);
			   				return val; 
				   		}	
					 
			   		if(unite_depart==t.getHeure() && unite_arrivee==t.getSemaine())
				   		{
			   				val=val/6000;
			   				System.out.print(val);
					   	}
			   				return val; 	 
			   				
		   			}
		   
		   			//M�thode permettant d'abord de comparer et ensuite de convertir le minute avec d'autres unit�s du temps
		   
		   public static double minute(String unite_depart, String unite_arrivee, double val){
			  
			   		if(unite_depart==t.getMinute() && unite_arrivee==t.getHeure())
			   			{
			   				val=val/60;
			   				System.out.print(val);
			   				return val;
			   			}  
			   
			   		if(unite_depart==t.getMinute() && unite_arrivee==t.getSecondes())
			   			{
			   				val=val*60; 
			   				System.out.print(val);
			   				return val; 
			   			} 
			   
			   		if(unite_depart==t.getMinute() && unite_arrivee==t.getMillisecondes())
			   			{
				 
			   				val=val*60000;
			   				System.out.print(val);
			   				return val; 
			   			}  
				 
			   		if(unite_depart==t.getMinute() && unite_arrivee==t.getMicrosecondes())
			   			{
			   				val=val*60000000; 
			   				System.out.print(val);
			   				return val;
			   			}  
			 	 
			   		if(unite_depart==t.getMinute() && unite_arrivee==t.getSemaine())
			   			{
			   				val=val/10000;
			   				System.out.print(val);
			   			}
			   				return val; 	 
		
		   			}
		   
		   			//M�thode permettant d'abord de comparer et ensuite de convertir le kilom�tre par heure avec d'autres unit�s de vitesse
		   
		   public static double kmph(String unite_depart, String unite_arrivee, double val){
			   		if(unite_depart==vit.getKmph() && unite_arrivee==vit.getMps())
			   			{
			   				val=val*0.278;
			   				System.out.print(val);
			   				return val;
			   			}
				
				     if(unite_depart==vit.getKmph() && unite_arrivee==vit.getMilesph())
				     	{
				    	 	val=val*0.621;
				    	 	System.out.print(val);
				     	}
				     		return val;
			
		   			}
		   
		            //M�thode permettant d'abord de comparer et ensuite de convertir le m�tre par secondes avec d'autres unit�s de vitesse
		   
		   public static double mps(String unite_depart, String unite_arrivee, double val){
			   		if(unite_depart==vit.getMps() && unite_arrivee==vit.getKmph())
			   			{
			   				val=val*3.600;
			   				System.out.print(val);
			   				return val;
			   			}
				
			   		if(unite_depart==vit.getMps() && unite_arrivee==vit.getMilesph())
			   			{
			   				val=val*2.237;
			   				System.out.print(val);
			   			}
			   				return val;
		
		   			}
		   
		   			//M�thode permettant d'abord de comparer et ensuite de convertir le mille par heure avec d'autres unit�s de vitesse
		   
		   public static double milesph(String unite_depart, String unite_arrivee, double val){
			   		if(unite_depart==vit.getMilesph() && unite_arrivee==vit.getKmph())
			   			{
			   				val=val*0.447;
			   				System.out.print(val);
			   				return val;
			   			}
				
				   if(unite_depart==vit.getMilesph() && unite_arrivee==vit.getMps())
				   		{
						val=val*2.237;
						System.out.print(val);
						}
				   			return val;
			
		   			}
		   
		   			//M�thode permettant d'abord de comparer et ensuite de convertir le celsius avec d'autres unit�s de temp�rature
		   
		   public static double celsius(String unite_depart, String unite_arrivee, double val){
			   		if(unite_depart==temp.getCelsius() && unite_arrivee==temp.getKelvin())
			   			{
			   				val=val*274.150;
			   				System.out.print(val);
			   				return val;
			   			}
				
			   		if(unite_depart==temp.getCelsius() && unite_arrivee==temp.getNewton())
			   			{
						val=val*0.330;
						System.out.print(val);
			   			}
			   				return val;
					}
		   
		   			//M�thode permettant d'abord de comparer et ensuite de convertir le kelvin avec d'autres unit�s de temp�rature
		   
		   
		   public static double kelvin(String unite_depart, String unite_arrivee, double val){
			   		if(unite_depart==temp.getKelvin() && unite_arrivee==temp.getCelsius())
			   			{
			   				val=val*(-272.150);
			   				System.out.print(val);
			   				return val;
			   			}
				
				   if(unite_depart==temp.getKelvin() && unite_arrivee==temp.getNewton())
				   		{
							val=val*(-89.810);
							System.out.print(val);
				   		}
				   			return val;
					}
		   
		   			//M�thode permettant d'abord de comparer et ensuite de convertir le newton avec d'autres unit�s de temp�rature
		   
		   public static double newton(String unite_depart, String unite_arrivee, double val){
			   		if(unite_depart==temp.getNewton() && unite_arrivee==temp.getCelsius())
			   			{
			   				val=val*3.030;
			   				System.out.print(val);
			   				return val;
			   			}
				
				   if(unite_depart==temp.getNewton() && unite_arrivee==temp.getKelvin())
				   		{
							val=val*276.180;
							System.out.print(val);
				   		}
				   			return val;
					}
		   
		   			//M�thode permettant d'abord de comparer et ensuite de convertir le bit avec d'autres unit�s de Byte
		   
		   public static double bit(String unite_depart, String unite_arrivee, double val){
			   		if(unite_depart==b.getBit() && unite_arrivee==b.getOctet())
			   			{
			   				val=val*0.125;
			   				System.out.print(val);
			   			}
			   				return val;
			 
					}
		   
		   			//M�thode permettant d'abord de comparer et ensuite de convertir l'octet avec d'autres unit�s de Byte
		   
		   
		   public static double octet(String unite_depart, String unite_arrivee, double val){
			   		if(unite_depart==b.getOctet() && unite_arrivee==b.getBit())
			   			{
			   				val=val*8;
			   				System.out.print(val);
			   			}
			   				return val; 
					}
		   
		   			//M�thode permettant d'abord de comparer et ensuite de convertir le kilooctet avec d'autres unit�s de Byte
		   
		   public static double ko(String unite_depart, String unite_arrivee, double val){
			   		if(unite_depart==b.getKo() && unite_arrivee==b.getBit())
			   			{
			   				val=val*8192;
			   				return val;
			   			}
			   
			   		if(unite_depart==b.getKo() && unite_arrivee==b.getOctet())
			   			{
			   				val=val*1024;
			   				System.out.print(val);
			   			}
			   				return val;
			   		}
		   
		   			//M�thode permettant d'abord de comparer et ensuite de convertir le m�gaoctet avec d'autres unit�s de Byte
		   
		   public static double mo(String unite_depart, String unite_arrivee, double val){
			   		if(unite_depart==b.getMo() && unite_arrivee==b.getBit())
			   			{
			   				val=val*838860.8;
			   				System.out.print(val);
			   				return val;
			   			}
			   
			   		if(unite_depart==b.getMo() && unite_arrivee==b.getOctet())
			   			{
			   				val=val*1048576;
			   				System.out.print(val);
			   				return val;
			   			}
			 
			   		if(unite_depart==b.getMo() && unite_arrivee==b.getKo())
			   			{
			   				val=val*1024;
			   				System.out.print(val);
			   			}
			   				return val;
					}
		   
		   			//M�thode permettant d'abord de comparer et ensuite de convertir le gigaoctet avec d'autres unit�s de Byte
		   
		   public static double go(String unite_depart, String unite_arrivee, double val){
			   		if(unite_depart==b.getGo() && unite_arrivee==b.getBit())
			   			{
			   				val=val*858993459;
			   				System.out.print(val);
			   				return val;
			   			}
			   
			   		if(unite_depart==b.getGo() && unite_arrivee==b.getOctet())
			   			{
			   				val=val*1073741824;
			   				System.out.print(val);
			   				return val;
			   			}
			 
			   		if(unite_depart==b.getGo() && unite_arrivee==b.getKo())
			   			{
			   				val=val*1048576;
			   				System.out.print(val);
			   				return val;
			   			}
			
			   		if(unite_depart==b.getGo() && unite_arrivee==b.getMo())
			   			{
			   				val=val*1024;
			   				System.out.print(val);
			   			}
			   				return val;
		   			}
}
