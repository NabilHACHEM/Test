import junit.framework.Test;
import junit.framework.TestCase;
import junit.framework.TestSuite;

public class MetriqueTest extends TestCase{

		
		/**
		@author Nabil HACHEM
		@version 2.0
		@since 2014-04-18
		*/

	public void testAfficherUnitesMetrique() throws Exception {
	Metrique m=new Metrique();
	assertEquals(m.afficherUnitesMetrique(),"Km, Hm, Dam, M, Dm, Cm, Mm, ");
							
							      }
}
