import java.util.Scanner;
public class q2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] marks = new int[5];
        int sum = 0;
        System.out.println("Enter marks of 5 students:");
        for (int i = 0; i < marks.length; i++) {
            marks[i] = sc.nextInt();
            sum += marks[i];
        }
        double avg = (double) sum / marks.length;
        int highest = marks[0];
        for (int m : marks) {
            if (m > highest) highest = m;
        }
        int aboveAvgCount = 0;
        for (int m : marks) {
            if (m > avg) aboveAvgCount++;
        }
        System.out.println("Average = " + avg);
        System.out.println("Highest = " + highest);
        System.out.println("Students above average = " + aboveAvgCount);
        sc.close();
    }
}