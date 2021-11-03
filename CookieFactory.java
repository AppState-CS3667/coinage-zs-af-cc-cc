import java.lang.reflect.*;
/*
 * Coin Factory class to make coin to send to the country's mint
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
 	* @param type Takes the type of coin in and creates the base I.E. USDQuarter
 	* @return cc Returns the final coin to move on to the mint
 	*/	 	
	public Coin createCoin(String type) 
	{
		Coin cc = null;
		Class cl = null;
		try {	cl = Class.forName(type); }
		catch (ClassNotFoundException e) 
		{ 
			System.err.println("Class not found."); 
			e.printStackTrace(); 
		}
		Object o = null;
		if (cc == null)
		{
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
			cc = (Coin) o;			
		}	
		return cc;
	}
}
	
