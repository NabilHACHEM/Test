import junit.framework.Test;
import junit.framework.TestCase;
import junit.framework.TestSuite;

/**
* The TempsTest allows to test methods
* @author Nabil HACHEM
* @version 2.0
* @since 2014-04-18
*/

public class TempsTest extends TestCase{

	// This method allows to test the method afficherUnitesTemps()
		
	public void testAfficherUnitesTemps() throws Exception {
		
	Temps t=new Temps();
	
	assertEquals(t.afficherUnitesTemps(),"Annee, Mois, Semaine, Jour, Heure, Minute, Seconde, Milliseconde, Microseconde, Nanoseconde, ");
							
							      }
}
