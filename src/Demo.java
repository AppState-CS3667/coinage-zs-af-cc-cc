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
            if (args[0].equalsIgnoreCase("USD"))
            {
                m = USDMint.getInstance();
            }
            else if (args[0].equalsIgnoreCase("CAD"))
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
            while (!s.equalsIgnoreCase("USD") && !s.equalsIgnoreCase("CAD"));

            if (s.equalsIgnoreCase("USD"))
            {
                m =  USDMint.getInstance();
            }
            else if (s.equalsIgnoreCase("CAD"))
            {
                m = CADMint.getInstance();
            }
        }

        do 
        {
            System.out.print("\nEnter coin denomination to be minted (Type 0 to quit): ");
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
