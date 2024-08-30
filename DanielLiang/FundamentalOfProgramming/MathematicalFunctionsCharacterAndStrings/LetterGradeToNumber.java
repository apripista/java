package DanielLiang.FundamentalOfProgramming.MathematicalFunctionsCharacterAndStrings;

import java.util.Scanner;

public class LetterGradeToNumber {
    public static void main(String[] args) {
        // Create a Scanner to receive input from the user
        Scanner input = new Scanner(System.in);

        // Prompt the user to enter a letter grade
        System.out.print("Enter a letter grade: ");
        char grade = input.next().toUpperCase().charAt(0);

        // Convert the letter grade to its corresponding numeric value
        switch (grade) {
            case 'A':
                System.out.println("The numeric value for grade A is 4");
                break;
            case 'B':
                System.out.println("The numeric value for grade B is 3");
                break;
            case 'C':
                System.out.println("The numeric value for grade C is 2");
                break;
            case 'D':
                System.out.println("The numeric value for grade D is 1");
                break;
            case 'F':
                System.out.println("The numeric value for grade F is 0");
                break;
            default:
                System.out.println(grade + " is an invalid grade");
        }

        input.close();
    }
}
