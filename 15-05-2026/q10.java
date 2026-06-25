import java.util.Scanner;
public class q10 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter size of array: ");
        int n = sc.nextInt();
        int[] a = new int[n];
        System.out.println("Enter " + n + " integers:");
        for (int i = 0; i < n; i++) a[i] = sc.nextInt();
        System.out.println("Even numbers:");
        for (int x : a) {
            if (x % 2 == 0) System.out.print(x + " ");
        }
        sc.close();
    }
}
