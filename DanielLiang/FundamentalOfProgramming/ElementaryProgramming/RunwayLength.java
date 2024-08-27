package DanielLiang.FundamentalOfProgramming.ElementaryProgramming;

import java.util.Scanner;

public class RunwayLength {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("\n\tRunway Length of Airplane.");
        // user prompt
        System.out.print("\nenter speed: ");
        double speed = input.nextDouble();

        System.out.print("Enter acceleration: ");
        double acceleration = input.nextDouble();

        // Close the Scanner 
        // object to avoid resource leak
        input.close();

        // runway lenght calculation
        double runway_length = speed * speed / (2 * acceleration);
        System.out.println("The minimum runway length of this airplane is:"
             + String.format("%.3f", runway_length) + "m/s/s");
    }
}