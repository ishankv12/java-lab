class Student {
    int id;
    String name;
    Student(int id, String name) {
        this.id = id;
        this.name = name;
    }
}
public class que4 {
    static void display(Student s) {
        System.out.println("ID: " + s.id);
        System.out.println("Name: " + s.name);
    }
    public static void main(String[] args) {
        Student s1 = new Student(1, "John");
        display(s1);
    }
}