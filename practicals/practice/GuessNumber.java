import java.util.*;

public class GuessNumber {

    public static void main(String[] args){
        // Generate a random number between 0 and 100
        int number = (int)(Math.random() * 100);
        int attempts = 0;
        int max_attempts = 5; // Maximum number of attempts allowed

        System.out.println("Guess a number between 0 and 100");

        try (Scanner input = new Scanner(System.in)) {
            int guess = -1;
            // Continue prompting the user until they guess the number or reach the maximum attempts
            while (guess != number && attempts < max_attempts){
                System.out.print("Enter your guess: ");
                guess = input.nextInt();
                attempts++;

                // Check if the guess is correct, too high, or too low
                if(guess == number){
                    System.out.println("\nYou got it!");
                } else if(guess > number){
                    System.out.println("\nYour guess is too high");
                } else {
                    System.out.println("\nYour guess is too low");
                }

                // If the user runs out of attempts, reveal the correct number
                if(guess != number && attempts == max_attempts){
                    System.out.println("\nYou have reached the maximum attempts. The number was: " + number);
                }
            }
        }
    }
}

/*
    This program implements a simple number guessing game where the user tries to guess a randomly generated number
    between 0 and 100. It allows the user a maximum of 5 attempts to guess the correct number.

    - The main method initializes variables such as the random number, the number of attempts, and the maximum attempts allowed.
    - It prompts the user to guess a number and continuously checks if the guess is correct, too high, or too low.
    - The program uses a while loop to keep prompting the user until they guess the correct number or reach the maximum attempts.
    - After each guess, the program provides feedback to the user based on their guess.
    - If the user exceeds the maximum number of attempts without guessing the correct number, the program reveals the correct number.

    Overall, this program demonstrates how to interact with users in a simple guessing game scenario using loops, conditionals,
    and user input.
*/
