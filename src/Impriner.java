
import java.util.Random;
/**
 * Imprinting abstract superclass that utilizes java.util.random to determine if a coin will
 * pass inspection or not. 
 * @author Chris Carter
 *
 */
public abstract class Impriner {
	protected static Random rng = new Random();
	/**
	 * Takes a coin object, and returns true if it passes inspection or false if it fails.
	 * 		Will fail 1 / 12 times.
	 */
	public boolean inspect(Coin c) {
		if(rng.nextInt(12) == 0) {
			System.out.println("Inspection Failed.");
			return false;
		}
		System.out.println("Inspection Passed.");
		return true;
	}
	/**
	 * Takes a coin object, and returns true if it passes smoothing or false if it fails.
	 * 		Will fail 1 / 1000 times.
	 */
	public boolean smooth(Coin c) {
		if(rng.nextInt(1000) == 0) {
			System.out.println("Smoothing Failed.");
			return false;
		}
		System.out.println("Smoothing Passed.");
		return false;
	}
	/**
	 * Takes a coin object, and returns true if it passes buffing or false if it fails.
	 * 		Will fail 1 / 1000 times.
	 */
	public boolean buff(Coin c) {
		if(rng.nextInt(1000) == 0) {
			System.out.println("Buffing Failed.");
			return false;
		}
		System.out.println("Buffing Passed.");
		return false;	
	}
}
