package DanielLiang.FundamentalOfProgramming.MathematicalFunctionsCharacterAndStrings;

import java.util.Scanner;

public class DecimalToHex {
    public static void main(String[] args) {
        // Create a Scanner to receive input from the user
        Scanner input = new Scanner(System.in);

        // Prompt the user to enter a decimal value
        System.out.print("Enter a decimal value (0 to 15): ");
        int decimal = input.nextInt();

        // Check if the input is within the valid range
        if (decimal >= 0 && decimal <= 15) {
            // Convert the decimal value to its corresponding hex value
            String hex = Integer.toHexString(decimal).toUpperCase();
            // Display the result
            System.out.println("The hex value is " + hex);
        } else {
            // If the input is out of range, display an error message
            System.out.println(decimal + " is an invalid input");
        }

        input.close();
    }
}
