package DanielLiang.FundamentalOfProgramming.Selections;

import java.util.Scanner;

public class ComputeTax {
    public static void main(String[] args) {
        try (Scanner input = new Scanner(System.in)) {
            // user prompt to enter filing status
            System.out.print("(0-single filer, 1-married jointly or " +
                    "qualifying widow(er), 2-married separately, 3-head of " +
                    "household) Enter the filing status: ");
            int status = input.nextInt(); // Input status

            // user prompt to enter taxable income
            System.out.print("Enter the taxable income: ");
            double income = input.nextDouble(); // Input income

            // Compute tax
            double tax = 0; // Compute tax
            if (status == 0) { // compute tax for single filers
                if (income <= 8350)
                    tax = income * 0.10;
                else if (income <= 33950)
                    tax = 8350 * 0.10 + (income - 8350) * 0.15;
                else if (income <= 82250)
                    tax = 8350 * 0.10 + (33950 - 8350) * 0.15 + (income - 33950) * 0.25;
                else if (income <= 171550)
                    tax = 8350 * 0.10 + (33950 - 8350) * 0.15 + (82250 - 33950) * 0.25 + (income - 82250) * 0.28;
                else if (income <= 372950)
                    tax = 8350 * 0.10 + (33950 - 8350) * 0.15 + (82250 - 33950) * 0.25 +
                            (171550 - 82250) * 0.28 + (income - 171550) * 0.33;
                else
                    tax = 8350 * 0.10 + (33950 - 8350) * 0.15 + (82250 - 33950) * 0.25 +
                            (171550 - 82250) * 0.28 + (372950 - 171550) * 0.33 + (income - 372950) * 0.35;
            } else if (status == 1) { // Compute tax for married jointly or qualifying widow(er)
                if (income <= 16700)
                    tax = income * 0.10;
                else if (income <= 67900)
                    tax = 16700 * 0.10 + (income - 16700) * 0.15;
                else if (income <= 137050)
                    tax = 16700 * 0.10 + (67900 - 16700) * 0.15 + (income - 67900) * 0.25;
                else if (income <= 208850)
                    tax = 16700 * 0.10 + (67900 - 16700) * 0.15 + (137050 - 67900) * 0.25 + (income - 137050) * 0.28;
                else if (income <= 372950)
                    tax = 16700 * 0.10 + (67900 - 16700) * 0.15 + (137050 - 67900) * 0.25 +
                            (208850 - 137050) * 0.28 + (income - 208850) * 0.33;
                else
                    tax = 16700 * 0.10 + (67900 - 16700) * 0.15 + (137050 - 67900) * 0.25 +
                            (208850 - 137050) * 0.28 + (372950 - 208850) * 0.33 + (income - 372950) * 0.35;
            } else if (status == 2) { // Compute tax for married separately
                
                // Left as an exercise
                System.out.println("Tax computation for married separately is left as an exercise.");
            } else if (status == 3) { // Compute tax for head of household
                
                // left as an exercise
                System.out.println("Tax computation for head of household is left as an exercise.");
            } else { // Invalid status
                System.out.println("Error: invalid status");
                System.exit(1);
            }

            // display the result
            System.out.println("Tax is " + (int)(tax * 100) / 100.0);
        
        }catch (Exception e) {
            System.err.println("An error Occurred" + e);
        }
    }
}
