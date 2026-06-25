class MathOperation {
    void add(int a, int b) {
        System.out.println("Sum of two numbers: " + (a + b));
    }
    void add(int a, int b, int c) {
        System.out.println("Sum of three numbers: " + (a + b + c));
    }
    void add(double a, double b) {
        System.out.println("Sum of double numbers: " + (a + b));
    }
    void mul(float a,int b,double c){
        System.out.println("Multiplication of float,int and dpuble numbers: " + (a*b*c));
    }
}
public class Method_overloading {
    public static void main(String[] args) {
        MathOperation obj = new MathOperation();
        obj.add(5, 10);
        obj.add(5, 10, 15);
        obj.add(2.5, 3.5);
        obj.mul(1.0f, 3, 1.2);
    }
}