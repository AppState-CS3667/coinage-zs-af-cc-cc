/**
 * Mint abstraction.
 *
 * @author Adam Farshchi
 * @version Nov 2021
 */
public abstract class Mint {
    public Coin makeCoin(double den) {
        Coin c;
        c = createCoin(den);

        //c.manufacture();
        //c.inspection();
        //c.buffing();
        //c.smoothing();

        return c;
    }

    protected abstract Coin createCoin(double den);
}