/**
 * Abstract smelter class that should always be overwritten with a subclass. 
 * 	Will print the types and percentages of metals that go into a coin
 * @author Chris Carter
 *
 */
public abstract class Smelter {
	/**
	 * Prints "Smelting: " WITHOUT a new line. This should be overwritten by subclasses,
	 * which should also call super.manufacture(c) to print the "Smelting: " part of
	 * the prompt. 
	 * 
	 * Or just overwrite the whole method, I'm not your dad.
	 */
	public void manufacture(Coin c) {
		System.out.print("Smelting: ");
	}
}
