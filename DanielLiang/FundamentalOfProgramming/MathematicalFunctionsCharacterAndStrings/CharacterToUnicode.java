package DanielLiang.FundamentalOfProgramming.MathematicalFunctionsCharacterAndStrings;

import java.util.Scanner;

public class CharacterToUnicode {
    public static void main(String[] args) {
        // Create a Scanner to receive input from the user
        Scanner input = new Scanner(System.in);

        // Prompt the user to enter a character
        System.out.print("Enter a character: ");
        char character = input.next().charAt(0);

        // Convert the character to its corresponding Unicode (ASCII) value
        int unicode = (int) character;

        // Display the result
        System.out.println("The Unicode for the character " + character + " is " + unicode);

        input.close();
    }
}
