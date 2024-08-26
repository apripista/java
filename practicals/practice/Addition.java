import java.util.Scanner;

public class Addition {

    public static void main(String[] args) {
        // Create a Scanner object to read user input
        try (Scanner input = new Scanner(System.in)) {
            // Continuously generate addition questions
            // until the user provides the correct answer
            while (true) {
                // Generate two random numbers for the addition question
                int firstNumber = (int) (Math.random() * 10);
                int secondNumber = (int) (Math.random() * 7);

                // Prompt the user with the addition question
                System.out.print("What is " + firstNumber + " + " + secondNumber + "? ");

                // Read the user's answer
                int answer = input.nextInt();

                // Check if the user's answer is correct
                if (firstNumber + secondNumber == answer) {
                    System.out.println("You got it!");
                    break; // Exit the loop if the answer is correct
                } else {
                    // Display a message indicating the incorrect answer
                    System.out.println("That's incorrect. Try again.");
                }
            }
        }
    }
}

/*
    This program generates random addition questions and prompts the user to answer them.
    - It generates two random numbers between 0 and 9 and between 0 and 6 for the addition operation.
    - It repeatedly prompts the user for the sum of the two numbers until the correct answer is provided.
    - Once the correct answer is provided, the program displays a success message and terminates.
*/
