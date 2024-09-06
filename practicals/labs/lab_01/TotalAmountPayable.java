package labs.lab_01;

import java.util.Scanner;

public class TotalAmountPayable {
    public static void main(String[] args) {
        // Create a Scanner object
        Scanner scanner = new Scanner(System.in);

        // Prompt the user to input quantity and price of each pen purchased
        System.out.print("Enter the quantity of pens purchased: ");
        int quantity = scanner.nextInt();

        System.out.print("Enter the price of each pen: ");
        double price = scanner.nextDouble();

        // Calculate the total amount payable
        double totalAmount = quantity * price;

        // Display the total amount payable
        System.out.println("Total amount payable: " + totalAmount);

        // Close the scanner
        scanner.close();
    }
}
