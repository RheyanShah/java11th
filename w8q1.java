import java.util.Scanner;

public class w8q1 
{
    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int number = sc.nextInt();

        int originalNumber = number;
        int sumOfSquares = 0;

        while (number != 0) 
        {
            int digit = number % 10;
            sumOfSquares += digit * digit;
            number /= 10;
        }

        System.out.println("Sum of squares of digits of " + originalNumber + " is: " + sumOfSquares);
        sc.close();
    }
}
