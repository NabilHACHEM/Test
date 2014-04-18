import junit.framework.Test;
import junit.framework.TestCase;
import junit.framework.TestSuite;

public class MetriqueTest extends TestCase{

	public void testAfficherUnitesMetrique() throws Exception {
	Metrique m=new Metrique();
	assertEquals(m.afficherUnitesMetrique(),"Km, Hm, Dam, M, Dm, Cm, Mm, ");
							
							      }
}
