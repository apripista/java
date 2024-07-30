package labs.lab_01;

import java.util.Scanner;

public class SwapNumbers {
    public static void main(String[] args) {
        // Create a Scanner object
        Scanner scanner = new Scanner(System.in);

        // Prompt the user to input two numbers
        System.out.print("Enter the first number: ");
        int num1 = scanner.nextInt();

        System.out.print("Enter the second number: ");
        int num2 = scanner.nextInt();

        // Swap the numbers without using a third variable
        num1 = num1 + num2;
        num2 = num1 - num2;
        num1 = num1 - num2;

        // Display the swapped numbers
        System.out.println("After swapping:");
        System.out.println("First number: " + num1);
        System.out.println("Second number: " + num2);

        // Close the scanner
        scanner.close();
    }
}
