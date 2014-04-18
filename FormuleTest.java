import junit.framework.Test;
import junit.framework.TestCase;
import junit.framework.TestSuite;

/**
* The FormuleTest allows to test methods
* @author Nabil HACHEM
* @version 2.0
* @since 2014-04-18
*/

public class FormuleTest extends TestCase{
 
public void testMultiplierUniteParDix() throws Exception {
 
 // This method allows to test the method multiplierUniteParDix()
 
assertEquals(230.0,Formule.multiplierUniteParDix("km","hm",23.0));
}
 
}
