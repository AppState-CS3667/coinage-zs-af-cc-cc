import java.lang.IllegalArgumentException;
import java.io.PrintStream;
import java.io.ByteArrayOutputStream;
import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;


public class SmelterTest {

    @Test
    public void testInspect {
	    
         Coin usdpenny = new USDPenny();
	 Coin usdnickel = new USDNickel();
	 Coin usddime = new USDDime();
	 Coin usdquarter = new USDQuarter();
	 Coin usdhalfdollar = new USDHalfDollar();
	 Coin usddollar = new USDDollar();
		
	   Coin cadnickel = new CADNickel();
	   Coin caddime = new CADDime();
	   Coin cadquarter = new CADQuarter();
	   Coin cadfiftycent = new CADFiftyCent();
	   Coin cadloonie = new CADLoonie();
	   Coin cadtoonie = new CADToonie();

	boolean expectedResult = true;
	boolean testOutput = null;

	testOutput = Coin.inspect(usdpenny);
	assertTrue(expectedResult.equals(testOutput),
		   "Expected:'" + expectedResult 
		   + "' but got '" + testOutput + "'.");

	testOutput = Coin.inspect(usdnickel);
	assertTrue(expectedResult.equals(testOutput),
		   "Expected:'" + expectedResult 
		   + "' but got '" + testOutput + "'.");

	testOutput = Coin.inspect(usddime);
	assertTrue(expectedResult.equals(testOutput),
		   "Expected:'" + expectedResult 
		   + "' but got '" + testOutput + "'.");

	testOutput = Coin.inspect(usdquarter);
	assertTrue(expectedResult.equals(testOutput),
		   "Expected:'" + expectedResult 
		   + "' but got '" + testOutput + "'.");

	testOutput = Coin.inspect(usdhalfdollar);
	assertTrue(expectedResult.equals(testOutput),
		   "Expected:'" + expectedResult 
		   + "' but got '" + testOutput + "'.");

	testOutput = Coin.inspect(usddollar);
	assertTrue(expectedResult.equals(testOutput),
		   "Expected:'" + expectedResult 
		   + "' but got '" + testOutput + "'.");
	    
	testOutput = Coin.inspect(cadnickel);
	assertTrue(expectedResult.equals(testOutput),
		   "Expected:'" + expectedResult 
		   + "' but got '" + testOutput + "'.");

	testOutput = Coin.inspect(caddime);
	assertTrue(expectedResult.equals(testOutput),
		   "Expected:'" + expectedResult 
		   + "' but got '" + testOutput + "'.");

	testOutput = Coin.inspect(cadquarter);
	assertTrue(expectedResult.equals(testOutput),
		   "Expected:'" + expectedResult 
		   + "' but got '" + testOutput + "'.");

	testOutput = Coin.inspect(cadfiftycent);
	assertTrue(expectedResult.equals(testOutput),
		   "Expected:'" + expectedResult 
		   + "' but got '" + testOutput + "'.");

	testOutput = Coin.inspect(cadloonie);
	assertTrue(expectedResult.equals(testOutput),
		   "Expected:'" + expectedResult 
		   + "' but got '" + testOutput + "'.");

	testOutput = Coin.inspect(cadtoonie);
	assertTrue(expectedResult.equals(testOutput),
		   "Expected:'" + expectedResult 
		   + "' but got '" + testOutput + "'.");
    }

