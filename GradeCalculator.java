import java.util.Scanner;

public class GradeCalculator {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int total = 0;
        int subjects = 5;

        for (int i = 1; i <= subjects; i++) {
            System.out.print("Enter score for subject " + i + ": ");
            int score = input.nextInt();
            total += score;
        }

        double average = total / (double) subjects;

        System.out.println("Total: " + total);
        System.out.println("Average: " + average);

        if (average >= 70) {
            System.out.println("Grade: A");
        } else if (average >= 60) {
            System.out.println("Grade: B");
        } else if (average >= 50) {
            System.out.println("Grade: C");
        } else {
            System.out.println("Grade: F");
        }
    }
}
