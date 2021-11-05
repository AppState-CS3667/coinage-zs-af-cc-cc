import java.lang.reflect.*;
/*
 * Coin Factory class to makes a coin request to send to the country's mint
 *
 * Author: Zach Shaffer
 * Date: Nov 2021
 */
public class CoinFactory
{
	/*
 	* A default no-arg constructor for the factory.
 	*/ 	
	public CoinFactory()
	{
	}

	/*
 	* The factory produces a coin
 	* @param Mint takes the country of coin in and sends the request to the proper mint with the value of the coin desired
 	* @return cc Returns the finished coin
 	*/	 	
	public Coin createCoin(String mint, double val) 
	{
		Coin cc = null;
		Class cl = null;
		try {	cl = Class.forName(mint); }
		catch (ClassNotFoundException e) 
		{ 
			System.err.println("Mint class not found."); 
			e.printStackTrace(); 
		}
		Object o = null;
		try 
		{ 
			o = cl.newInstance(); 
		} 	
		catch (InstantiationException e) 
		{
			System.err.println("Not able to instantiate."); 
			e.printStackTrace(); 
		}
		catch (IllegalAccessException e) 
		{ 
			System.err.println("Not able to access."); 
			e.printStackTrace(); 
		}
		cc = (Coin) o.makeCoin(val);
		return cc;
	}	
}
	
