package labs.lab_01;

import java.util.Scanner;

public class TotalSalaryCalculator {
    public static void main(String[] args) {
        // Create a Scanner object
        Scanner scanner = new Scanner(System.in);

        // Prompt the user to input basic salary
        System.out.print("Enter the basic salary: ");
        double basicSalary = scanner.nextDouble();

        // Calculate HRA, DA, and TA (assuming percentages)
        double hra = 0.3 * basicSalary;
        double da = 0.4 * basicSalary;
        double ta = 0.2 * basicSalary;

        // Calculate total salary
        double totalSalary = basicSalary + hra + da + ta;

        // Display the total salary
        System.out.println("Total salary: " + totalSalary);

        // Close the scanner
        scanner.close();
    }
}
