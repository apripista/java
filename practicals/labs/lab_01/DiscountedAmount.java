package labs.lab_01;

import java.util.Scanner;

public class DiscountedAmount {
    public static void main(String[] args) {
        // Create a Scanner object
        Scanner scanner = new Scanner(System.in);

        // Prompt the user to input the purchase amount
        System.out.print("Enter the purchase amount: ");
        double purchaseAmount = scanner.nextDouble();

        // Calculate the discount amount (assuming 10% discount)
        double discount = 0.1 * purchaseAmount;

        // Calculate the amount to be paid after discount
        double discountedAmount = purchaseAmount - discount;

        // Display the discounted amount
        System.out.println("Amount after discount: " + discountedAmount);

        // Close the scanner
        scanner.close();
    }
}
