import junit.framework.Test;
import junit.framework.TestCase;
import junit.framework.TestSuite;

public class TemperatureTest extends TestCase{

		/**
		@author Nabil HACHEM
		@version 2.0
		@since 2014-04-18
		*/

	public void testAfficherUnitesTemperature() throws Exception {
	Temperature t=new Temperature();
	assertEquals(t.afficherUnitesTemperature(),"Celsius, Kelvin, Newton, ");
							
							      }
}
