package DanielLiang.FundamentalOfProgramming.MathematicalFunctionsCharacterAndStrings;

import java.util.Scanner;

public class ComputeChange {

    public static void main(String[] args) {
        // Create a Scanner
        Scanner input = new Scanner(System.in);

        // Receive the amount as a string
        System.out.print("Enter an amount in double, for example 11.56: ");
        String amountString = input.nextLine();

        // Extract the dollar amount and cents from the string
        int indexOfDecimal = amountString.indexOf('.');
        String dollarsString = amountString.substring(0, indexOfDecimal);
        String centsString = amountString.substring(indexOfDecimal + 1);

        // Convert dollars and cents to integer values
        int dollars = Integer.parseInt(dollarsString);
        int cents = Integer.parseInt(centsString);

        // Calculate the total amount in cents
        int remainingAmount = dollars * 100 + cents;

        // Find the number of one dollars
        int numberOfOneDollars = remainingAmount / 100;
        remainingAmount = remainingAmount % 100;

        // Find the number of quarters in the remaining amount
        int numberOfQuarters = remainingAmount / 25;
        remainingAmount = remainingAmount % 25;

        // Find the number of dimes in the remaining amount
        int numberOfDimes = remainingAmount / 10;
        remainingAmount = remainingAmount % 10;

        // Find the number of nickels in the remaining amount
        int numberOfNickels = remainingAmount / 5;
        remainingAmount = remainingAmount % 5;

        // Find the number of pennies in the remaining amount
        int numberOfPennies = remainingAmount;

        // Display results
        System.out.println("Your amount " + amountString + " consists of");
        System.out.println(numberOfOneDollars + " dollars");
        System.out.println(numberOfQuarters + " quarters");
        System.out.println(numberOfDimes + " dimes");
        System.out.println(numberOfNickels + " nickels");
        System.out.println(numberOfPennies + " pennies");

        input.close();
    }
}
