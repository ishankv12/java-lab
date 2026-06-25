import java.util.*;

class OutOfStockException extends Exception {
    public OutOfStockException(String msg) {
        super(msg);
    }
}

class Q13 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int availableStock = 10;

        System.out.print("Enter quantity required: ");
        int qty = sc.nextInt();

        try {
            if (qty > availableStock)
                throw new OutOfStockException("OutOfStockException: Only " + availableStock + " available.");
            System.out.println("Order placed for quantity: " + qty);
        } catch (OutOfStockException e) {
            System.out.println(e.getMessage());
        }
    }
}