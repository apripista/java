package DanielLiang.FundamentalOfProgramming.ElementaryProgramming;

import java.util.Scanner;

public class ConvertFeetsToMeters {

    public static void main(String[] args) {
        try (Scanner input = new Scanner(System.in)) {
            // user prompt
            System.out.println("\n\tFeet to Meter Converter.");
            System.out.print("\tEnter a Value for feet: ");
            double feets = input.nextDouble();

            // close a scanner object
            input.close();
            // calculation
            double meters = feets * 0.305;
            System.out.println(feets +  " feet is " + String.format("%.4f", meters) + " in meters");
        }catch (Exception e) {
            System.out.println("an error occurred. " + e);
        }
    }
}