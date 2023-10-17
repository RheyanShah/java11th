import java.util.Scanner;

public class w5q8 
{
    public static void main(String[] args) 
    {
         Scanner sc = new Scanner(System.in); {
            System.out.print("Enter employee's name: ");
            String name = sc.nextLine();

            System.out.print("Enter employee code: ");
            int employeeCode = sc.nextInt();

            System.out.print("Enter monthly salary: ");
            double monthlySalary = sc.nextDouble();

            double annualIncome = monthlySalary * 12;
            double taxPayable = 0.0;

            if (annualIncome <= 50000) 
            {
                taxPayable = 0;
            } 
            else if (annualIncome <= 60000) 
            {
                taxPayable = (annualIncome - 50000) * 0.10;
            } 
            else if (annualIncome <= 150000) 
            {
                taxPayable = 1000 + (annualIncome - 60000) * 0.20;
            } 
            else 
            {
                taxPayable = 19000 + (annualIncome - 150000) * 0.30;
            }

            System.out.println("Employee Code: " + employeeCode);
            System.out.println("Employee Name: " + name);
            System.out.println("Annual Income: Rs." + annualIncome);
            System.out.println("Tax Payable: Rs." + taxPayable);
        }
   sc.close();
    }
}

