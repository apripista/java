package DanielLiang.FundamentalOfProgramming.Selections;

import java.util.Scanner;

public class AdditionQuiz {
    public static void main(String[] args) {
        // generate three random numbers
        int number1 = (int)(System.currentTimeMillis() % 10);
        int number2 = (int)(System.currentTimeMillis() / 7 % 10);
        int number3 = (int)(System.currentTimeMillis() / 11 % 10);

        try (// Scanner
        Scanner input = new Scanner(System.in)) {
            // show question
            System.out.print("What is " + number1 + " + " + number2 + " + " + number3 + "? ");

            // get user input
            int answer = input.nextInt();

            // Calculate the correct answer
            int correctAnswer = number1 + number2 + number3;

            // Display result
            System.out.println(number1 + " + " + number2 + " + " + number3 + " = " + answer + " is " +
                (correctAnswer == answer));
        }catch (Exception e) {
            System.err.println("An error Occurred" + e);
        }
    }
}
