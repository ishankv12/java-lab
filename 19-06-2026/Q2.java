import java.util.*;

class Q2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int[] arr = {10, 20, 30, 40, 50};

        System.out.print("Enter index (0-4): ");
        int idx = sc.nextInt();

        try {
            System.out.println("Element: " + arr[idx]);
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Error: Invalid index.");
        }
    }
}