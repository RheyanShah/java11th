import java.util.Scanner;

public class W6Q2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter consumer name: ");
        String consumerName = sc.nextLine();

        System.out.print("Enter units consumed: ");
        int unitsConsumed = sc.nextInt();

        double billAmount = 0.0;

        if (unitsConsumed <= 100) 
        {
            billAmount = unitsConsumed * 1.0;
        }
        else if (unitsConsumed > 100 && unitsConsumed <= 200) {
            billAmount = 100 * 1.0 + (unitsConsumed - 100) * 1.25;
        } 
        else 
        {
            billAmount = 100 * 1.0 + 100 * 1.25 + (unitsConsumed - 200) * 2.0;
        }
        double totalBill = billAmount + 50.0; 
        System.out.println("Consumer Name: " + consumerName);
        System.out.println("Units Consumed: " + unitsConsumed + " units");
        System.out.println("Bill Amount (including Service Tax): ₹" + totalBill);
        sc.close();
   sc.close();
    }
}
