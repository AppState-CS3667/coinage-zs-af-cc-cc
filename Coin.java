/**
 * Coin is an abstraction of coin objects.
 *
 * @author Zach Shaffer
 * @version Nov 2021
 */
public abstract class Coin {
    private String type;
    private int value;
    private String code;

    /**
       Constructor.
       
       @param t is the coin's type I.E. Quarter
	@param v is the coin's value I.E. 0.25
	@param c is the coin's code I.E. USD
    */
    public Cookie(String t, int v, String c) {
	type = t;
	value = v;
	code = c;
    }

    /**
       Get the type of coin.
       
       @return the type.
    */
    public String getType() {
	return type;
    }

    /**
       Get the value of this coin.

       @return The value
    */
    public int getValue() { return value; }

    /**
       Get the country code of the coin.

       @return country code
    */
    public String getCode() { return code; }

    /**
       Concise string of object attribute values.

       @return object attribute values string-ified (String)
    */
    public String toString() {
	return "[" 
	    + getCode() + getType() + ": worth $" + getValue()  + "]";
    }
}

