import java.util.Scanner;

public class w8q2
{
    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int number = sc.nextInt();

        int originalNumber = number;
        int sumOfDigits = 0;

        while (number != 0) 
        {
            int digit = number % 10;
            sumOfDigits += digit;
            number /= 10;
        }

        if (originalNumber % sumOfDigits == 0) 
        {
            System.out.println(originalNumber + " is a Niven number.");
        } 
        else 
        {
            System.out.println(originalNumber + " is not a Niven number.");
            sc.close();
        }
   sc.close();
    }
}
