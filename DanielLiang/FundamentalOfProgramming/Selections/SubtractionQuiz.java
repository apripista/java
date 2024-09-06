package DanielLiang.FundamentalOfProgramming.Selections;

import java.util.Scanner;

public class SubtractionQuiz {
    public static void main(String[] args) {
        // generate two random integers less than 100
        int number1 = (int)(Math.random() * 100);
        int number2 = (int)(Math.random() * 100);

        // student prompt to answer "What is number1 + number2?"
        System.out.print("What is " + number1 + " + " + number2 + "? ");
        try (Scanner input = new Scanner(System.in)) {
            int answer = input.nextInt();

            // grade the answer and display the result
            if (number1 + number2 == answer)
                System.out.println("You are correct!");
            else {
                System.out.println("Your answer is wrong.");
                System.out.println(number1 + " + " + number2 + " should be " + (number1 + number2));
            }
        }catch (Exception e) {
            System.err.println("An error Occurred" + e);
        }
    }
}
