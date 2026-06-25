//Parametrized Constructor
public class Ishank_2 {
    int sl;
    String name;
    int age;
    Ishank_2(int s,String n,int a){
        sl=s;
        name=n;
        age=a;
    }
    void display(){
        System.out.println(sl+" "+name+" "+age);
    }
    public static void main(String[] args) {
        Ishank_2 n1=new Ishank_2(1,"ishank",19);
        Ishank_2 n2=new Ishank_2(2, "Rahul", 19);
        n1.display();
        n2.display();
    }
}
