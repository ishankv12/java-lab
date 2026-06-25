class Employee {
    private int id;
    private String name;
    private double salary;
    // No-arg constructor
    Employee() {
        this(0, "Unknown", 0.0); // constructor chaining
    }
    // Constructor with id and name
    Employee(int id, String name) {
        this(id, name, 0.0); // constructor chaining
    }
    // Constructor with id, name, and salary
    Employee(int id, String name, double salary) {
        this.id = id;
        this.name = name;
        this.salary = salary;
    }
    void display() {
        System.out.println("Employee ID   : " + id);
        System.out.println("Employee Name : " + name);
        System.out.println("Salary        : " + salary);
        System.out.println();
    }
}
class Q1 {
    public static void main(String[] args) {
        Employee e1 = new Employee();
        Employee e2 = new Employee(101, "Alice");
        Employee e3 = new Employee(102, "Bob", 75000.00);

        e1.display();
        e2.display();
        e3.display();
    }
}