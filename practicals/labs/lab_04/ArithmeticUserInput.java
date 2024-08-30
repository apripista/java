package labs.lab_04;

import java.util.Scanner;

public class ArithmeticUserInput {

    public static void main(String[] args) {
        try (Scanner input = new Scanner(System.in)) {
            // user prompts
            System.out.print("Enter a number: ");
            double first = input.nextDouble();

            System.out.print("Enter a number: ");
            double second = input.nextDouble();

            double product = first * second;
            double sum = first + second;
            double difference = first - second;
            double reminder = first % second;
            double quotient = first / second;

            // outputs
            System.out.println("Sum is: " + sum);
            System.out.println("Product is: " + product);
            System.out.println("Difference is: " + difference);
            System.out.println("Quotient is: " + quotient);
            System.out.println("Remender is: " + reminder);
        
        } catch (Exception e) {
            System.out.println("an error occured" + e);
        }

    }
}