package DanielLiang.FundamentalOfProgramming.ElementaryProgramming;

import java.util.Scanner;

public class ConvertPoundsIntoKilogram {

    public static void main(String[] args) {
        try (Scanner input = new Scanner(System.in)) {

            // user prompt
            System.out.println("\nPound to kilogram Convertor");
            System.out.print("Enter Mass: ");
            double mass_in_pound = input.nextDouble();

            // Scanner object closed
            input.close();
            
            // conversion
            double mass = mass_in_pound * 0.454;

            // output
            System.out.println(mass_in_pound + "pounds is " + String.format("%.4f", mass) + "kg.");
        }catch (Exception e) {
            System.out.println("an error occurred. " + e);
        }

    }
}