    @Test
    public void testSmooth() {
	    
	 Coin usdpenny = new USDPenny();
	 Coin usdnickel = new USDNickel();
	 Coin usddime = new USDDime();
	 Coin usdquarter = new USDQuarter();
	 Coin usdhalfdollar = new USDHalfDollar();
	 Coin usddollar = new USDDollar();
		
	   Coin cadnickel = new CADNickel();
	   Coin caddime = new CADDime();
	   Coin cadquarter = new CADQuarter();
	   Coin cadfiftycent = new CADFiftyCent();
	   Coin cadloonie = new CADLoonie();
	   Coin cadtoonie = new CADToonie();

	boolean expectedResult = true;
	boolean testOutput = null;

	testOutput = Coin.smooth(usdpenny);
	assertTrue(expectedResult.equals(testOutput),
		   "Expected:'" + expectedResult 
		   + "' but got '" + testOutput + "'.");

	testOutput = Coin.smooth(usdnickel);
	assertTrue(expectedResult.equals(testOutput),
		   "Expected:'" + expectedResult 
		   + "' but got '" + testOutput + "'.");

	testOutput = Coin.smooth(usddime);
	assertTrue(expectedResult.equals(testOutput),
		   "Expected:'" + expectedResult 
		   + "' but got '" + testOutput + "'.");

	testOutput = Coin.smooth(usdquarter);
	assertTrue(expectedResult.equals(testOutput),
		   "Expected:'" + expectedResult 
		   + "' but got '" + testOutput + "'.");

	testOutput = Coin.smooth(usdhalfdollar);
	assertTrue(expectedResult.equals(testOutput),
		   "Expected:'" + expectedResult 
		   + "' but got '" + testOutput + "'.");

	testOutput = Coin.smooth(usddollar);
	assertTrue(expectedResult.equals(testOutput),
		   "Expected:'" + expectedResult 
		   + "' but got '" + testOutput + "'.");
	    
	testOutput = Coin.smooth(cadnickel);
	assertTrue(expectedResult.equals(testOutput),
		   "Expected:'" + expectedResult 
		   + "' but got '" + testOutput + "'.");

	testOutput = Coin.smooth(caddime);
	assertTrue(expectedResult.equals(testOutput),
		   "Expected:'" + expectedResult 
		   + "' but got '" + testOutput + "'.");

	testOutput = Coin.smooth(cadquarter);
	assertTrue(expectedResult.equals(testOutput),
		   "Expected:'" + expectedResult 
		   + "' but got '" + testOutput + "'.");

	testOutput = Coin.smooth(cadfiftycent);
	assertTrue(expectedResult.equals(testOutput),
		   "Expected:'" + expectedResult 
		   + "' but got '" + testOutput + "'.");

	testOutput = Coin.smooth(cadloonie);
	assertTrue(expectedResult.equals(testOutput),
		   "Expected:'" + expectedResult 
		   + "' but got '" + testOutput + "'.");

	testOutput = Coin.smooth(cadtoonie);
	assertTrue(expectedResult.equals(testOutput),
		   "Expected:'" + expectedResult 
		   + "' but got '" + testOutput + "'.");
    }

    @Test
    public void testBuff() {
	    
	 Coin usdpenny = new USDPenny();
	 Coin usdnickel = new USDNickel();
	 Coin usddime = new USDDime();
	 Coin usdquarter = new USDQuarter();
	 Coin usdhalfdollar = new USDHalfDollar();
	 Coin usddollar = new USDDollar();
		
	   Coin cadnickel = new CADNickel();
	   Coin caddime = new CADDime();
	   Coin cadquarter = new CADQuarter();
	   Coin cadfiftycent = new CADFiftyCent();
	   Coin cadloonie = new CADLoonie();
	   Coin cadtoonie = new CADToonie();

	boolean expectedResult = true;
	boolean testOutput = null;

	testOutput = Coin.buff(usdpenny);
	assertTrue(expectedResult.equals(testOutput),
		   "Expected:'" + expectedResult 
		   + "' but got '" + testOutput + "'.");

	testOutput = Coin.buff(usdnickel);
	assertTrue(expectedResult.equals(testOutput),
		   "Expected:'" + expectedResult 
		   + "' but got '" + testOutput + "'.");

	testOutput = Coin.buff(usddime);
	assertTrue(expectedResult.equals(testOutput),
		   "Expected:'" + expectedResult 
		   + "' but got '" + testOutput + "'.");

	testOutput = Coin.buff(usdquarter);
	assertTrue(expectedResult.equals(testOutput),
		   "Expected:'" + expectedResult 
		   + "' but got '" + testOutput + "'.");

	testOutput = Coin.buff(usdhalfdollar);
	assertTrue(expectedResult.equals(testOutput),
		   "Expected:'" + expectedResult 
		   + "' but got '" + testOutput + "'.");

	testOutput = Coin.buff(usddollar);
	assertTrue(expectedResult.equals(testOutput),
		   "Expected:'" + expectedResult 
		   + "' but got '" + testOutput + "'.");
	    
	testOutput = Coin.buff(cadnickel);
	assertTrue(expectedResult.equals(testOutput),
		   "Expected:'" + expectedResult 
		   + "' but got '" + testOutput + "'.");

	testOutput = Coin.buff(caddime);
	assertTrue(expectedResult.equals(testOutput),
		   "Expected:'" + expectedResult 
		   + "' but got '" + testOutput + "'.");

	testOutput = Coin.buff(cadquarter);
	assertTrue(expectedResult.equals(testOutput),
		   "Expected:'" + expectedResult 
		   + "' but got '" + testOutput + "'.");

	testOutput = Coin.buff(cadfiftycent);
	assertTrue(expectedResult.equals(testOutput),
		   "Expected:'" + expectedResult 
		   + "' but got '" + testOutput + "'.");

	testOutput = Coin.buff(cadloonie);
	assertTrue(expectedResult.equals(testOutput),
		   "Expected:'" + expectedResult 
		   + "' but got '" + testOutput + "'.");

	testOutput = Coin.buff(cadtoonie);
	assertTrue(expectedResult.equals(testOutput),
		   "Expected:'" + expectedResult 
		   + "' but got '" + testOutput + "'.");
    }
}
