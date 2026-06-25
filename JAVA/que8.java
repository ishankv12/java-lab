class BankAccount {
    int accNo;
    double balance;
    BankAccount(int accNo, double balance) {
        this.accNo = accNo;
        this.balance = balance;
    }
}
public class que8 {
    static BankAccount createAccount() {
        return new BankAccount(12345, 5000.0);
    }
    public static void main(String[] args) {
        BankAccount b = createAccount();
        System.out.println("Account No: " + b.accNo);
        System.out.println("Balance: " + b.balance);
    }
}