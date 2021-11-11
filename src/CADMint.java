/**
 * USDMint creates US coin objects.
 *
 * @author Adam Farshchi, Chris Caggia
 * @version Nov 2021
 */
public class CADMint extends Mint {

    private static CADMint instance;
    
    private CADMint()
    {
        super();
    }

    public static CADMint getInstance()
    {
        if(instance == null)
            instance = new CADMint();
        return instance;
    }

    protected Coin createCoin(double den) {
        if (den == 1.00)
        {
            return new CADLoonie();
        }
        else if (den == .50)
        {
            return new CADFiftyCent();
        }
        else if (den == .25)
        {
            return new CADQuarter();
        }
        else if (den == .10)
        {
            return new CADDime();
        }
        else if (den == .05)
        {
            return new CADNickel();
        }
        else if (den == 2.00)
        {
            return new CADToonie();
        }
        else
        {
            return Coin.NULL;
        }
    }
}
