import java.util.*;

class Q3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int[] arr = {100, 200, 300, 400, 500};

        System.out.print("Enter array index (0-4): ");
        int idx = sc.nextInt();
        System.out.print("Enter divisor: ");
        int d = sc.nextInt();

        try {
            int result = arr[idx] / d;
            System.out.println("Result: " + result);
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Error: Invalid index.");
        } catch (ArithmeticException e) {
            System.out.println("Error: Divisor cannot be zero.");
        }
    }
}