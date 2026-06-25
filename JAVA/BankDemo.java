class Bank {
    final double INTEREST_RATE = 5.5;   // final constant interest rate
    static double totalBankBalance = 0; // static variable for total balance
    String customerName;
    double balance;
    Bank(String name, double balance) {
        this.customerName = name;
        this.balance = balance;
        totalBankBalance += balance;   // update total balance
    }
    void displayAccount() {
        System.out.println("Customer Name: " + customerName);
        System.out.println("Balance: " + balance);
        System.out.println("Interest Rate: " + INTEREST_RATE + "%");
        System.out.println();
    }
    static void showTotalBankBalance() {
        System.out.println("Total Bank Balance: " + totalBankBalance);
    }
}
public class BankDemo {
    public static void main(String[] args) {

        Bank b1 = new Bank("Rahul", 10000);
        Bank b2 = new Bank("Ankit", 20000);
        Bank b3 = new Bank("Priya", 15000);

        b1.displayAccount();
        b2.displayAccount();
        b3.displayAccount();

        Bank.showTotalBankBalance(); // static method
    }
}
