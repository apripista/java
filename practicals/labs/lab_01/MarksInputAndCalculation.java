package labs.lab_01;

import java.util.Scanner;

public class MarksInputAndCalculation {
    public static void main(String[] args) {
        // Create a Scanner object
        Scanner scanner = new Scanner(System.in);

        // Prompt the user to input marks of three subjects
        System.out.print("Enter marks of subject 1: ");
        double subject1 = scanner.nextDouble();

        System.out.print("Enter marks of subject 2: ");
        double subject2 = scanner.nextDouble();

        System.out.print("Enter marks of subject 3: ");
        double subject3 = scanner.nextDouble();

        // Calculate total marks and percentage
        double totalMarks = subject1 + subject2 + subject3;
        double percentage = (totalMarks / 300) * 100;

        // Display the results
        System.out.println("Total marks: " + totalMarks);
        System.out.println("Percentage: " + percentage + "%");

        // Close the scanner
        scanner.close();
    }
}
