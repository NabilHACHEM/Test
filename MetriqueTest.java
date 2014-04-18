import junit.framework.Test;
import junit.framework.TestCase;
import junit.framework.TestSuite;

/**
* The MetriqueTest allows to test methods
* @author Nabil HACHEM
* @version 2.0
* @since 2014-04-18
*/

public class MetriqueTest extends TestCase{

	// This method allows to test the method afficherUnitesMetrique

	public void testAfficherUnitesMetrique() throws Exception {
		
	Metrique m=new Metrique();
	
	assertEquals(m.afficherUnitesMetrique(),"Km, Hm, Dam, M, Dm, Cm, Mm, ");
							
							      }
}
