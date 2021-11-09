/**
 * NullCoin is a realization of the coin abstraction.
 *
 * @author Zach Shaffer
 * @version Nov 2021
 */

private static class NullCoin extends Coin {

    /**
       Constructor.

       NullCoin knows its attribute values.
    */
    public NullCoin() {
	super("Penny", 0.01, "USD");
    } 
}
