import junit.framework.Test;
import junit.framework.TestCase;
import junit.framework.TestSuite;

public class ByteTest extends TestCase{

	public void testAfficherUnitesByte() throws Exception {
	Byte b=new Byte();
	assertEquals(b.afficherUnitesByte(),"Bit, Octet, Ko, Mo, Go, ");
							
							      }
}
