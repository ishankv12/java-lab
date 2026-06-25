abstract class Payment {
    protected double amount;

    public Payment(double amount) {
        this.amount = amount;
    }

    // common method
    public void showAmount() {
        System.out.println("Amount: " + amount);
    }

    // must be implemented by each payment type
    public abstract void processPayment();
}

class UpiPayment extends Payment {
    private String upiId;

    public UpiPayment(double amount, String upiId) {
        super(amount);
        this.upiId = upiId;
    }

    @Override
    public void processPayment() {
        System.out.println("Processing UPI Payment...");
        System.out.println("UPI ID: " + upiId);
        System.out.println("UPI Payment Successful for " + amount);
        System.out.println();
    }
}

class CreditCardPayment extends Payment {
    private String cardNumber;

    public CreditCardPayment(double amount, String cardNumber) {
        super(amount);
        this.cardNumber = cardNumber;
    }

    private String maskCard(String cardNumber) {
        if (cardNumber.length() < 4) return "XXXX";
        return "XXXX-XXXX-XXXX-" + cardNumber.substring(cardNumber.length() - 4);
    }

    @Override
    public void processPayment() {
        System.out.println("Processing Credit Card Payment...");
        System.out.println("Card: " + maskCard(cardNumber));
        System.out.println("Credit Card Payment Successful for " + amount);
        System.out.println();
    }
}

class NetBankingPayment extends Payment {
    private String bankName;

    public NetBankingPayment(double amount, String bankName) {
        super(amount);
        this.bankName = bankName;
    }

    @Override
    public void processPayment() {
        System.out.println("Processing Net Banking Payment...");
        System.out.println("Bank: " + bankName);
        System.out.println("Net Banking Payment Successful for " + amount);
        System.out.println();
    }
}

class Q4 {
    public static void main(String[] args) {
        Payment p1 = new UpiPayment(500.00, "student@upi");
        Payment p2 = new CreditCardPayment(1200.50, "1234567812345678");
        Payment p3 = new NetBankingPayment(2500.00, "SBI");

        p1.processPayment();
        p2.processPayment();
        p3.processPayment();
    }
}