import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;
public class q12 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<String> names = new ArrayList<>();
        System.out.print("Enter number of students: ");
        int n = sc.nextInt();
        sc.nextLine(); // consume newline
        System.out.println("Enter names:");
        for (int i = 0; i < n; i++) {
            names.add(sc.nextLine());
        }
        Collections.sort(names);
        System.out.println("Sorted names:");
        for (String name : names) {
            System.out.println(name);
        }
        sc.close();
    }
}
