public class Demo {
    public static void main(String[] args) {
        //Two methods of doing it, not sure which one is right.
        //Method one:
        Mint m = new USDMint();
        Coin c = m.makeCoin(.25);
        System.out.println(c);
        
        //Method two:
        CoinFactory fact = new CoinFactory();
        c = fact.createCoin("USDMint",0.25);
        System.out.println(c);
    } 
}
