import java.lang.IllegalArgumentException;
import java.io.PrintStream;
import java.io.ByteArrayOutputStream;
import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;


public class CoinTest {

    @Test
    public void testConstructor() {
	try {
	    Coin usdpenny = new USDPenny();
	    Coin usdnickel = new USDNickel();
	    Coin usddime = new USDDime();
	    Coin usdquarter = new USDQuarter();
	    Coin usdhalfdollar = new USDHalfDollar();
	    Coin usddollar = new USDDollar();

	    assertNotNull(usdpenny);
	    assertNotNull(usdnickel);
	    assertNotNull(usddime);
	    assertNotNull(usdquarter);
	    assertNotNull(usdhalfdollar);
	    assertNotNull(usddollar);
	}
	catch (Exception e) {
	    fail("Constructor threw exception: " + e.getMessage());
	}
    }

    @Test
    public void testType() {
	 Coin usdpenny = new USDPenny();
	 Coin usdnickel = new USDNickel();
	 Coin usddime = new USDDime();
	 Coin usdquarter = new USDQuarter();
	 Coin usdhalfdollar = new USDHalfDollar();
	 Coin usddollar = new USDDollar();

	String expectedResult = null;
	String testOutput = null;

	expectedResult = "Penny";
	testOutput = usdpenny.getType();
	assertTrue(expectedResult.equals(testOutput),
		   "Expected:'" + expectedResult 
		   + "' but got '" + testOutput + "'.");

	expectedResult = "Nickel";
	testOutput = usdnickel.getType();
	assertTrue(expectedResult.equals(testOutput),
		   "Expected:'" + expectedResult 
		   + "' but got '" + testOutput + "'.");

	expectedResult = "Dime";
	testOutput = usddime.getType();
	assertTrue(expectedResult.equals(testOutput),
		   "Expected:'" + expectedResult 
		   + "' but got '" + testOutput + "'.");

	expectedResult = "Quarter";
	testOutput = usdquarter.getType();
	assertTrue(expectedResult.equals(testOutput),
		   "Expected:'" + expectedResult 
		   + "' but got '" + testOutput + "'.");

	expectedResult = "Half Dollar";
	testOutput = usdhalfdollar.getType();
	assertTrue(expectedResult.equals(testOutput),
		   "Expected:'" + expectedResult 
		   + "' but got '" + testOutput + "'.");

	expectedResult = "Dollar";
	testOutput = usddollar.getType();
	assertTrue(expectedResult.equals(testOutput),
		   "Expected:'" + expectedResult 
		   + "' but got '" + testOutput + "'.");
    }

    @Test
    public void testValue {
	 Coin usdpenny = new USDPenny();
	 Coin usdnickel = new USDNickel();
	 Coin usddime = new USDDime();
	 Coin usdquarter = new USDQuarter();
	 Coin usdhalfdollar = new USDHalfDollar();
	 Coin usddollar = new USDDollar();

	double expectedResult = null;
	double testOutput = null;

	expectedResult = 0.01;
	testOutput = usdpenny.getValue();
	assertTrue(expectedResult.equals(testOutput),
		   "Expected:'" + expectedResult 
		   + "' but got '" + testOutput + "'.");

	expectedResult = 0.05;
	testOutput = usdnickel.getValue();
	assertTrue(expectedResult.equals(testOutput),
		   "Expected:'" + expectedResult 
		   + "' but got '" + testOutput + "'.");

	expectedResult = 0.10;
	testOutput = usddime.getValue();
	assertTrue(expectedResult.equals(testOutput),
		   "Expected:'" + expectedResult 
		   + "' but got '" + testOutput + "'.");

	expectedResult = 0.25;
	testOutput = usdquarter.getValue();
	assertTrue(expectedResult.equals(testOutput),
		   "Expected:'" + expectedResult 
		   + "' but got '" + testOutput + "'.");

	expectedResult = 0.50;
	testOutput = usdhalfdollar.getValue();
	assertTrue(expectedResult.equals(testOutput),
		   "Expected:'" + expectedResult 
		   + "' but got '" + testOutput + "'.");

	expectedResult = 1.00;
	testOutput = usddollar.getValue();
	assertTrue(expectedResult.equals(testOutput),
		   "Expected:'" + expectedResult 
		   + "' but got '" + testOutput + "'.");
    }

