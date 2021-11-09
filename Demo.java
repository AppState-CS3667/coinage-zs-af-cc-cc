public class Demo {
    public static void main(String[] args) {
        CoinFactory fact = new CoinFactory();
        Coin c = fact.createCoin("USDMint",0.25);
        System.out.println(c);
    } 
}
