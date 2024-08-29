package DanielLiang.FundamentalOfProgramming.MathematicalFunctionsCharacterAndStrings;

import java.util.Scanner;

public class HexToBinary {
    public static void main(String[] args) {
        // Create a Scanner to receive input from the user
        Scanner input = new Scanner(System.in);

        // Prompt the user to enter a hex digit
        System.out.print("Enter a hex digit: ");
        String hex = input.next().toUpperCase();

        // Validate the hex digit
        if (hex.matches("[0-9A-F]")) {
            // Convert the hex digit to binary
            int decimal = Integer.parseInt(hex, 16);
            String binary = Integer.toBinaryString(decimal);
            // Display the result
            System.out.println("The binary value is " + binary);
        } else {
            // If the input is invalid, display an error message
            System.out.println(hex + " is an invalid input");
        }

        input.close();
    }
}
