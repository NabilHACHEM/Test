import junit.framework.Test;
import junit.framework.TestCase;
import junit.framework.TestSuite;

public class FormuleTest extends TestCase{
 
      /**
      @author Nabil HACHEM
      @version 2.0
      @since 2014-04-18
      */
 
public void testMultiplierUniteParDix() throws Exception {
 
assertEquals(230.0,Formule.multiplierUniteParDix("km","hm",23.0));
}
 
}
