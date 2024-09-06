package DanielLiang.FundamentalOfProgramming.Selections;

import java.util.Scanner;

public class Lottery {

    @SuppressWarnings("resource")
    public static void main(String[] args) {
        // random lottery number generation
        // Generates a number between 100 and 999 (inclusive)
        int lottery = (int) (Math.random() * 900) + 100;

        Scanner input = new Scanner(System.in);

        // user prompt to enter a three-digit number within the specified range
        System.out.print("Enter your lottery pick (three digits between 100 and 999): ");
        int user_guess = input.nextInt();

        // Validate the user's guess to ensure it's within the specified range
        if (user_guess < 100 || user_guess > 999) {
            System.out.println("Invalid input. Please enter a three-digit number between 100 and 999.");
            return; // exit the program if the input is invalid
        }

        // extract digits from the lottery number and user's guess
        int lottery_digit_1 = lottery / 100;
        int lottery_digit_2 = (lottery / 10) % 10;
        int lottery_digit_3 = lottery % 10;

        int user_guess_digit_1 = user_guess / 100;
        int user_guess_digit_2 = (user_guess / 10) % 10;
        int user_guess_digit_3 = user_guess % 10;

        System.out.println("The lottery number is " + lottery);

        // check each digit of the user's guess
        // against each digit of the lottery number
        if (user_guess == lottery) {
            System.out.println("Exact match: you win $10,000!");
        } else if (user_guess_digit_1 == lottery_digit_1 || user_guess_digit_1 == lottery_digit_2 || user_guess_digit_1 == lottery_digit_3
                || user_guess_digit_2 == lottery_digit_1 || user_guess_digit_2 == lottery_digit_2 || user_guess_digit_2 == lottery_digit_3
                || user_guess_digit_3 == lottery_digit_1 || user_guess_digit_3 == lottery_digit_2 || user_guess_digit_3 == lottery_digit_3) {
            System.out.println("Match one digit: you win $1,000!");
        } else {
            System.out.println("Sorry, no match.");
        }

        input.close(); // Close the Scanner object
    }
}
