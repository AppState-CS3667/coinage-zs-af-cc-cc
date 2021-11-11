import java.util.Scanner;

public class Demo {
    public static void main(String[] args) {
        Mint m = null;
        Scanner keyboard = new Scanner(System.in);
        String s = "";
        double d = 0;
        Coin c = null;

        if (args.length != 0)
        {
            if (args[0].equals("USD"))
            {
                m = USDMint.getInstance();
            }
            else if (args[0].equals("CAD"))
            {
                //m = new CADMint();
            }
        }
        else
        {
            do
            {
                System.out.print("Please input coin mint country code (USD/CAD): ");
                s = keyboard.nextLine();
            }
            while (!s.equals("USD") && !s.equals("CAD"));

            if (s.equals("USD"))
            {
                m =  USDMint.getInstance();
            }
            else if (s.equals("CAD"))
            {
                m = CADMint.getInstance();
            }
        }

        do 
        {
            System.out.print("Enter coin denomination to be minted (Type 0 to quit): ");
            d = keyboard.nextDouble();
            if (d != 0)
            {
                c = m.makeCoin(d);
                System.out.println(c);
            }
        }
        while (d != 0);
        keyboard.close();
    } 
}
