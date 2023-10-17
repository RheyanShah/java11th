import java.util.Scanner;
public class w5q3 
{
    public static void main(String[] args) 
    {
         Scanner sc = new Scanner(System.in); {
            System.out.print("Enter a number: ");
            double number = sc.nextDouble();
            if (number <= 0) 
            {
                System.out.println("Invalid number.");
            }
            else if (number % 2 != 0) 
            {
                double square = Math.pow(number, 2);
                double cube = Math.pow(number, 3);
                System.out.println("Square: " + square);
                System.out.println("Cube: " + cube);
            }
            else {
                double square = Math.pow(number, 2);
                double squareRoot = Math.sqrt(number);
                double sum = square + squareRoot;
                System.out.println("Sum of square and square root: " + sum);
            }
        }
   sc.close();
    }
}

