package DanielLiang.FundamentalOfProgramming.ElementaryProgramming;

import java.util.Scanner;

public class ComputeChange {
    public static void main(String[] args) {
        try (// Create a Scanner
        Scanner input = new Scanner(System.in)) {
            // Receive the amount as an integer
            // with the last two digits representing cents
            System.out.print("Enter an amount as an integer, for example 1156 for 11 dollars and 56 cents: ");
            int amount = input.nextInt();

            // Find the number of one dollars
            int numberOfOneDollars = amount / 100;
            int remainingAmount = amount % 100;
            
            // Find the number of quarters in the remaining amount
            int numberOfQuarters = remainingAmount / 25;
            remainingAmount %= 25;
            
            // Find the number of dimes in the remaining amount
            int numberOfDimes = remainingAmount / 10;
            remainingAmount %= 10;
            
            // Find the number of nickels in the remaining amount
            int numberOfNickels = remainingAmount / 5;
            remainingAmount %= 5;
            
            // Find the number of pennies in the remaining amount
            int numberOfPennies = remainingAmount;
            
            // Display results
            System.out.println("Your amount " + (double)amount / 100 + " consists of");
            System.out.println(numberOfOneDollars + " dollars");
            System.out.println(numberOfQuarters + " quarters ");
            System.out.println(numberOfDimes + " dimes");
            System.out.println(numberOfNickels + " nickels");
            System.out.println(numberOfPennies + " pennies");
        
        } catch (Exception e) {
            System.out.println("an error occurred" + e);
        }
    }
}
