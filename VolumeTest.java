import junit.framework.Test;
import junit.framework.TestCase;
import junit.framework.TestSuite;

public class VolumeTest extends TestCase{

	public void testAfficherUnitesVolume() throws Exception {
	Volume v=new Volume();
	assertEquals(v.afficherUnitesVolume(),"m3, dm3, cm3, l, dl, cl, ml, ");
							
							      }
}
