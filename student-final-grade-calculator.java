import java.util.Scanner;

public class Act2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Student's Final Average Calculator");
        System.out.println("----------------------------------");

        System.out.print("Student Name: ");
        String name = scanner.nextLine();

        System.out.print("Section: ");
        String sectionName = scanner.nextLine();

        System.out.print("Quiz Grade 1: ");
        double firstQuiz = scanner.nextDouble();

        System.out.print("Quiz Grade 2: ");
        double secondQuiz = scanner.nextDouble();

        System.out.print("Performance Task Grade 1: ");
        double firstPerfTask = scanner.nextDouble();

        System.out.print("Performance Task Grade 2: ");
        double secondPerfTask = scanner.nextDouble();

        System.out.print("Prelim Grade: ");
        double prelim = scanner.nextDouble();

        System.out.print("Midterm Grade: ");
        double midterm = scanner.nextDouble();

        System.out.print("Semi-Final Grade: ");
        double semiFinal = scanner.nextDouble();

        System.out.print("Final Grade: ");
        double finalExam = scanner.nextDouble();

        // Calculations
        double avgQuiz = (firstQuiz + secondQuiz) / 2.0;
        double avgPerfTask = (firstPerfTask + secondPerfTask) / 2.0;
        double avgMajorExams = (prelim + midterm + semiFinal + finalExam) / 4.0;

        double finalAverage = (avgQuiz + avgPerfTask + avgMajorExams) / 3.0;

        System.out.println("\n----------------------------------");
        System.out.println("Average: " + String.format("%.2f", finalAverage));

        if (finalAverage >= 75.0) {
            System.out.println("Passed!");
        } else {
            System.out.println("Failed!");
        }

        scanner.close();
    }
}
