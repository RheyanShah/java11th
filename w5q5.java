import java.util.Scanner;

public class w5q5
{
    public static void main(String[] args) 
    {
         Scanner sc = new Scanner(System.in); {
            System.out.print("Enter a 3-digit number: ");
            int number = sc.nextInt();
            int originalNumber = number;
            int digit1 = number % 10;
            number /= 10;
            int digit2 = number % 10;
            number /= 10;
            int digit3 = number % 10;
            int cubeSum = (digit1 * digit1 * digit1) + (digit2 * digit2 * digit2) + (digit3 * digit3 * digit3);
            if (cubeSum == originalNumber) 
            {
                System.out.println(originalNumber + " is an Armstrong number.");
            } 
            else 
            {
                System.out.println(originalNumber + " is not an Armstrong number.");
            }
        }
   sc.close();
    }
}

