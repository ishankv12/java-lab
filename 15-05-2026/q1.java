import java.util.Scanner;
public class q1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] a = new int[10];
        System.out.println("Enter 10 integers:");
        for (int i = 0; i < a.length; i++) {
            a[i] = sc.nextInt();
        }
        int sum = 0;
        int largest = a[0];
        int smallest = a[0];
        System.out.println("All elements:");
        for (int x : a) {
            System.out.print(x + " ");
            sum += x;
            if (x > largest) largest = x;
            if (x < smallest) smallest = x;
        }
        System.out.println("\nSum = " + sum);
        System.out.println("Largest = " + largest);
        System.out.println("Smallest = " + smallest);
        sc.close();
    }
}