    @Test
    public void testCode() {
	 Coin usdpenny = new USDPenny();
	 Coin usdnickel = new USDNickel();
	 Coin usddime = new USDDime();
	 Coin usdquarter = new USDQuarter();
	 Coin usdhalfdollar = new USDHalfDollar();
	 Coin usddollar = new USDDollar();

	String expectedResult = null;
	String testOutput = null;

	expectedResult = "USD";
	testOutput = usdpenny.getCode();
	assertTrue(expectedResult.equals(testOutput),
		   "Expected:'" + expectedResult 
		   + "' but got '" + testOutput + "'.");

	testOutput = usdnickel.getCode();
	assertTrue(expectedResult.equals(testOutput),
		   "Expected:'" + expectedResult 
		   + "' but got '" + testOutput + "'.");

	testOutput = usddime.getCode();
	assertTrue(expectedResult.equals(testOutput),
		   "Expected:'" + expectedResult 
		   + "' but got '" + testOutput + "'.");

	testOutput = usdquarter.getCode();
	assertTrue(expectedResult.equals(testOutput),
		   "Expected:'" + expectedResult 
		   + "' but got '" + testOutput + "'.");

	testOutput = usdhalfdollar.getCode();
	assertTrue(expectedResult.equals(testOutput),
		   "Expected:'" + expectedResult 
		   + "' but got '" + testOutput + "'.");

	testOutput = usddollar.getCode();
	assertTrue(expectedResult.equals(testOutput),
		   "Expected:'" + expectedResult 
		   + "' but got '" + testOutput + "'.");
    }

    @Test
    public void testToString() {
	 Coin usdpenny = new USDPenny();
	 Coin usdnickel = new USDNickel();
	 Coin usddime = new USDDime();
	 Coin usdquarter = new USDQuarter();
	 Coin usdhalfdollar = new USDHalfDollar();
	 Coin usddollar = new USDDollar();

	String expectedResult = null;
	String testOutput = null;

	expectedResult = "[USDPenny: worth $0.01]";
	testOutput = usdpenny.toString();
	assertTrue(expectedResult.equals(testOutput),
		   "Expected:'" + expectedResult 
		   + "' but got '" + testOutput + "'.");

	expectedResult = "[USDNickel: worth $0.05]";
	testOutput = usdnickel.toString();
	assertTrue(expectedResult.equals(testOutput),
		   "Expected:'" + expectedResult 
		   + "' but got '" + testOutput + "'.");

	expectedResult = "[USDDime: worth $0.10]";
	testOutput = usddime.toString();
	assertTrue(expectedResult.equals(testOutput),
		   "Expected:'" + expectedResult 
		   + "' but got '" + testOutput + "'.");

	expectedResult = "[USDQuarter: worth $0.25]";
	testOutput = usdquarter.toString();
	assertTrue(expectedResult.equals(testOutput),
		   "Expected:'" + expectedResult 
		   + "' but got '" + testOutput + "'.");

	expectedResult = "[USDHalf Dollar: worth $0.50]";
	testOutput = usdhalfdollar.toString();
	assertTrue(expectedResult.equals(testOutput),
		   "Expected:'" + expectedResult 
		   + "' but got '" + testOutput + "'.");

	expectedResult = "[USDDollar: worth $1.00]";
	testOutput = usddollar.toString();
	assertTrue(expectedResult.equals(testOutput),
		   "Expected:'" + expectedResult 
		   + "' but got '" + testOutput + "'.");
    }
}
