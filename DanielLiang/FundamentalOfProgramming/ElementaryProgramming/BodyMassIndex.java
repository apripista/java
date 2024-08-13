package DanielLiang.FundamentalOfProgramming.ElementaryProgramming;

import java.util.Scanner;

public class BodyMassIndex {

    public static void main(String[] args) {
        try (Scanner input = new Scanner(System.in)) {

            // user prompt
            System.out.println("BMI Calculator: mass is in punds and height is in inches");
            System.out.println("BMI Has No Si units.");
            System.out.print("\n\tEnter a Your Mass: ");
            double mass_in_pound = input.nextDouble();

            System.out.print("\tWhat is Your Height: ");
            double height_in_feets = input.nextDouble();

            // conversions
            double mass = mass_in_pound * 0.45359237;
            double height = height_in_feets * 0.0254;
            
            // BMI calculator
            double bmi = mass / (height * height);

            // output
            System.out.println("\nYour BMI is: " + String.format("%.4f", bmi));

            if(bmi > 18.5 && bmi <= 24.8){
                System.out.println("You have a Normal Weight.");
            }else if(bmi < 18.5){
                System.out.println("UnderWeight.");
                System.out.println("Eat Healthier Foods and Seek Medical support.");
            }else if(bmi >= 25 && bmi < 29.9){
                System.out.println("You have Overweight");
            }else if(bmi > 29.9){
                System.out.println("Obesity!");
                System.out.println("Ops please seek medical help ASAP");
            }
        }catch (Exception e) {
            System.err.println("\nan error occurred: " + e);
        }
    }
}