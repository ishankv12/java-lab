class Car{
    String brand;
    void display(){
        System.out.println("Car brand: "+brand);
    }
}

class Student{
    String name;
    void display(){
        System.out.println("Student name: "+name);
    }
}

class Book{
    String title;
    void display(){
        System.out.println("Book title: "+title);
    }
}

public class First{
    public static void main(String[] args){
        Car c1=new Car();
        c1.brand="BMW";
        Student s1=new Student();
        s1.name="Ishank";
        Book b1=new Book();
        b1.title="Java Programming";
        c1.display();
        s1.display();
        b1.display();
        }
}