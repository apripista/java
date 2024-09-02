package DanielLiang.FundamentalOfProgramming.MathematicalFunctionsCharacterAndStrings;

import java.util.Scanner;

public class Payroll {

    public static void main(String[] args) {
        try (Scanner input = new Scanner(System.in)) {
            // Input
            System.out.print("Enter employee's name: ");
            String name = input.nextLine();

            System.out.print("Enter number of hours worked in a week: ");
            double hoursPerWeek = input.nextDouble();

            System.out.print("Enter hourly pay rate: ");
            double payRate = input.nextDouble();

            System.out.print("Enter federal tax withholding rate: ");
            double federalTaxRate = input.nextDouble();

            System.out.print("Enter state tax withholding rate: ");
            double stateTaxRate = input.nextDouble();

            // Calculations
            double grossPay = hoursPerWeek * payRate;
            double federalWithholding = grossPay * federalTaxRate;
            double stateWithholding = grossPay * stateTaxRate;
            double totalDeductions = federalWithholding + stateWithholding;
            double netPay = grossPay - totalDeductions;

            // Output
            System.out.println("\nEmployee Name: " + name);
            System.out.println("Hours Worked: " + hoursPerWeek);
            System.out.printf("Pay Rate: $%.2f\n", payRate);
            System.out.printf("Gross Pay: $%.2f\n", grossPay);

            System.out.println("Deductions:");
            System.out.printf("\tFederal Withholding (%.2f%%): $%.2f\n", federalTaxRate * 100, federalWithholding);
            System.out.printf("\tState Withholding (%.2f%%): $%.2f\n", stateTaxRate * 100, stateWithholding);
            System.out.printf("\tTotal Deduction: $%.2f\n", totalDeductions);

            System.out.printf("Net Pay: $%.2f\n", netPay);
        } catch (Exception e) {
            System.err.println("Bad Input, " + e);
        }
    }
}
