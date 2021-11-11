import java.lang.IllegalArgumentException;
import java.io.PrintStream;
import java.io.ByteArrayOutputStream;
import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;


public class MintTest {

    @Test
    public void testConstructor() {
	try {
	    Mint usdmint = new USDMint();
	    Mint cadmint = new CADMint();

	    assertNotNull(usdmint);
	    assertNotNull(cadmint)
	}
	catch (Exception e) {
	    fail("Constructor threw exception: " + e.getMessage());
	}
    }

    @Test
    public void testMakeCoin() {
	 Mint usdmint = new USDMint();
	 Mint cadmint = new CADMint();

	Coin expectedResult = null;
	Coin testOutput = null;

	expectedResult = new USDPenny();
	testOutput = usdmint.makeCoin(.01);
	assertTrue(expectedResult.equals(testOutput),
		   "Expected:'" + expectedResult 
		   + "' but got '" + testOutput + "'.");

	expectedResult = new USDNickel();
	testOutput = usdmint.makeCoin(.05);
	assertTrue(expectedResult.equals(testOutput),
		   "Expected:'" + expectedResult 
		   + "' but got '" + testOutput + "'.");

	expectedResult = new USDDime();
	testOutput = usdmint.makeCoin(.10);
	assertTrue(expectedResult.equals(testOutput),
		   "Expected:'" + expectedResult 
		   + "' but got '" + testOutput + "'.");

	expectedResult = new USDQuarter();
	testOutput = usdmint.makeCoin(.25);
	assertTrue(expectedResult.equals(testOutput),
		   "Expected:'" + expectedResult 
		   + "' but got '" + testOutput + "'.");

	expectedResult = new USDHalfDollar();
	testOutput = usdmint.makeCoin(.50);
	assertTrue(expectedResult.equals(testOutput),
		   "Expected:'" + expectedResult 
		   + "' but got '" + testOutput + "'.");

	expectedResult = new USDDollar();
	testOutput = usdmint.makeCoin(1.00);
	assertTrue(expectedResult.equals(testOutput),
		   "Expected:'" + expectedResult 
		   + "' but got '" + testOutput + "'.");
    }

    @Test
    public void testInstance {
	 Mint usdmint = null;
	 Mint cadmint = null;

	Mint expectedResult = null;
	Mint testOutput = null;

	testOutput = usdmint.getInstance();
	expectedResult = usdmint; 
	assertTrue(expectedResult.equals(testOutput),
		   "Expected:'" + expectedResult 
		   + "' but got '" + testOutput + "'.");

	testOutput = usdmint.getInstance();
	expectedResult = usdmint; 
	assertTrue(expectedResult.equals(testOutput),
		   "Expected:'" + expectedResult 
		   + "' but got '" + testOutput + "'.");

	expectedResult = cadmint.getInstance();
	testOutput = cadmint;
	assertTrue(expectedResult.equals(testOutput),
		   "Expected:'" + expectedResult
		   + "' but got '" + testOutput + "'.");

	expectedResult = cadmint.getInstance();
	testOutput = cadmint;
	assertTrue(expectedResult.equals(testOutput),
		   "Expected:'" + expectedResult
		   + "' but got '" + testOutput + "'.");
    }
}
