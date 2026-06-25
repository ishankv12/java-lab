class Vehicle {
    private String brand;     // private → accessible only inside this class
    protected int speed;      // protected → accessible in same package & subclasses
    String fuelType;          // default → accessible in same package
    //Default Constructor
    Vehicle() {
        brand = "Unknown";
        speed = 0;
        fuelType = "Not specified";
    }
    //Parameterized Constructor
    Vehicle(String b, int s, String f) {
        brand = b;
        speed = s;
        fuelType = f;
    }
    //Method to set values (Setter method)
    public void setDetails(String b, int s, String f) {
        brand = b;
        speed = s;
        fuelType = f;
    }
    public void displayDetails() {
        System.out.println("Brand: " + brand);
        System.out.println("Speed: " + speed);
        System.out.println("Fuel Type: " + fuelType);
        System.out.println("----------------------");
    }
}
public class Main {
    public static void main(String[] args) {
        //Object 1 → Using Default Constructor
        Vehicle v1 = new Vehicle();  
        v1.displayDetails();  // shows default values
        //Object 2 → Using Parameterized Constructor
        Vehicle v2 = new Vehicle("Honda", 120, "Petrol");
        v2.displayDetails();
        //Object 3 → Using setDetails() method
        Vehicle v3 = new Vehicle();
        v3.setDetails("Tesla", 150, "Electric");
        v3.displayDetails();
    }
}
