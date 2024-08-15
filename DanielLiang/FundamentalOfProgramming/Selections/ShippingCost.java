package DanielLiang.FundamentalOfProgramming.Selections;

import java.util.Scanner;

public class ShippingCost {
    public static void main(String[] args) {
        try (// user prompt to enter the weight of the package
        Scanner scanner = new Scanner(System.in)) {
            System.out.print("Enter the weight of the package in pounds: ");
            double weight = scanner.nextDouble();

            // calculate the shipping cost based on the weight
            double cost;
            if (weight <= 1) {
                cost = 3.5;
            } else if (weight <= 3) {
                cost = 5.5;
            } else if (weight <= 10) {
                cost = 8.5;
            } else if (weight <= 20) {
                cost = 10.5;
            } else {
                System.out.println("The package cannot be shipped.");
                return;
            }

            // display the shipping cost
            System.out.println("Shipping cost: $" + cost);
       
        }catch (Exception e) {
            System.err.println("An error Occurred" + e);
        }
    }
}
