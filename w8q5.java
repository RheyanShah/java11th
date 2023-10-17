public class w8q5 
{
    public static void main(String[] args) 
    {
        int n = 8;
        int number = 1;

        for (int i = 1; i <= n; i++) 
        {
            System.out.print(number + " ");
            number = number * 10 + 1;
        }

        System.out.println();
    }
}

