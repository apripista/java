/*
Loop Design Strategies

Writing a correct loop is a critical skill in programming.
Consider these three steps when designing a loop:

Step 1: Identify the statements that need to be repeated.
Step 2: Wrap these statements in a loop structure.
Step 3: Add the loop-continuation-condition and appropriate control mechanisms to manage the loop.

Example: A program that repeatedly asks a user to guess a number between 1 and 10.
*/

import java.util.Scanner;

public class LoopDesignStrategies{
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int targetNumber = 7; // The number to be guessed
        int guess = -1; // Initialize guess variable

        // Step 2: Wrap the statements in a loop structure
        while (guess != targetNumber) {
            // Step 1: Identify the statements to be repeated
            System.out.print("Guess a number between 1 and 10: ");
            guess = input.nextInt();

            // Step 3: Add control mechanisms and loop-continuation-condition
            if (guess < targetNumber) {
                System.out.println("Too low! Try again.");
            } else if (guess > targetNumber) {
                System.out.println("Too high! Try again.");
            } else {
                System.out.println("Congratulations! You guessed the right number.");
            }
        }
    }
}
