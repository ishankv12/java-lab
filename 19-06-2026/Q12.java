import java.util.*;

class InsufficientBalanceException extends Exception {
    public InsufficientBalanceException(String msg) {
        super(msg);
    }
}

class Q12 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter balance: ");
        double balance = sc.nextDouble();
        System.out.print("Enter withdrawal: ");
        double amt = sc.nextDouble();

        try {
            if (amt > balance)
                throw new InsufficientBalanceException("InsufficientBalanceException: Not enough balance.");
            System.out.println("Withdrawal successful. Remaining: " + (balance - amt));
        } catch (InsufficientBalanceException e) {
            System.out.println(e.getMessage());
        }
    }
}