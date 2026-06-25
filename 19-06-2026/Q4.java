import java.util.*;

class Q4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a number (as string): ");
        String s = sc.nextLine();

        try {
            int n = Integer.parseInt(s);
            System.out.println("Integer value: " + n);
        } catch (NumberFormatException e) {
            System.out.println("Error: Invalid numeric input.");
        }
    }
}