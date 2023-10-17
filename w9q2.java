import java.util.Scanner;

public class w9q2 
{
    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);

        System.out.println("Teacher Categories:");
        System.out.println("1: Post Graduate Teacher (PGT)");
        System.out.println("2: Trained Graduate Teacher (TGT)");
        System.out.println("3: Primary Teacher");
        System.out.print("Enter the category choice (1/2/3): ");
        int categoryChoice = sc.nextInt();
        System.out.print("Enter the basic salary: ");
        double basicSalary = sc.nextDouble();

        double da, hra, cta, grossSalary;

        if (categoryChoice == 1) 
        {
            da = 0.30 * basicSalary;
            hra = 0.20 * basicSalary;
            cta = 0.10 * basicSalary;
            grossSalary = basicSalary + da + hra + cta;
        } 
        else if (categoryChoice == 2) 
        {
            da = 0.25 * basicSalary;
            hra = 0.15 * basicSalary;
            cta = 0.05 * basicSalary;
            grossSalary = basicSalary + da + hra + cta;
        } 
        else if (categoryChoice == 3) 
        {
            da = 0.20 * basicSalary;
            hra = 0.10 * basicSalary;
            grossSalary = basicSalary + da + hra;
        } 
        else 
        {
            System.out.println("Invalid category choice!");
               sc.close();
        return;
            
        }

        System.out.println("Gross Salary: " + grossSalary);
   sc.close();
    
    }
}

