package DanielLiang.FundamentalOfProgramming.ElementaryProgramming;

import java.util.Scanner;

public class TipsCalculator {

    public static void main(String[] args) {
        try (Scanner input = new Scanner(System.in)) {

            // user prompts
            System.out.print("Enter a subtotal: ");
            double subtotal = input.nextDouble();

            System.out.print("Enter a gratuity rate: ");
            double gratuity_rate = input.nextDouble();

            // calculations
            double gratuity = subtotal * (gratuity_rate / 100);
            double total = gratuity + subtotal;

            System.out.println("The gratuity is: " + gratuity + " and total is: " + total);
        
        } catch (Exception e) {
            System.out.println("an error occurred" + e);
        } 
    }
}