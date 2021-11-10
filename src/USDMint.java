/**
 * USDMint creates US coin objects.
 *
 * @author Adam Farshchi
 * @version Nov 2021
 */
public class USDMint extends Mint {

    private static USDMint instance;
    
    private USDMint()
    {
        super();
    }

    public static USDMint getInstance()
    {
        if(instance == null)
            instance = new USDMint();
        return instance;
    }

    protected Coin createCoin(double den) {
        if (den == 1.00)
        {
            return new USDDollar();
        }
        else if (den == .50)
        {
            return new USDHalfDollar();
        }
        else if (den == .25)
        {
            return new USDQuarter();
        }
        else if (den == .10)
        {
            return new USDDime();
        }
        else if (den == .05)
        {
            return new USDNickel();
        }
        else if (den == .01)
        {
            return new USDPenny();
        }
        else
        {
            return Coin.NULL;
        }
    }
}
