package labs.lab_01;

import java.util.Scanner;

public class TimeConverter {
    public static void main(String[] args) {
        // Create a Scanner object
        Scanner scanner = new Scanner(System.in);

        // Prompt the user to input the time in seconds
        System.out.print("Enter time in seconds: ");
        int seconds = scanner.nextInt();

        // Convert seconds into hours, minutes, and remaining seconds
        int hours = seconds / 3600;
        int remainingSeconds = seconds % 3600;
        int minutes = remainingSeconds / 60;
        int remainingSecondsInMinutes = remainingSeconds % 60;

        // Display the converted values
        System.out.println("Hours: " + hours);
        System.out.println("Minutes: " + minutes);
        System.out.println("Seconds: " + remainingSecondsInMinutes);

        // Close the scanner
        scanner.close();
    }
}
