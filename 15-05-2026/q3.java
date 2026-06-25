import java.util.Scanner;
public class q3{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter size of array: ");
        int n = sc.nextInt();
        int[] a = new int[n];
        System.out.println("Enter " + n + " elements:");
        for (int i = 0; i < n; i++) a[i] = sc.nextInt();
        // reverse in place
        int i = 0, j = n - 1;
        while (i < j) {
            int temp = a[i];
            a[i] = a[j];
            a[j] = temp;
            i++;
            j--;
        }
        System.out.println("Reversed array:");
        for (int x : a) System.out.print(x + " ");
        sc.close();
    }
}