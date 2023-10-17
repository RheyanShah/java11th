import java.util.Scanner;

public class W6Q1 
{
    public static void main(String[] args) 
    {
         Scanner sc = new Scanner(System.in); {
            System.out.print("Enter customer name: ");
            String customerName = sc.nextLine();

            System.out.print("Enter total cost of items purchased: ");
            double totalCost = sc.nextDouble();

            double discount = 0.0;
            if (totalCost < 2000) 
            {
                discount = 0.05;
            } 
            else if (totalCost >= 2001 && totalCost <= 5000) 
            {
                discount = 0.25;
            } 
            else if (totalCost >= 5001 && totalCost <= 10000) 
            {
                discount = 0.35;
            } 
            else 
            {
                discount = 0.50;
            }
            double discountAmount = totalCost * discount;
            double finalAmount = totalCost - discountAmount + 50; 
            System.out.println("Customer Name: " + customerName);
            System.out.println("Total Cost: ₹" + totalCost);
            System.out.println("Final Amount (after discount and including Service Tax): ₹" + finalAmount);
        }
   sc.close();
    }
}
