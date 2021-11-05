public class Demo {
    public static void main(String[] args) {
        Mint m = new USDMint();
        Coin c = m.makeCoin(.25);
        System.out.println(c);
    } 
}
