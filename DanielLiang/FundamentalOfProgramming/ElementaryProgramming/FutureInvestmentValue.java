package DanielLiang.FundamentalOfProgramming.ElementaryProgramming;

import java.util.Scanner;

public class FutureInvestmentValue {

    public static void main(String[] args) {
        try (Scanner input = new Scanner(System.in)) {

            // user prompt
            System.out.print("What is Your Investment Amount: ");
            double investmentAmount = input.nextDouble();

            System.out.print("Enter Annual Interest Rate in percentage: ");
            double annualInterestRate = input.nextDouble() / 100;

            System.out.print("Enter Time You will invest in years: ");
            double numberOfYears = input.nextDouble();

            // Calculate future investment value
            double futureInvestmentValue = investmentAmount * Math.pow(1 + annualInterestRate, numberOfYears);

            // Display the future investment value
            System.out.printf("Accumulated value is $%.2f", futureInvestmentValue);

        }catch (Exception e) {
            System.out.println("an error occurred. " + e);
        }
    }
}
