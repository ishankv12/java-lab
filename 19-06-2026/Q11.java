import java.util.*;

class InvalidAgeException extends Exception {
    public InvalidAgeException(String msg) {
        super(msg);
    }
}

class Q11 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter age: ");
        int age = sc.nextInt();

        try {
            if (age < 18) throw new InvalidAgeException("InvalidAgeException: Age must be >= 18.");
            System.out.println("Age is valid: " + age);
        } catch (InvalidAgeException e) {
            System.out.println(e.getMessage());
        }
    }
}