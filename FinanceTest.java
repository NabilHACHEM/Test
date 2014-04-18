import junit.framework.Test;
import junit.framework.TestCase;
import junit.framework.TestSuite;

public class FinanceTest extends TestCase{

	public void testAfficherUnitesFinane() throws Exception {
	Finance f =new Finance();
	assertEquals(f.afficherUnitesFinane(),"Euro, Dollar, Pound, Yen, ");
							
							      }
}
