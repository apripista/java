package labs.lab_01;

import java.util.Scanner;

public class BikeSpeedCalculator {
    public static void main(String[] args) {
        // Create a Scanner object
        Scanner scanner = new Scanner(System.in);

        // Prompt the user to input distance and time
        System.out.print("Enter the distance traveled (in meters): ");
        double distance = scanner.nextDouble();

        System.out.print("Enter the time taken (in seconds): ");
        double time = scanner.nextDouble();

        // Calculate speed
        double speed = distance / time;

        // Display the calculated speed
        System.out.println("Speed of the bike: " + speed + " meters per second");

        // Close the scanner
        scanner.close();
    }
}
