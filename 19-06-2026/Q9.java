import java.util.*;

class Q9 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        try {
            System.out.print("Enter a number: ");
            String s = sc.nextLine();

            try {
                int a = Integer.parseInt(s);

                System.out.print("Enter divisor: ");
                int d = sc.nextInt();

                try {
                    System.out.println("Result: " + (a / d));
                } catch (ArithmeticException e) {
                    System.out.println("Inner catch: Division by zero.");
                }

            } catch (NumberFormatException e) {
                System.out.println("Middle catch: Not a valid integer.");
            }

        } catch (Exception e) {
            System.out.println("Outer catch: Some other error.");
        }
    }
}