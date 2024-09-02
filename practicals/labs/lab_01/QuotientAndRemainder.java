package labs.lab_01;

import java.util.Scanner;

public class QuotientAndRemainder {
    public static void main(String[] args) {
        // Create a Scanner object
        Scanner scanner = new Scanner(System.in);

        // Prompt the user to input the dividend and divisor
        System.out.print("Enter the dividend: ");
        int dividend = scanner.nextInt();

        System.out.print("Enter the divisor: ");
        int divisor = scanner.nextInt();

        // Calculate quotient and remainder
        int quotient = dividend / divisor;
        int remainder = dividend % divisor;

        // Display the results
        System.out.println("Quotient: " + quotient);
        System.out.println("Remainder: " + remainder);

        // Close the scanner
        scanner.close();
    }
}
