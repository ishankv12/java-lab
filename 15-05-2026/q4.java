import java.util.Arrays;
import java.util.Scanner;
public class q4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter size of first array: ");
        int n1 = sc.nextInt();
        int[] a = new int[n1];
        System.out.println("Enter " + n1 + " elements:");
        for (int i = 0; i < n1; i++) a[i] = sc.nextInt();
        System.out.print("Enter size of second array: ");
        int n2 = sc.nextInt();
        int[] b = new int[n2];
        System.out.println("Enter " + n2 + " elements:");
        for (int i = 0; i < n2; i++) b[i] = sc.nextInt();
        int[] merged = new int[n1 + n2];
        // copy a
        for (int i = 0; i < n1; i++) merged[i] = a[i];
        // copy b
        for (int i = 0; i < n2; i++) merged[n1 + i] = b[i];
        Arrays.sort(merged);
        System.out.println("Merged array in ascending order:");
        for (int x : merged) System.out.print(x + " ");
        sc.close();
    }
}
