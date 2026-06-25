class Shape {

    // Area of Circle
    void area(double radius) {
        double result = 3.14 * radius * radius;
        System.out.println("Area of Circle: " + result);
    }

    // Area of Rectangle
    void area(double length, double width) {
        double result = length * width;
        System.out.println("Area of Rectangle: " + result);
    }

    // Area of Square
    void area(int side) {
        int result = side * side;
        System.out.println("Area of Square: " + result);
    }
}

public class MethodOverloadingShape {
    public static void main(String[] args) {

        Shape s = new Shape();

        s.area(5.0);      // Circle
        s.area(4.0, 6.0); // Rectangle
        s.area(5);        // Square
    }
}
