package labs.lab_04;

import java.util.Scanner;

public class IntegerOperations {

    public static void main(String[] args) {

        // user prompts
        try (Scanner input = new Scanner(System.in)) {
            System.out.print("Enter a number: ");
            double first = input.nextDouble();

            System.out.print("Enter a number: ");
            double second = input.nextDouble();

            System.out.print("Enter a number: ");
            double third = input.nextDouble();

            // calculations
            double sum = first + second + third;
            double product = first * second * third;
            double average = sum / 3;

            System.out.println("");
            // largest number
            if (first > second && first > third) {
                System.out.println(first + " is the largest number.");
            } else if (second > first && second > third) {
                System.out.println(second + " is the largest number.");
            } else if (third > first && third > second) {
                System.out.println(third + " is the largest number.");
            }

            // smallest number
            if (first < second && first < third) {
                System.out.println(first + " is the smallest number.");
            } else if (second < first && second < third) {
                System.out.println(second + " is the smallest number.");
            } else if (third < first && third < second) {
                System.out.println(third + " is the smallest number.");
            }
            

            System.out.println("Sum: " + sum);
            System.out.println("Product: " + product);
            System.out.println("Average: " + average);
        }
    }
}