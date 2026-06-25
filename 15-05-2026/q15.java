import java.util.Scanner;
import java.util.StringTokenizer;
public class q15 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a sentence: ");
        String sentence = sc.nextLine();
        StringTokenizer st = new StringTokenizer(sentence);
        System.out.println("Total words = " + st.countTokens());
        System.out.println("Words and their lengths:");
        while (st.hasMoreTokens()) {
            String word = st.nextToken();
            System.out.println(word + " -> length = " + word.length());
        }
        sc.close();
    }
}