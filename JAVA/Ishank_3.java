//Copy Constructor
public class Ishank_3 {
    int id;
    String name;
    float marks;
    Ishank_3(int i,String n,float m){
        id=i;
        name=n;
        marks=m;
    }
    Ishank_3(Ishank_3 i){
        id=i.id;
        name=i.name;
        marks=i.marks;
    }
    void display(){
        System.out.println(id+" "+name+" "+marks);
    }
    public static void main(String[] args) {
        Ishank_3 i1=new Ishank_3(110, "Isahnk", 85);
        Ishank_3 i2=new Ishank_3(i1);
        i1.display();
        i2.display();
    }
}
