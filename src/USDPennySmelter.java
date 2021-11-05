/**
 * Example of a concrete implementation of a smelter for the USD Penny coin.
 * 	When manufacture is called, it will print "Smelting: 2.5% Cu 97.5% Zi"
 * @author Chris Carter
 *
 */
public class USDPennySmelter extends Smelter {
	@Override
	public void manufacture(Coin c) {
		super.manufacture(c);
		System.out.println("2.5% Cu 97.5% Zi");
	}
}
