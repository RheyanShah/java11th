import java.util.Scanner;

public class w14q5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int l = 5;

        int[] A = new int[l];
        int[] B = new int[l];
        int[] C = new int[l * 2];

        System.out.println("Enter 5 numbers for array A:");
        for (int i = 0; i < l; i++) {
            System.out.print("Enter a number for A[" + i + "]: ");
            A[i] = scanner.nextInt();
        }

        System.out.println("Enter 5 numbers for array B:");
        for (int i = 0; i < l; i++) {
            System.out.print("Enter a number for B[" + i + "]: ");
            B[i] = scanner.nextInt();
        }

        for (int i = 0; i < l; i++) {
            C[i] = A[i];
            C[i + l] = B[i];
        }

        System.out.println("Array C (Combined from A and B):");
        for (int i = 0; i < l * 2; i++) {
            System.out.print(C[i] + " ");
        }
        System.out.println();
        scanner.close();
    }
}
