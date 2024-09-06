package DanielLiang.FundamentalOfProgramming.Selections;

import java.util.Scanner;

public class DaysInMonth {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // user prompt to enter the month (1 - 12)
        System.out.print("Enter the month (1 - 12): ");
        int month = input.nextInt();

        // user prompt to enter the year
        System.out.print("Enter the year: ");
        int year = input.nextInt();

        // user prompt to enter a day
        System.out.print("Enter a day: ");
        int day = input.nextInt();

        int days_in_month;

        // determine the number of days in the entered month
        switch (month) {
            case 1:
                System.out.print("January ");
                days_in_month = 31;
                break;
            case 2:
                System.out.print("February ");
                // check for leap year
                if ((year % 4 == 0 && year % 100 != 0) || (year % 400 == 0)) {
                    days_in_month = 29;
                } else {
                    days_in_month = 28;
                }
                break;
            case 3:
                System.out.print("March ");
                days_in_month = 31;
                break;
            case 4:
                System.out.print("April ");
                days_in_month = 30;
                break;
            case 5:
                System.out.print("May ");
                days_in_month = 31;
                break;
            case 6:
                System.out.print("June ");
                days_in_month = 30;
                break;
            case 7:
                System.out.print("July ");
                days_in_month = 31;
                break;
            case 8:
                System.out.print("August ");
                days_in_month = 31;
                break;
            case 9:
                System.out.print("September ");
                days_in_month = 30;
                break;
            case 10:
                System.out.print("October ");
                days_in_month = 31;
                break;
            case 11:
                System.out.print("November ");
                days_in_month = 30;
                break;
            case 12:
                System.out.print("December ");
                days_in_month = 31;
                break;
            default:
                System.out.println("Invalid month entered.");
                days_in_month = -1; // Invalid month
                break;
        }

        // display the number of days in 
        // the entered month, day, and year
        if (days_in_month != -1) {
            System.out.println(day + ", " + year + " had " + days_in_month + " days.");
        }

        input.close();
    }
}
