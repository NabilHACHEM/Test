import junit.framework.Test;
import junit.framework.TestCase;
import junit.framework.TestSuite;

/**
 * The ByteTest allows to test methods 
 * @author Nabil HACHEM
 * @version 2.0
 * @since 2014-04-18
*/

public class ByteTest extends TestCase{
	
	
	// This method allows to test the method afficherUnitesByte()

	public void testAfficherUnitesByte() throws Exception {
	Byte b=new Byte();
	assertEquals(b.afficherUnitesByte(),"Bit, Octet, Ko, Mo, Go, ");
							
							      }
}
