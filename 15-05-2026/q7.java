import java.util.Scanner;

public class q7 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter rows of A: ");
        int r1 = sc.nextInt();
        System.out.print("Enter cols of A: ");
        int c1 = sc.nextInt();
        System.out.print("Enter rows of B: ");
        int r2 = sc.nextInt();
        System.out.print("Enter cols of B: ");
        int c2 = sc.nextInt();
        if (c1 != r2) {
            System.out.println("Matrix multiplication not possible (cols of A must equal rows of B).");
            sc.close();
            return;
        }
        int[][] A = new int[r1][c1];
        int[][] B = new int[r2][c2];
        int[][] C = new int[r1][c2];
        System.out.println("Enter elements of Matrix A:");
        for (int i = 0; i < r1; i++)
            for (int j = 0; j < c1; j++)
                A[i][j] = sc.nextInt();
        System.out.println("Enter elements of Matrix B:");
        for (int i = 0; i < r2; i++)
            for (int j = 0; j < c2; j++)
                B[i][j] = sc.nextInt();
        for (int i = 0; i < r1; i++) {
            for (int j = 0; j < c2; j++) {
                int sum = 0;
                for (int k = 0; k < c1; k++) {
                    sum += A[i][k] * B[k][j];
                }
                C[i][j] = sum;
            }
        }
        System.out.println("Product Matrix (A x B):");
        for (int i = 0; i < r1; i++) {
            for (int j = 0; j < c2; j++) {
                System.out.print(C[i][j] + " ");
            }
            System.out.println();
        }
        sc.close();
    }
}
