package DanielLiang.FundamentalOfProgramming.Selections;

import java.util.Scanner;

public class BodyMassIndex {

    public static void main(String[] args) {
        try (Scanner input = new Scanner(System.in)) {
            // weight in pounds
            System.out.print("Enter weight in pounds: ");
            int weight_pounds = input.nextInt();

            // pound convertion to kilograms
            double weight_kg = weight_pounds * 0.453592;

            // height in feet and inches
            System.out.print("Enter feet: ");
            int feet = input.nextInt();

            System.out.print("Enter inches: ");
            int inches = input.nextInt();

            // Convert inches to meters
            double height_meters = ((feet * 12) + inches) * 0.0254;

            // Calculate BMI
            // Formula for BMI calculation
            double bmi = weight_kg / (height_meters * height_meters);

            System.out.println("BMI is " + bmi);

            // Interpret BMI
            if (bmi < 18.5) {
                System.out.println("Underweight");
            } else if (bmi < 25) {
                System.out.println("Normal");
            } else if (bmi < 30) {
                System.out.println("Overweight");
            } else {
                System.out.println("Obese");
            }
            
        }catch (Exception e) {
            System.err.println("An error Occurred" + e);
        }
    }

}