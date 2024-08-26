import java.util.Scanner;

public class Subtraction {
    public static void main(String[] args) {
        // Number of questions to ask the user
        final int NUMBER_OF_QUESTIONS = 5;

        // Counters to track correct answers and total questions asked
        int correctCount = 0;
        int count = 0;

        // Record the start time of the test
        long startTime = System.currentTimeMillis();

        // String to store the output of each question
        String output = "";

        try (Scanner input = new Scanner(System.in)) {
            // Loop until the desired number of questions are asked
            while (count < NUMBER_OF_QUESTIONS) {
                // Generate random numbers for subtraction operation
                int number1 = (int) (Math.random() * 10);
                int number2 = (int) (Math.random() * 10);

                // Swap the numbers if the first one is smaller than the second one
                if (number1 < number2) {
                    int temp = number1;
                    number1 = number2;
                    number2 = temp;
                }

                // Prompt the user to answer the subtraction question
                System.out.print("What is " + number1 + " - " + number2 + "? ");
                int answer = input.nextInt();

                // Check if the user's answer is correct
                if (number1 - number2 == answer) {
                    System.out.println("You are correct!");
                    correctCount++; // Increment correct count
                } else {
                    // Provide correct answer if the user's answer is wrong
                    System.out.println("Your answer is wrong.\n" + number1 + " - " + number2 + " should be " + (number1 - number2));
                }

                // Increment question count
                count++;

                // Add question and user's answer to the output string
                output += "\n" + number1 + " - " + number2 + " = " + answer + ((number1 - number2 == answer) ? " correct" : " wrong");
            }
        }

        // Record the end time of the test
        long endTime = System.currentTimeMillis();

        // Calculate the test time in seconds
        long testTime = (endTime - startTime) / 1000;

        // Print the test results
        System.out.println("Correct count is " + correctCount +
                "\nTest time is " + testTime + " seconds\n" + output);
    }
}

/*
Explanation:
- This program generates random subtraction questions and prompts the user to answer them.
- The user is asked to solve a specified number of subtraction questions (5 in this case).
- For each question, two random numbers between 0 and 9 are generated as operands.
- The program ensures that the first number is greater than or equal to the second number to avoid negative results.
- The user's answer is compared with the correct result, and feedback is provided.
- The program keeps track of the number of correct answers and the total time taken for the test.
- After all questions are answered, the program displays the user's score and the time taken.
- This program demonstrates the use of loops, random number generation, user input, and string manipulation in Java.
*/
