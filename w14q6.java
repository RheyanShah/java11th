import java.util.Scanner;

public class w14q6 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int l = 10;

        int[] numbers = new int[l];

        System.out.println("Enter 10 random numbers:");

        for (int i = 0; i < l; i++) {
            System.out.print("Enter a number for numbers[" + i + "]: ");
            numbers[i] = scanner.nextInt();
        }

        System.out.print("Enter a number to check: ");
        int numberToCheck = scanner.nextInt();

        boolean f = false;
        for (int i = 0; i < l; i++) {
            if (numbers[i] == numberToCheck) {
                System.out.println(numberToCheck + " is present at index " + i);
                f = true;
                break;
            }
        }

        if (f==true) {
            System.out.println(numberToCheck + " is not present in the array.");
        }
        scanner.close();
    }
}
