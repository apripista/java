package DanielLiang.FundamentalOfProgramming.Selections;

import java.util.Scanner;

public class CompareCosts {
    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
            // user prompt to enter weight and price for package 1
            System.out.print("Enter weight and price for package 1: ");
            double weight1 = scanner.nextDouble();
            double price1 = scanner.nextDouble();

            // user prompt to enter weight and price for package 2
            System.out.print("Enter weight and price for package 2: ");
            double weight2 = scanner.nextDouble();
            double price2 = scanner.nextDouble();

            // calculate the unit price for each package
            double unitPrice1 = price1 / weight1;
            double unitPrice2 = price2 / weight2;

            // compare the unit prices
            if (unitPrice1 < unitPrice2) {
                System.out.println("Package 1 has a better price.");
            } else if (unitPrice1 > unitPrice2) {
                System.out.println("Package 2 has a better price.");
            } else {
                System.out.println("Two packages have the same price.");
            }
            
        }catch (Exception e) {
            System.err.println("An error Occurred" + e);
        }
    }
}
