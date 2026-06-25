class Employee {
    int empId;
    String name;
    double salary;

    Employee(int empId, String name, double salary) {
        this.empId = empId;
        this.name = name;
        this.salary = salary;
    }
}

public class que5 {
    static void display(Employee e) {
        System.out.println("ID: " + e.empId);
        System.out.println("Name: " + e.name);
        System.out.println("Salary: " + e.salary);
    }

    public static void main(String[] args) {
        Employee e1 = new Employee(101, "Alice", 50000);
        display(e1);
    }
}