package DanielLiang.FundamentalOfProgramming.MathematicalFunctionsCharacterAndStrings;

import java.util.Scanner;

public class CheckISBN10 {

    public static void main(String[] args) {
        // Create a Scanner
        Scanner input = new Scanner(System.in);

        // Prompt the user to enter the first 9 digits of an ISBN
        System.out.print("Enter the first 9 digits of an ISBN as a string: ");
        String isbn9 = input.nextLine();

        // Check if the input is exactly 9 digits
        if (isbn9.length() != 9 || !isbn9.matches("\\d+")) {
            System.out.println("Invalid input. Please enter exactly 9 digits.");
            return;
        }

        // Calculate the checksum
        int sum = 0;
        for (int i = 0; i < 9; i++) {
            int digit = Character.getNumericValue(isbn9.charAt(i));
            sum += digit * (i + 1);
        }
        int checksum = sum % 11;

        // Determine the last digit (checksum) of ISBN-10
        String lastDigit;
        if (checksum == 10) {
            lastDigit = "X";
        } else {
            lastDigit = String.valueOf(checksum);
        }

        // Print the full ISBN-10 number
        String isbn10 = isbn9 + lastDigit;
        System.out.println("The ISBN-10 number is " + isbn10);

        input.close();
    }
}
