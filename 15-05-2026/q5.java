import java.util.Scanner;
public class q5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter size of array: ");
        int n = sc.nextInt();
        int[] a = new int[n];
        System.out.println("Enter " + n + " elements:");
        for (int i = 0; i < n; i++) a[i] = sc.nextInt();
        boolean[] visited = new boolean[n];
        System.out.println("Element : Frequency");
        for (int i = 0; i < n; i++) {
            if (visited[i]) continue;
            int count = 1;
            for (int j = i + 1; j < n; j++) {
                if (a[i] == a[j]) {
                    count++;
                    visited[j] = true;
                }
            }
            System.out.println(a[i] + " : " + count);
        }
        sc.close();
    }
}
