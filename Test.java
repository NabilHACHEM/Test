public class Test {

				/**
				 * @param args
				 * @author Nabil HACHEM
				 * @version 2.0
			         * @since 2014-04-18
				 */
	 */
	public static void main(String[] args) {
		
		/*********************************************M�trique***********************************************************/
		
							/*************************Repr�sentation**********************/
		
		System.out.print("******************M�trique*******************\r\r\n");
		System.out.print("       ********Repr�sentation*********\r\n");
		Metrique m=new Metrique();
		System.out.print("Les unit�s correspondant au syst�me m�trique sont : "+m.afficherUnitesMetrique()+"\r\r\n");
		
							/*************************Conversion**********************/
		System.out.print("       **********Conversion**********\n");
		Conversion c1=new Conversion("km", "hm", 23);
		System.out.print("Conversion de "+c1.getUnite_origine()+" vers "+c1.getUnite_cible()+" : ");
		c1.convertir_unite();
		System.out.print(" "+c1.getUnite_cible()+"\n");
		
		
		
		Conversion c2=new Conversion("km", "dm", 152);
		System.out.print("Conversion de "+c2.getUnite_origine()+" vers "+c2.getUnite_cible()+" : ");
		c2.convertir_unite();
		System.out.print(" "+c2.getUnite_cible()+"\n");
		
		
		Conversion c3=new Conversion("m", "km", 25);
		System.out.print("Conversion de "+c3.getUnite_origine()+" vers "+c3.getUnite_cible()+" : ");
		c3.convertir_unite();
		System.out.print(" "+c3.getUnite_cible()+"\n");
		
		
		
		Conversion c4=new Conversion("cm", "hm", 36);
		System.out.print("Conversion de "+c4.getUnite_origine()+" vers "+c4.getUnite_cible()+" : ");
		c4.convertir_unite();
		System.out.print(" "+c4.getUnite_cible()+"\r\r\n");
		
		
		
		/*********************************************Poids***********************************************************/
		
							/*************************Repr�sentation**********************/

		System.out.print("******************Poids*******************\r\r\n");
		System.out.print("       ********Repr�sentation*********\r\n");
		Poids poids=new Poids();
		System.out.print("Les unit�s correspondant au syst�me poids sont : "+poids.afficherUnitesPoids()+"\r\r\n");
		
				/*************************Conversion**********************/
		System.out.print("       **********Conversion**********\n");
		Conversion c5=new Conversion("hg", "cg", 89);
		System.out.print("Conversion de "+c5.getUnite_origine()+" vers "+c5.getUnite_cible()+" : ");
		c5.convertir_unite();
		System.out.print(" "+c5.getUnite_cible()+"\n");

		
		
		Conversion c6=new Conversion("tonne", "g", 64);
		System.out.print("Conversion de "+c6.getUnite_origine()+" vers "+c6.getUnite_cible()+" : ");
		c6.convertir_unite();
		System.out.print(" "+c6.getUnite_cible()+"\n");
		
		
		Conversion c7=new Conversion("mg", "dag", 1200);
		System.out.print("Conversion de "+c7.getUnite_origine()+" vers "+c7.getUnite_cible()+" : ");
		c7.convertir_unite();
		System.out.print(" "+c7.getUnite_cible()+"\n");
		
		Conversion c8=new Conversion("cg", "kg", 267);
		System.out.print("Conversion de "+c8.getUnite_origine()+" vers "+c8.getUnite_cible()+" : ");
		c8.convertir_unite();
		System.out.print(" "+c8.getUnite_cible()+"\r\r\n");
		
		
		
		/*********************************************Temps***********************************************************/
		
		/*************************Repr�sentation**********************/

		System.out.print("******************Temps*******************\r\r\n");
		System.out.print("       ********Repr�sentation*********\r\n");
		Temps tps=new Temps();
		System.out.print("Les unit�s correspondant au syst�me temps sont : "+tps.afficherUnitesTemps()+"\r\r\n");
		
		
		/*************************Conversion**********************/
		System.out.print("       **********Conversion**********\n");
		Conversion c9=new Conversion("heure", "minute", 2);
		System.out.print("Conversion de "+c9.getUnite_origine()+" vers "+c9.getUnite_cible()+" : ");
		c9.convertir_unite();
		System.out.print(" "+c9.getUnite_cible()+"\n");
		
		
		
		Conversion c10=new Conversion("minute", "semaine", 20);
		System.out.print("Conversion de "+c10.getUnite_origine()+" vers "+c10.getUnite_cible()+" : ");
		c10.convertir_unite();
		System.out.print(" "+c10.getUnite_cible()+"\n");
		
		
		
		Conversion c11=new Conversion("heure", "annee", 20);
		System.out.print("Conversion de "+c11.getUnite_origine()+" vers "+c11.getUnite_cible()+" : ");
		c11.convertir_unite();
		System.out.print(" "+c11.getUnite_cible()+"\r\r\n");
		
		
		
		/*********************************************Finance***********************************************************/
		
				/*************************Repr�sentation**********************/
		
		
		System.out.print("******************Finance*******************\r\r\n");
		System.out.print("       ********Repr�sentation*********\r\n");
		Finance f=new Finance();
		System.out.print("Les unit�s correspondant au syst�me finance sont : "+f.afficherUnitesFinane()+"\r\r\n");
		
		/*************************Conversion**********************/
		System.out.print("       **********Conversion**********\n");
		Conversion c12=new Conversion("euro", "dollar", 2500);
		System.out.print("Conversion de "+c12.getUnite_origine()+" vers "+c12.getUnite_cible()+" : ");
		c12.convertir_unite();
		System.out.print(" "+c12.getUnite_cible()+"\n");
		
	
	
		Conversion c13=new Conversion("yen", "pound", 100);
		System.out.print("Conversion de "+c13.getUnite_origine()+" vers "+c13.getUnite_cible()+" : ");
		c13.convertir_unite();
		System.out.print(" "+c13.getUnite_cible()+"\n");
		
		
		
		Conversion c14=new Conversion("dollar", "pound", 3600);
		System.out.print("Conversion de "+c14.getUnite_origine()+" vers "+c14.getUnite_cible()+" : ");
		c14.convertir_unite();
		System.out.print(" "+c14.getUnite_cible()+"\r\r\n");
		
		

		/*********************************************Vitesse***********************************************************/
		
				/*************************Repr�sentation**********************/
		
		System.out.print("******************Vitesse*******************\r\r\n");
		System.out.print("       ********Repr�sentation*********\r\n");
		Vitesse v=new Vitesse();
		System.out.print("Les unit�s correspondant au syst�me vitesse sont : "+v.afficherUnitesVitesse()+"\r\r\n");
		
		/*************************Conversion**********************/
		System.out.print("       **********Conversion**********\n");
		Conversion c15=new Conversion("kmph", "mps", 250);
		System.out.print("Conversion de "+c15.getUnite_origine()+" vers "+c15.getUnite_cible()+" : ");
		c15.convertir_unite();
		System.out.print(" "+c15.getUnite_cible()+"\n");
		
		
		
		Conversion c16=new Conversion("milesph", "mps", 520);
		System.out.print("Conversion de "+c16.getUnite_origine()+" vers "+c16.getUnite_cible()+" : ");
		c16.convertir_unite();
		System.out.print(" "+c16.getUnite_cible()+"\n");
	}
	
	
	

}
