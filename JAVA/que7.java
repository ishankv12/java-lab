class Student {
    int id;
    String name;

    Student(int id, String name) {
        this.id = id;
        this.name = name;
    }
}

public class que7 {

    static Student createStudent() {
        Student s = new Student(1, "John");
        return s;
    }

    public static void main(String[] args) {
        Student s1 = createStudent();
        System.out.println("ID: " + s1.id);
        System.out.println("Name: " + s1.name);
    }
}
