import java.util.Scanner;

public class w8q4 
{
    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number of rows: ");
        int numRows = sc.nextInt();
        for (int i = 1; i <= numRows; i++) 
        {
            if (i % 2 == 1) 
            {
                for (int j = 1; j <= numRows; j++) 
                {
                    System.out.print("# ");
                }
            } 
            else 
            {
                for (int j = 1; j <= numRows; j++) 
                {
                    System.out.print("$ ");
                }
            }
            System.out.println();
            sc.close();
        }
   sc.close();
    }
}

