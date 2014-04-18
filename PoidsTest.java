import junit.framework.Test;
import junit.framework.TestCase;
import junit.framework.TestSuite;

public class PoidsTest extends TestCase{

	public void testAfficherUnitesPoids() throws Exception {
	Poids p=new Poids();
	assertEquals(p.afficherUnitesPoids(),"Tonne, Quintal, Kg, Hg, Dag, G, Dg, Cg, Mg ");
							
							      }
}
