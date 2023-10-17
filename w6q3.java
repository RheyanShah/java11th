import java.util.Scanner;

public class w6q3 
{
    public static void main(String[] args) 
    {
     Scanner sc = new Scanner(System.in);
     {
            System.out.print("Enter the weight of the parcel (in kg): ");
            double weight = sc.nextDouble();
            
            double charge = 0.0;

            if (weight <= 10) 
            {
                charge = weight * 20.0;
            } 
            else if (weight > 10 && weight <= 30) {
                charge = 10 * 20.0 + (weight - 10) * 10.0;
            } 
            else if (weight > 30 && weight <= 50) {
                charge = 10 * 20.0 + 20 * 10.0 + (weight - 30) * 8.0;
            } 
            else 
            {
                charge = 10 * 20.0 + 20 * 10.0 + 20 * 8.0 + (weight - 50) * 5.0;
            }

            System.out.println("Weight of the parcel: " + weight + " kg");
            System.out.println("Amount Payable: ₹" + charge);
            sc.close();
        }
        
   sc.close();
    }
}
