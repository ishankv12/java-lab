import java.util.ArrayList;
import java.util.LinkedHashSet;
import java.util.Scanner;
public class q11 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<Integer> list = new ArrayList<>();
        System.out.println("Enter 10 integers:");
        for (int i = 0; i < 10; i++) {
            list.add(sc.nextInt());
        }
        // Remove duplicates (keeps original order)
        LinkedHashSet<Integer> set = new LinkedHashSet<>(list);
        list.clear();
        list.addAll(set);
        System.out.println("Final list (no duplicates): " + list);
        sc.close();
    }
}
