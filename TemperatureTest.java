import junit.framework.Test;
import junit.framework.TestCase;
import junit.framework.TestSuite;

public class TemperatureTest extends TestCase{

	public void testAfficherUnitesTemperature() throws Exception {
	Temperature t=new Temperature();
	assertEquals(t.afficherUnitesTemperature(),"Celsius, Kelvin, Newton, ");
							
							      }
}
