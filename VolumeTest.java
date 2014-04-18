import junit.framework.Test;
import junit.framework.TestCase;
import junit.framework.TestSuite;

public class VolumeTest extends TestCase{

		/**
		@author Nabil HACHEM
		@version 2.0
		@since 2014-04-18
		*/

	public void testAfficherUnitesVolume() throws Exception {
	Volume v=new Volume();
	assertEquals(v.afficherUnitesVolume(),"m3, dm3, cm3, l, dl, cl, ml, ");
							
							      }
}
