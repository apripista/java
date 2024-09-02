package DanielLiang.FundamentalOfProgramming.MathematicalFunctionsCharacterAndStrings;

import java.util.Scanner;

public class ProcessStrings {

    public static void main(String[] args) {
        try (Scanner input = new Scanner(System.in)){

            System.out.print("Enter a String: ");
            String message = input.nextLine();

            System.out.println("Length of the string is: " + message.length());

            char character = message.charAt(0);
            System.out.println("First Letter of the String is: " + character);
            
        } catch (Exception e) {
            System.out.println("Input MissMatch, Thansk");
        }
    }
}