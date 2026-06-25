public class MethodOverloading {
    // Method to display a String
    void display(String msg) {
        System.out.println("String value: " + msg);
    }
    // Method to display an Integer
    void display(int num) {
        System.out.println("Integer value: " + num);
    }
    public static void main(String[] args) {
        // Create object of class
        MethodOverloading obj = new MethodOverloading();
        // Calling overloaded methods
        obj.display("Hello Java"); // Calls String version
        obj.display(100);          // Calls Integer version
    }
}
