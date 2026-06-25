import java.util.Scanner;
public class DataTypesInput {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter an integer: ");
        int num = sc.nextInt();
        System.out.print("Enter a float: ");
        float f = sc.nextFloat();
        System.out.print("Enter a double: ");
        double d = sc.nextDouble();
        System.out.print("Enter a character: ");
        char ch = sc.next().charAt(0); 
        // next() returns string, charAt(0) gets first character
        System.out.print("Enter a boolean (true/false): ");
        boolean bool = sc.nextBoolean();
        // Clear buffer
        sc.nextLine(); 
        System.out.print("Enter a string: ");
        String str = sc.nextLine();
        System.out.println("\n--- Entered Values ---");
        System.out.println("Integer: " + num);
        System.out.println("Float: " + f);
        System.out.println("Double: " + d);
        System.out.println("Character: " + ch);
        System.out.println("Boolean: " + bool);
        System.out.println("String: " + str);
        sc.close();
    }
}