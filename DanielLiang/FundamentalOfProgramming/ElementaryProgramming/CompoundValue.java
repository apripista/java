package DanielLiang.FundamentalOfProgramming.ElementaryProgramming;

import java.util.Scanner;

public class CompoundValue {

    public static void main(String[] args) {
        try (Scanner input = new Scanner(System.in)) {
            System.out.print("Enter the monthly saving amount: ");
            double monthlySavingAmount = input.nextDouble();

            // Monthly interest rate
            double monthlyInterestRate = 0.05 / 12;

            // Calculate the account value after each month
            double month1 = monthlySavingAmount * (1 + monthlyInterestRate);
            double month2 = (monthlySavingAmount + month1) * (1 + monthlyInterestRate);
            double month3 = (monthlySavingAmount + month2) * (1 + monthlyInterestRate);
            double month4 = (monthlySavingAmount + month3) * (1 + monthlyInterestRate);
            double month5 = (monthlySavingAmount + month4) * (1 + monthlyInterestRate);
            double month6 = (monthlySavingAmount + month5) * (1 + monthlyInterestRate);

            // Display the account value after the sixth months
            System.out.println("After the sixth month, the account value is $" + month6);
        
        } catch (Exception e) {
            System.out.println("an error occurred" + e);
        }
    }
}
