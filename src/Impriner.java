
import java.util.Random;
/**
 * Imprinting abstract superclass that utilizes java.util.random to determine if a coin will
 * pass inspection or not. 
 * @author Chris Carter
 *
 */
public class Impriner {
	protected static Random rng = new Random();
	/**
	 * Takes a coin object, and returns true if it passes inspection or false if it fails.
	 * 		Will fail 1 / 12 times.
	 */
	public Coin inspect(Coin c) {
		if(rng.nextInt(12) == 0) {
			System.out.println("Inspection Failed.");
			return Coin.NULL;
		}
		System.out.println("Inspection Passed.");
		return c;
	}
	/**
	 * Takes a coin object, and returns true if it passes smoothing or false if it fails.
	 * 		Will fail 1 / 1000 times.
	 */
	public Coin smooth(Coin c) {
		if(rng.nextInt(1000) == 0) {
			System.out.println("Smoothing Failed.");
			return Coin.NULL;
		}
		System.out.println("Smoothing Passed.");
		return c;
	}
	/**
	 * Takes a coin object, and returns true if it passes buffing or false if it fails.
	 * 		Will fail 1 / 1000 times.
	 */
	public Coin buff(Coin c) {
		if(rng.nextInt(1000) == 0) {
			System.out.println("Buffing Failed.");
			return Coin.NULL;
		}
		System.out.println("Buffing Passed.");
		return c;	
	}
}
