package labs.lab_01;

import java.util.Scanner;

public class DaysConverter {
    public static void main(String[] args) {
        // Create a Scanner object
        Scanner scanner = new Scanner(System.in);

        // Prompt the user to input the number of days
        System.out.print("Enter the number of days: ");
        int days = scanner.nextInt();

        // Convert days into years, weeks, and days
        int years = days / 365;
        int remainingDays = days % 365;
        int weeks = remainingDays / 7;
        int remainingDaysInWeeks = remainingDays % 7;

        // Display the converted values
        System.out.println("Years: " + years);
        System.out.println("Weeks: " + weeks);
        System.out.println("Days: " + remainingDaysInWeeks);

        // Close the scanner
        scanner.close();
    }
}
