import java.util.Scanner;

public class w9q1 
{
    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);

        System.out.println("Choose an option:");
        System.out.println("a) Area of equilateral triangle");
        System.out.println("b) Area of isosceles triangle");
        System.out.println("c) Area of scalene triangle");
        System.out.print("Enter your choice (a/b/c): ");
        char ch = sc.next().charAt(0);

        double area = 0.0;

        switch (ch) 
        {
            case 'a':
                System.out.print("Enter the side length (a) of the equilateral triangle: ");
                double a = sc.nextDouble();
                area = (Math.sqrt(3) * a * a) / 4.0;
                System.out.println("Area of equilateral triangle: " + area);
                break;
            case 'b':
                System.out.print("Enter the length of base (b) of the isosceles triangle: ");
                double b = sc.nextDouble();
                System.out.print("Enter the length of one of the equal sides (a) of the isosceles triangle: ");
                double aIsosceles = sc.nextDouble();
                area = (1.0 / 4.0) * b * Math.sqrt(4 * b * b - aIsosceles * aIsosceles);
                System.out.println("Area of isosceles triangle: " + area);
                break;
            case 'c':
                System.out.print("Enter the length of side 'a' of the scalene triangle: ");
                double sideA = sc.nextDouble();
                System.out.print("Enter the length of side 'b' of the scalene triangle: ");
                double sideB = sc.nextDouble();
                System.out.print("Enter the length of side 'c' of the scalene triangle: ");
                double sideC = sc.nextDouble();
                double s = (sideA + sideB + sideC) / 2.0;
                area = Math.sqrt(s * (s - sideA) * (s - sideB) * (s - sideC));
                System.out.println("Area of scalene triangle: " + area);
                break;
            default:
                System.out.println("Invalid choice!");
        }
        sc.close();
   sc.close();
    }
}
