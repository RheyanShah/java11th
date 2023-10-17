import java.util.Scanner;

public class w6q5 
{
    public static void main(String[] args) 
    {
         Scanner sc = new Scanner(System.in); {
            System.out.print("Product: ");
            String productName = sc.nextLine();

            System.out.print("Cost Price: ₹");
            double costPrice = sc.nextDouble();

            System.out.print("Selling Price: ₹");
            double sellingPrice = sc.nextDouble();

            double profitLossPercent = ((sellingPrice - costPrice) / costPrice) * 100.0;

            System.out.println("Product : " + productName);
            System.out.println("Cost Price : ₹" + costPrice);
            System.out.println("Selling Price : ₹" + sellingPrice);
            System.out.println("Profit/Loss Percent : " + profitLossPercent + "%");
        }
   sc.close();
    }
}
