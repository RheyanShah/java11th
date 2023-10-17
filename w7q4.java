public class w7q4
{
    public static void main(String[] args) 
    {
        System.out.println("Prime numbers from 2 to 100:");
        for (int num = 2; num <= 100; num++) 
        {
            int div = 2;
            int isPrime = 1;

            while (div <= num / 2) 
            {
                if (num % div == 0) 
                {
                    isPrime = 0;
                }
                div++;
            }

            if (isPrime == 1) 
            {
                System.out.print(num + " ");
            }
        }
    }
}

