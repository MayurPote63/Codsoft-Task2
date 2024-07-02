import java.util.*;

public class Studentcalculator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int totalSubjects;
        int[] marks;

        System.out.print("Enter the total number of subjects: ");
        totalSubjects = sc.nextInt();

        marks = new int[totalSubjects];
        for (int i = 0; i < totalSubjects; i++) {
            System.out.printf("Enter subject marks  %d: ", i + 1);
            marks[i] = sc.nextInt();
        }

        int totalMarks = calculateTotalMarks(marks);
        double avgPercentage = calculateAveragePercentage(totalMarks, totalSubjects);
        String grade = assignGrade(avgPercentage);

        displayResults(totalMarks, avgPercentage, grade);

        sc.close(); 
    }

    private static int calculateTotalMarks(int[] marks) {
        int totalMarks = 0;
        for (int mark : marks) {
            totalMarks += mark;
        }
        return totalMarks;
    }

    private static double calculateAveragePercentage(int totalMarks, int numSubjects) {
        return ((double) totalMarks / (numSubjects * 100)) * 100;
    }

    private static String assignGrade(double averagePercentage) {
        if (averagePercentage >= 90) {
            return "A";
        } else if (averagePercentage >= 80) {
            return "B";
        } else if (averagePercentage >= 70) {
            return "C";
        } else if (averagePercentage >= 60) {
            return "D";
        } else {
            return "F";
        }
    }

    private static void displayResults(int totalMarks, double averagePercentage, String grade) {
        System.out.println("Total marks obtained by student: " + totalMarks);
        System.out.printf("Percentage obtained by Student: %.2f%%\n", averagePercentage);
        System.out.println("Grade obtained by student: " + grade);
    }
}
