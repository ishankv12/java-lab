import java.util.Scanner;
public class q9 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number of students: ");
        int n = sc.nextInt();
        int[][] marks = new int[n][3]; // 3 subjects
        for (int i = 0; i < n; i++) {
            System.out.println("Enter marks of student " + (i + 1) + " in 3 subjects:");
            for (int j = 0; j < 3; j++) {
                marks[i][j] = sc.nextInt();
            }
        }
        System.out.println("Result:");
        for (int i = 0; i < n; i++) {
            int total = 0;
            for (int j = 0; j < 3; j++) total += marks[i][j];
            double avg = total / 3.0;
            System.out.println("Student " + (i + 1) + " -> Total = " + total + ", Average = " + avg);
        }
        sc.close();
    }
}
