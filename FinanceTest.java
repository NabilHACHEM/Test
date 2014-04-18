import junit.framework.Test;
import junit.framework.TestCase;
import junit.framework.TestSuite;

public class FinanceTest extends TestCase{
	
		/**
		@author Nabil HACHEM
		@version 2.0
		@since 2014-04-18
		*/

	public void testAfficherUnitesFinane() throws Exception {
	Finance f =new Finance();
	assertEquals(f.afficherUnitesFinane(),"Euro, Dollar, Pound, Yen, ");
							
							      }
}
