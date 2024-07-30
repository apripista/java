package labs.lab_01;

import java.util.Scanner;

public class AgeInput {
    public static void main(String[] args) {
        // Create a Scanner object
        Scanner scanner = new Scanner(System.in);

        // Prompt the user to input their age
        System.out.print("Please enter your age: ");

        // Read the user's input
        int age = scanner.nextInt();

        // Display the user's age
        System.out.println("Your age is: " + age);

        // Close the scanner
        scanner.close();
    }
}
