package DanielLiang.FundamentalOfProgramming.MathematicalFunctionsCharacterAndStrings;

import java.util.Scanner;
import java.time.YearMonth;

public class DaysOfMonths {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Prompt user to enter a year
        System.out.print("Enter a year: ");
        int year = input.nextInt();
        input.nextLine();  // Consume newline

        // Prompt user to enter the first three letters of a month name
        System.out.print("Enter a month: ");
        String month = input.nextLine();

        // Convert month abbreviation to full month name and determine number of days
        int days = getDaysInMonth(year, month);

        if (days > 0) {
            System.out.println(month + " " + year + " has " + days + " days");
        } else {
            System.out.println("Invalid month input.");
        }

        input.close();
    }

    public static int getDaysInMonth(int year, String month) {
        switch (month) {
            case "Jan": return YearMonth.of(year, 1).lengthOfMonth();
            case "Feb": return YearMonth.of(year, 2).lengthOfMonth();
            case "Mar": return YearMonth.of(year, 3).lengthOfMonth();
            case "Apr": return YearMonth.of(year, 4).lengthOfMonth();
            case "May": return YearMonth.of(year, 5).lengthOfMonth();
            case "Jun": return YearMonth.of(year, 6).lengthOfMonth();
            case "Jul": return YearMonth.of(year, 7).lengthOfMonth();
            case "Aug": return YearMonth.of(year, 8).lengthOfMonth();
            case "Sep": return YearMonth.of(year, 9).lengthOfMonth();
            case "Oct": return YearMonth.of(year, 10).lengthOfMonth();
            case "Nov": return YearMonth.of(year, 11).lengthOfMonth();
            case "Dec": return YearMonth.of(year, 12).lengthOfMonth();
            default: return -1;  // Invalid month
        }
    }
}
