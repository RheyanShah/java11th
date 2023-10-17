import java.util.Scanner;

public class w5q1 
{
public static void main(String[] args) 
       {
         Scanner sc = new Scanner(System.in); {
            System.out.print("Enter the length of side 1: ");
            double side1 = sc.nextDouble();
            System.out.print("Enter the length of side 2: ");
            double side2 = sc.nextDouble();
            System.out.print("Enter the length of side 3: ");
            double side3 = sc.nextDouble();
            if (side1 == side2 && side2 == side3)
                {
                    System.out.println("The triangle is Equilateral.");
                }
            else if (side1 == side2 || side1 == side3 || side2 == side3) 
                {
                    System.out.println("The triangle is Isosceles.");
                }
            else 
                {
                    System.out.println("The triangle is Scalene.");
                }
        }
        sc.close();
        } 
    }

