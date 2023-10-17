import java.util.Scanner;

public class w14q4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int l = 10;

        int[] a = new int[l];
        int[] b = new int[l];

        System.out.println("Enter 10 random numbers for the original array:");

        for (int i = 0; i < l; i++) {
            System.out.print("Enter a number for the a[" + i + "]: ");
            a[i] = scanner.nextInt();
        }

        for (int i = 0; i < l; i++) {
            b[(i + 2) % l] = a[i];
        }

        System.out.println("Original array:");
        for (int i = 0; i < l; i++) {
            System.out.print(a[i] + " ");
        }
        System.out.println();

        System.out.println("Shifted array:");
        for (int i = 0; i < l; i++) {
            System.out.print(b[i] + " ");
        }
        System.out.println();
        scanner.close();
    }
}
