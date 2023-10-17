import java.util.*;

public class w1q4 
{
    public static void main(String[] args) 
    {
         Scanner sc = new Scanner(System.in); {
            System.out.print("Enter a character: ");
            char c = sc.next().charAt(0);
            if ((c >= 65 && c <= 90)) 
            {
                System.out.println("Uppercase letter.");
            }
            else if ((c >= 97 && c <= 122))
            {
                System.out.println("Lowercase letter.");
            }
            else if ((c >= 48 && c <= 57))
            {
                System.out.println("Number.");
            }
            else if (c == 32 || (c >= 9 && c <= 13))
            {
                System.out.println("Blank character.");
            }
            else {
                System.out.println("Special character.");
            }
        }
        sc.close();
    }
}
