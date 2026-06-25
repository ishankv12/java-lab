class Bank {
    double getInterestRate() {
        return 0;
    }
}
class SBI extends Bank {
    double getInterestRate() {
        return 6.5;
    }
}
class HDFC extends Bank {
    double getInterestRate() {
        return 7.0;
    }
}
class ICICI extends Bank {
    double getInterestRate() {
        return 7.5;
    }
}
public class que2 {
    public static void main(String[] args) {
        Bank b;
        b = new SBI();
        System.out.println("SBI Rate: " + b.getInterestRate());
        b = new HDFC();
        System.out.println("HDFC Rate: " + b.getInterestRate());
        b = new ICICI();
        System.out.println("ICICI Rate: " + b.getInterestRate());
    }
}