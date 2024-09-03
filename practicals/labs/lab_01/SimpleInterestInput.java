package labs.lab_01;

import java.util.Scanner;

public class SimpleInterestInput {
    public static void main(String[] args) {
        // Create a Scanner object
        Scanner scanner = new Scanner(System.in);

        // Prompt the user to input principal, rate, and time
        System.out.print("Enter the principal amount: ");
        double principal = scanner.nextDouble();

        System.out.print("Enter the rate of interest: ");
        double rate = scanner.nextDouble();

        System.out.print("Enter the time period (in years): ");
        double time = scanner.nextDouble();

        // Calculate simple interest
        double simpleInterest = (principal * rate * time) / 100;

        // Display the calculated simple interest
        System.out.println("Simple Interest: " + simpleInterest);

        // Close the scanner
        scanner.close();
    }
}
