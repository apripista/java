package DanielLiang.FundamentalOfProgramming.MathematicalFunctionsCharacterAndStrings;

import java.util.Scanner;

public class ASCIItoCharacter {
    public static void main(String[] args) {
        // Create a Scanner to receive input from the user
        Scanner input = new Scanner(System.in);

        // Prompt the user to enter an ASCII code
        System.out.print("Enter an ASCII code (0 - 127): ");
        int asciiCode = input.nextInt();

        // Check if the ASCII code is within the valid range
        if (asciiCode >= 0 && asciiCode <= 127) {
            // Convert the ASCII code to its corresponding character
            char character = (char) asciiCode;
            // Display the result
            System.out.println("The character for ASCII code " + asciiCode + " is " + character);
        } else {
            // If the input is out of range, display an error message
            System.out.println("Invalid ASCII code. Please enter a number between 0 and 127.");
        }

        input.close();
    }
}
