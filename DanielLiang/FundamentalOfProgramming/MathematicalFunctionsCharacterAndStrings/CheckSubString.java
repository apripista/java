package DanielLiang.FundamentalOfProgramming.MathematicalFunctionsCharacterAndStrings;

import java.util.Scanner;

public class CheckSubString {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Prompt user to enter the first string
        System.out.print("Enter the first string: ");
        String intial_string = input.nextLine();

        // Prompt user to enter the second string
        System.out.print("Enter the second string: ");
        String final_string = input.nextLine();

        // Check if s2 is a substring of s1
        if (intial_string.contains(final_string)) {
            System.out.println(final_string+ " is a substring of " + intial_string);
        } else {
            System.out.println(final_string+ " is not a substring of " + intial_string);
        }

        input.close();
    }
}
