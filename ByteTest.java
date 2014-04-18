import junit.framework.Test;
import junit.framework.TestCase;
import junit.framework.TestSuite;

public class ByteTest extends TestCase{
	
	
		/**
		@author Nabil HACHEM
		@version 2.0
		@since 2014-04-18
		*/

	public void testAfficherUnitesByte() throws Exception {
	Byte b=new Byte();
	assertEquals(b.afficherUnitesByte(),"Bit, Octet, Ko, Mo, Go, ");
							
							      }
}
