import java.util.Scanner;

class EvenNumbers_While {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the limit: ");
        int n = sc.nextInt();

        int i = 1;

        System.out.println("Even numbers are:");

        while(i <= n) {
            if(i % 2 == 0) {
                System.out.println(i);
            }
            i++;
        }

    }
}