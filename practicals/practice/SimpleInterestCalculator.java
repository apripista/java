import java.util.Scanner;

public class SimpleInterestCalculator {

    public static void simpleInterest(double principal, double rate, double time) {
        // Calculate simple interest
        double interest = (principal * rate * time) / 100;

        // Display the result
        System.out.println("Simple Interest: " + interest);
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Prompt the user to enter principal, rate, and time
        System.out.print("Enter the principal amount: ");
        double principal = input.nextDouble();

        System.out.print("Enter the annual interest rate (in percentage): ");
        double rate = input.nextDouble();

        System.out.print("Enter the time period (in years): ");
        double time = input.nextDouble();

        // Call the simpleInterest method with user-provided values
        simpleInterest(principal, rate, time);

        // Close the scanner
        input.close();
    }
}
