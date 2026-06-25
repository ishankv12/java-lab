import java.util.*;

class Q6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter age: ");
        int age = sc.nextInt();

        try {
            if (age < 18) throw new Exception("Not eligible to vote (age < 18).");
            System.out.println("Eligible to Vote");
        } catch (Exception e) {
            System.out.println("Exception: " + e.getMessage());
        }
    }
}