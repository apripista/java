// SUM OF ARITHMETIC NUMBERS

import java.util.Scanner;

public class SumOfArithmeticNumbers {

    public static void main(String[] args) {
        try (// create a scanner
        Scanner input = new Scanner(System.in)) {
            System.out.print("What nth terms are there: ");
            double number_of_terms = input.nextDouble();

            System.out.print("What is the first term: ");
            double first_term = input.nextDouble();

            System.out.print("What is the common difference: ");
            double common_difference = input.nextDouble();

            double nth_term = first_term + (number_of_terms - 1) * common_difference;
            double summation = (number_of_terms / 2 ) * (first_term + nth_term);

            System.out.println("The summantion of " + number_of_terms +" Arithmetic terms is: " + summation);
        }

    }
}