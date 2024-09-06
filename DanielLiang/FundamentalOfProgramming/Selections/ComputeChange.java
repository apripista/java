package DanielLiang.FundamentalOfProgramming.Selections;

import java.util.Scanner;

public class ComputeChange {
    public static void main(String[] args) {
        try (Scanner input = new Scanner(System.in)) {
            // receive the amount
            System.out.print("Enter an amount in double, for example 11.56: ");
            double amount = input.nextDouble();

            int remainingAmount = (int)(amount * 100);

            // find the number of one dollars
            int numberOfOneDollars = remainingAmount / 100;
            remainingAmount = remainingAmount % 100;

            // find the number of quarters in the remaining amount
            int numberOfQuarters = remainingAmount / 25;
            remainingAmount = remainingAmount % 25;

            // find the number of dimes in the remaining amount
            int numberOfDimes = remainingAmount / 10;
            remainingAmount = remainingAmount % 10;

            // find the number of nickels in the remaining amount
            int numberOfNickels = remainingAmount / 5;
            remainingAmount = remainingAmount % 5;

            // find the number of pennies in the remaining amount
            int numberOfPennies = remainingAmount;

            // display results for nonzero denominations
            System.out.println("Your amount " + amount + " consists of:");

            if (numberOfOneDollars != 0)
                System.out.println(numberOfOneDollars + (numberOfOneDollars == 1 ? " dollar" : " dollars"));

            if (numberOfQuarters != 0)
                System.out.println(numberOfQuarters + (numberOfQuarters == 1 ? " quarter" : " quarters"));

            if (numberOfDimes != 0)
                System.out.println(numberOfDimes + (numberOfDimes == 1 ? " dime" : " dimes"));

            if (numberOfNickels != 0)
                System.out.println(numberOfNickels + (numberOfNickels == 1 ? " nickel" : " nickels"));

            if (numberOfPennies != 0)
                System.out.println(numberOfPennies + (numberOfPennies == 1 ? " penny" : " pennies"));
       
        }catch (Exception e) {
            System.err.println("An error Occurred" + e);
        }
    }
}
