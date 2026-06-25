//Default Constructor
public class Ishank_1{
    int age;
    String name;
    Ishank_1(){
        age=19;
        name="Ishank";
    }
    void display(){
        System.out.println(name+" "+age);
    }
    public static void main(String[] args) {
        Ishank_1 s1=new Ishank_1();
        s1.display();
    }
}