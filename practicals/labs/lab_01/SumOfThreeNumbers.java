package labs.lab_01;

import java.util.Scanner;

public class SumOfThreeNumbers {
    public static void main(String[] args) {
        // Create a Scanner object
        Scanner scanner = new Scanner(System.in);

        // Prompt the user to input three numbers separated by commas
        System.out.print("Enter three numbers separated by commas: ");
        String input = scanner.nextLine();

        // Split the input string by commas
        String[] numbers = input.split(",");

        // Convert the strings to integers and calculate the sum
        int sum = 0;
        for (String number : numbers) {
            sum += Integer.parseInt(number.trim());
        }

        // Display the sum
        System.out.println("Sum of the three numbers: " + sum);

        // Close the scanner
        scanner.close();
    }
}
