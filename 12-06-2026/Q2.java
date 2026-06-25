class Product {
    private int productId;
    private String productName;
    private double price;   // per item
    private int quantity;

    // No-arg constructor
    Product() {
        this(0, "Unknown", 0.0, 0);
    }

    // id and name
    Product(int productId, String productName) {
        this(productId, productName, 0.0, 0);
    }

    // id, name, price
    Product(int productId, String productName, double price) {
        this(productId, productName, price, 1);
    }

    // all fields
    Product(int productId, String productName, double price, int quantity) {
        this.productId = productId;
        this.productName = productName;
        this.price = price;
        this.quantity = quantity;
    }

    double totalCost() {
        return price * quantity;
    }

    void display() {
        System.out.println("Product ID   : " + productId);
        System.out.println("Product Name : " + productName);
        System.out.println("Price        : " + price);
        System.out.println("Quantity     : " + quantity);
        System.out.println("Total Cost   : " + totalCost());
        System.out.println();
    }
}

class Q2 {
    public static void main(String[] args) {
        Product p1 = new Product();
        Product p2 = new Product(101, "Pen");
        Product p3 = new Product(102, "Notebook", 45.50);
        Product p4 = new Product(103, "Laptop", 55000.00, 2);

        p1.display();
        p2.display();
        p3.display();
        p4.display();
    }
}
