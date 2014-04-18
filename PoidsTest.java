import junit.framework.Test;
import junit.framework.TestCase;
import junit.framework.TestSuite;

/**
* The PoidsTest allows to test methods
* @author Nabil HACHEM
* @version 2.0
* @since 2014-04-18
*/

public class PoidsTest extends TestCase{

	// This method allows to test the method afficherUnitesPoids()
		
	public void testAfficherUnitesPoids() throws Exception {
		
	Poids p=new Poids();
	
	assertEquals(p.afficherUnitesPoids(),"Tonne, Quintal, Kg, Hg, Dag, G, Dg, Cg, Mg ");
							
							      }
}
