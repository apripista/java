package practicals.labs.lab_02;

import java.util.Scanner;

public class SumUserInputs {

    public static void main(String[] args) {
        try (// scanner 
        Scanner input = new Scanner(System.in)) {
            // usre prompts
            System.out.println("separate with space.");
            System.out.println("Enter two numbers: ");

            double number = input.nextDouble();
            double numbers = input.nextDouble();

            // calculations
            double sum = number + numbers;

            //outputs
            System.out.println("Sum is: " + sum);
        } catch (Exception e) {
            System.err.println("an error occured please try again" + e);
        }

    }
}