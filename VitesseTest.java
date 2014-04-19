import junit.framework.Test;
import junit.framework.TestCase;
import junit.framework.TestSuite;

/**
 * The VitesseTest allows to test methods 
 * @author Nabil HACHEM
 * @version 2.0
 * @since 2014-04-18
*/

public class VitesseTest extends TestCase{


	// This method allows to test the method afficherUnitesVitesse()

	public void testAfficherUnitesVitesse() throws Exception {
	Vitesse v=new Vitesse();
	assertEquals(v.afficherUnitesVitesse(),"Kmph, Mps, Milesph, ");

							      }
}
