package labs.lab_01;

import java.util.Scanner;

public class KphToMphConverter {
    public static void main(String[] args) {
        // Create a Scanner object
        Scanner scanner = new Scanner(System.in);

        // Prompt the user to input speed in kilometers per hour
        System.out.print("Enter speed in kilometers per hour (KPH): ");
        double kph = scanner.nextDouble();

        // Convert kilometers per hour to miles per hour
        double mph = kph * 0.621371;

        // Display the converted speed
        System.out.println("Speed in miles per hour (MPH): " + mph + " MPH");

        // Close the scanner
        scanner.close();
    }
}
