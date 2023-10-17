import java.util.Scanner;

public class w5q7 
{
    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter your full name: ");
        String fullName = sc.nextLine();
        
        System.out.print("Enter your roll number: ");
        int rollNumber = sc.nextInt();
        
        System.out.print("Enter marks out of 100 in subject 1: ");
        int subject1Marks = sc.nextInt();
        
        System.out.print("Enter marks out of 100 in subject 2: ");
        int subject2Marks = sc.nextInt();
        
        System.out.print("Enter marks out of 100 in subject 3: ");
        int subject3Marks = sc.nextInt();
        
        int totalMarks = subject1Marks + subject2Marks + subject3Marks;
        double percentage = (totalMarks / 300.0) * 100;
        
        String grade;
        if (percentage >= 90) 
        {
            grade = "A+";
        } else if (percentage >= 80) 
        {
            grade = "A";
        } else if (percentage >= 70) 
        {
            grade = "B+";
        } else if (percentage >= 60) 
        {
            grade = "B";
        } 
        else if (percentage >= 50) 
        {
            grade = "C+";
        } 
        else if (percentage >= 40) 
        {
            grade = "C";
        } 
        else 
        {
            grade = "Fail";
        }

        System.out.println("Roll Number: " + rollNumber);
        System.out.println("Full Name: " + fullName);
        System.out.println("Marks in Subject 1: " + subject1Marks);
        System.out.println("Marks in Subject 2: " + subject2Marks);
        System.out.println("Marks in Subject 3: " + subject3Marks);
        System.out.println("Total Marks: " + totalMarks);
        System.out.println("Percentage: " + percentage + "%");
        System.out.println("Grade: " + grade);
   sc.close();
    }
}

