package DanielLiang.FundamentalOfProgramming.ElementaryProgramming;

import java.util.Scanner;

public class DigitInInteger {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        // Prompt the user to enter a number between 0 and 1000
        System.out.print("\nEnter a number between 0 and 1000: ");
        int number = input.nextInt();

        // Scanner object closed
        input.close();

        // Calculate the sum of the digits
        int sum = 0;
        // original number for displaying later
        int originalNumber = number;
        while (number != 0) {
            // Extract the last digit and add it to the sum
            sum += number % 10;
            // Remove the last digit from the number
            number /= 10;
        }

        // Display the result
        System.out.println("The sum of the digits in " + originalNumber + " is " + sum);
    }
}