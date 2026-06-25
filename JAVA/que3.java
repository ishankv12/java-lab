class Employee {
    void work() {
        System.out.println("Employee works");
    }
}
class Manager extends Employee {
    void work() {
        System.out.println("Manager manages team");
    }
}
class Developer extends Employee {
    void work() {
        System.out.println("Developer writes code");
    }
}
public class que3 {
    public static void main(String[] args) {
        Employee e;
        e = new Manager();
        e.work();
        e = new Developer();
        e.work();
    }
}