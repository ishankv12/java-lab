import java.util.Scanner;

class EvenNumbers_For {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the limit: ");
        int n = sc.nextInt();

        for(int i = 2; i <= n; i += 2) {
            System.out.println(i);
        }

    }
}