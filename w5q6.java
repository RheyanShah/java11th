import java.util.Scanner;

public class w5q6
{
    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a 2-digit number: ");
        int number = sc.nextInt();

        int originalNumber = number;

        int tensDigit = number / 10;
        int onesDigit = number % 10;

        int sumOfDigits = tensDigit + onesDigit;
        int productOfDigits = tensDigit * onesDigit;

        if (sumOfDigits + productOfDigits == originalNumber) 
        {
            System.out.println(originalNumber + " is a Special number.");
        } 
        else 
        {
            System.out.println(originalNumber + " is not a Special number.");
        }
   sc.close();
    }
}
