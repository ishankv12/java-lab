class Student {
    int marks;

    Student(int marks) {
        this.marks = marks;
    }
}

public class que11 {

    static void updateMarks(Student s) {
        s.marks = s.marks + 10; // updating marks
    }

    public static void main(String[] args) {
        Student s1 = new Student(70);

        System.out.println("Before Update: " + s1.marks);

        updateMarks(s1);

        System.out.println("After Update: " + s1.marks);
    }
}