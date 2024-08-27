package DanielLiang.FundamentalOfProgramming.ElementaryProgramming;

import java.util.Scanner;

public class CalculateInterest {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // enter the balance and interest rate
        System.out.print("Enter balance and interest rate (e.g., 3 for 3%): ");
        double balance = input.nextDouble();
        double annualInterestRate = input.nextDouble();

        // Close the Scanner object to avoid resource leak
        input.close();

        // Calculate the interest for the next month
        double interest = balance * (annualInterestRate / 1200);

        // Display the calculated interest
        System.out.println("The interest is " + interest);
    }
}
