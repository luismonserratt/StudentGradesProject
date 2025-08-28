import java.util.Scanner;

public class StudentGrades {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int[] grades = new int[50];
        int totalStudents;

        System.out.print("Enter number of students (1–50): ");
        totalStudents = Utils.getValidInt(input, 1, 50);

        for (int i = 0; i < totalStudents; i++) {
            System.out.print("Enter grade for student " + (i + 1) + " (0–100): ");
            grades[i] = Utils.getValidInt(input, 0, 100);
        }

        int highest = Utils.getHighest(grades, totalStudents);
        int lowest = Utils.getLowest(grades, totalStudents);
        double average = Utils.getAverage(grades, totalStudents);

        System.out.println("\nResults:");
        System.out.println("Highest grade: " + highest);
        System.out.println("Lowest grade: " + lowest);
        System.out.printf("Average grade: %.2f\n", average);
    }
}

