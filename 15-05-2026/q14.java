import java.util.Scanner;
public class q14 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter first string: ");
        String s1 = sc.nextLine();
        System.out.print("Enter second string: ");
        String s2 = sc.nextLine();
        StringBuilder sb = new StringBuilder();
        sb.append(s1).append(s2);
        System.out.println("After append: " + sb);
        System.out.print("Enter a word to insert: ");
        String word = sc.nextLine();
        System.out.print("Enter position (0 to " + sb.length() + "): ");
        int pos = sc.nextInt();
        sb.insert(pos, word);
        System.out.println("After insert: " + sb);
        sb.reverse();
        System.out.println("After reverse: " + sb);
        sc.close();
    }
}
