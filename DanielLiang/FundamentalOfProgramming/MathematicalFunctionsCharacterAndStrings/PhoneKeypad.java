package DanielLiang.FundamentalOfProgramming.MathematicalFunctionsCharacterAndStrings;

import java.util.Scanner;

public class PhoneKeypad {
    public static void main(String[] args) {
        // Create a Scanner to receive input from the user
        Scanner input = new Scanner(System.in);

        // Prompt the user to enter a letter
        System.out.print("Enter a letter: ");
        char letter = input.next().toUpperCase().charAt(0);

        // Determine the corresponding number
        int number;
        if (letter >= 'A' && letter <= 'C') {
            number = 2;
        } else if (letter >= 'D' && letter <= 'F') {
            number = 3;
        } else if (letter >= 'G' && letter <= 'I') {
            number = 4;
        } else if (letter >= 'J' && letter <= 'L') {
            number = 5;
        } else if (letter >= 'M' && letter <= 'O') {
            number = 6;
        } else if (letter >= 'P' && letter <= 'S') {
            number = 7;
        } else if (letter >= 'T' && letter <= 'V') {
            number = 8;
        } else if (letter >= 'W' && letter <= 'Z') {
            number = 9;
        } else {
            System.out.println(letter + " is an invalid input");
            input.close();
            return;
        }

        // Display the corresponding number
        System.out.println("The corresponding number is " + number);

        input.close();
    }
}
