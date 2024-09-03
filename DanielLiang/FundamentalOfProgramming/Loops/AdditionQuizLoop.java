import java.util.Scanner;

public class AdditionQuizLoop {
    public static void main(String[] args) {
        final int NUMBER_OF_QUESTIONS = 10;
        int correctCount = 0;
        int count = 0;
        long startTime = System.currentTimeMillis();
        String output = "";
        Scanner input = new Scanner(System.in);

         // Loop for ten questions
        while (count < NUMBER_OF_QUESTIONS) {
            // 1. Generate two random single-digit
            // integers for addition between 1 and 15
            int number1 = (int)(Math.random() * 15) + 1;
            int number2 = (int)(Math.random() * 15) + 1;

            // 2. Prompt the student to answer "What is number1 + number2?"
            System.out.print("What is " + number1 + " + " + number2 + "? ");
            int answer = input.nextInt();

            // 3. Grade the answer and display the result
            if (number1 + number2 == answer) {
                System.out.println("You are correct!");
                correctCount++; // Increase the correct answer count
            } else {
                System.out.println("Your answer is wrong.\n" + number1
                        + " + " + number2 + " should be " + (number1 + number2));
            }

            // increase the question count
            count++;

            // Append the question and answer to the output string
            output += "\n" + number1 + " + " + number2 + " = " + answer +
                    ((number1 + number2 == answer) ? " correct" : " wrong");
        }

        long endTime = System.currentTimeMillis(); // Get end time
        long testTime = endTime - startTime; // Calculate test time

        // Display result
        System.out.println("Correct count is " + correctCount +
                "\nTest time is " + testTime / 1000 + " seconds\n" + output);
    }
}
