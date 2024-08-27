package DanielLiang.FundamentalOfProgramming.ElementaryProgramming;

import java.util.*;

public class DrivingCost {

    public static void main(String[] args) {
        try (// user prompt
        Scanner input = new Scanner(System.in)) {
            System.out.print("Driving cost calculator.");
            System.out.print("What is the driving distance: ");
            double driving_distance = input.nextDouble();

            System.out.print("Enter Miles per Gallon: ");
            double fuel_efficiency = input.nextDouble();

            System.out.print("Enter Price per Gallon: ");
            double price_per_gallon = input.nextDouble();
            
            // calculations
            double driving_cost = (driving_distance / fuel_efficiency ) * price_per_gallon;

            // driving cost.
            System.out.println("The cost of Driving is: $" + String.format("%.3f", driving_cost) );
            
        }catch (Exception e) {
            System.out.println("an error occurred. " + e);
        }
    }
}