import java.util.*;

class Q7 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter balance: ");
        double balance = sc.nextDouble();
        System.out.print("Enter withdrawal amount: ");
        double amt = sc.nextDouble();

        try {
            if (amt > balance) throw new Exception("Withdrawal exceeds available balance.");
            balance -= amt;
            System.out.println("Withdrawn successfully. Remaining balance: " + balance);
        } catch (Exception e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
}