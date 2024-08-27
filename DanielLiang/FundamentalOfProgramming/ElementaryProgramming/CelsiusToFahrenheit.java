package DanielLiang.FundamentalOfProgramming.ElementaryProgramming;

import java.util.Scanner;

public class CelsiusToFahrenheit {

    public static void main(String[] args) {
        try (Scanner input = new Scanner(System.in)) {
            // user prompt
            System.out.println("\nCelsius to Fahrenheit Temperature Convertor");
            System.out.print("\n\tEnter a Temperature: ");
            double temperature = input.nextDouble();

            // Scanner object closed
            input.close();
            
            // conversion process
            double temperature_in_fahrenheit = (9.0/5) * temperature + 32;

            // output
            System.out.println(temperature + " is " + String.format("%.2f",temperature_in_fahrenheit) + " in Fahrenheit.");
        }catch (Exception e) {
            System.err.println("\nan error occurred: " + e);
        }
    }
}