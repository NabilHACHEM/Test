import junit.framework.Test;
import junit.framework.TestCase;
import junit.framework.TestSuite;

/**
* The FinanceTest allows to test methods
* @author Nabil HACHEM
* @version 2.0
* @since 2014-04-18
*/

public class FinanceTest extends TestCase{
	
	// This method allows to test the method afficherUnitesFinance

	public void testAfficherUnitesFinane() throws Exception {
	Finance f =new Finance();
	assertEquals(f.afficherUnitesFinane(),"Euro, Dollar, Pound, Yen, ");
							
							      }
}
