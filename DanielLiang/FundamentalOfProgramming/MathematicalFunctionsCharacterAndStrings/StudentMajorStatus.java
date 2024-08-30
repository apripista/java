package DanielLiang.FundamentalOfProgramming.MathematicalFunctionsCharacterAndStrings;

import java.util.Scanner;

public class StudentMajorStatus {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Prompt the user to enter two characters
        System.out.print("Enter two characters: ");
        String inputString = input.nextLine();

        // Ensure the input is exactly two characters long
        if (inputString.length() != 2) {
            System.out.println("Invalid input");
            return;
        }

        char major = inputString.charAt(0);
        char status = inputString.charAt(1);

        // Determine the major
        String majorName;
        switch (major) {
            case 'M':
                majorName = "Mathematics";
                break;
            case 'C':
                majorName = "Computer Science";
                break;
            case 'I':
                majorName = "Information Technology";
                break;
            default:
                System.out.println("Invalid input");
                return;
        }

        // Determine the status
        String statusName;
        switch (status) {
            case '1':
                statusName = "Freshman";
                break;
            case '2':
                statusName = "Sophomore";
                break;
            case '3':
                statusName = "Junior";
                break;
            case '4':
                statusName = "Senior";
                break;
            default:
                System.out.println("Invalid input");
                return;
        }

        // Display the result
        System.out.println(majorName + " " + statusName);

        input.close();
    }
}
