import java.util.Scanner;
public class w7q5
{
    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number of terms (n): ");
        int n = sc.nextInt();
        int firstTerm = 0;
        int secondTerm = 1;
        System.out.print("Fibonacci Series: " + firstTerm + " " + secondTerm);
        for (int i = 2; i < n; i++) 
        {
            int nextTerm = firstTerm + secondTerm;
            System.out.print(" " + nextTerm);

            firstTerm = secondTerm;
            secondTerm = nextTerm;
        }
        System.out.println();
        sc.close();
   sc.close();
    }
}
