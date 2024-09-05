package labs.lab_01;

import java.util.Scanner;

public class ProductOfThreeNumbers {
    public static void main(String[] args) {
        // create a Scanner object
        Scanner scanner = new Scanner(System.in);

        // Prompt the user to input three numbers
        System.out.print("Enter the first number: ");
        int num1 = scanner.nextInt();

        System.out.print("Enter the second number: ");
        int num2 = scanner.nextInt();

        System.out.print("Enter the third number: ");
        int num3 = scanner.nextInt();

        // Calculate the product of the three numbers
        int product = num1 * num2 * num3;

        // Display the product
        System.out.println("Product of the three numbers: " + product);

        // Close the scanner
        scanner.close();
    }
}
