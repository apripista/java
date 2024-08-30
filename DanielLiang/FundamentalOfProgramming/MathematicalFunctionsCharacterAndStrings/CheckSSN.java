package DanielLiang.FundamentalOfProgramming.MathematicalFunctionsCharacterAndStrings;

import java.util.Scanner;
import java.util.regex.Pattern;

public class CheckSSN {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Prompt the user to enter a Social Security Number
        System.out.print("Enter a SSN: ");
        String ssn = input.nextLine();

        // Regular expression for the SSN format
        String regex = "\\d{3}-\\d{2}-\\d{4}";
        
        // Check if the input matches the SSN format
        if (Pattern.matches(regex, ssn)) {
            System.out.println(ssn + " is a valid social security number");
        } else {
            System.out.println(ssn + " is an invalid social security number");
        }

        input.close();
    }
}
