
public class SmeltDemo {
	public static void main(String[] args) {
		USDPennySmelter pSmelt = new USDPennySmelter();
		Impriner i = new Impriner();
		USDPenny penny = new USDPenny();
		pSmelt.manufacture(penny);
		
		for(int index = 0; index < 1000; index++) {
			if(!i.inspect(penny)) break;
			if(!i.smooth(penny)) break;
			if(!i.buff(penny)) break;
		}
	}
}
