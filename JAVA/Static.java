class Counter_Static {
    static int count = 0;   // static variable
    Counter_Static() {
        count++;           // increase when object is created
    }
    static void displayCount() {   // static method
        System.out.println("Total objects created: " + count);
    }
}
public class Static {
    public static void main(String[] args) {
        Counter_Static c1 = new Counter_Static();
        Counter_Static c2 = new Counter_Static();
        Counter_Static c3 = new Counter_Static();
        Counter_Static.displayCount();   // calling static method
    }
}