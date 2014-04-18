import junit.framework.Test;
import junit.framework.TestCase;
import junit.framework.TestSuite;

public class TempsTest extends TestCase{

	public void testAfficherUnitesTemps() throws Exception {
	Temps t=new Temps();
	assertEquals(t.afficherUnitesTemps(),"Annee, Mois, Semaine, Jour, Heure, Minute, Seconde, Milliseconde, Microseconde, Nanoseconde, ");
							
							      }
}
