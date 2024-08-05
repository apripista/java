import java.util.Scanner;
import java.util.InputMismatchException;

public class Calendar {

    @SuppressWarnings("resource")
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        while (true) {
            int year = 0;
            int month = 0;

            try {
                System.out.print("Enter Full Year (e.g., 2021): ");
                year = input.nextInt();

                System.out.print("Enter a Month as a number between 1 and 12: ");
                month = input.nextInt();
            } catch (InputMismatchException e) {
                System.out.println("Invalid input. Please enter a valid integer.");
                return; // Quit the program
            }

            printMonth(year, month);

            System.out.print("Press 'Q' to quit or any other key to continue: ");
            String choice = input.next().toUpperCase();

            if (choice.equals("Q")) {
                System.out.println("Program terminated.");
                break; // Exit the loop and terminate the program
            }
        }
    }

    public static void printMonth(int year, int month) {
        printMonthTitle(year, month);
        printMonthBody(year, month);
    }

    public static void printMonthTitle(int year, int month) {
        System.out.println("         " + getMonthName(month) + " " + year);
        System.out.println("-----------------------------");
        System.out.println(" Sun Mon Tue Wed Thu Fri Sat");
    }

    public static String getMonthName(int month) {
        String monthName = "";
        switch (month) {
            case 1:
                monthName = "January";
                break;
            case 2:
                monthName = "February";
                break;
            case 3:
                monthName = "March";
                break;
            case 4:
                monthName = "April";
                break;
            case 5:
                monthName = "May";
                break;
            case 6:
                monthName = "June";
                break;
            case 7:
                monthName = "July";
                break;
            case 8:
                monthName = "August";
                break;
            case 9:
                monthName = "September";
                break;
            case 10:
                monthName = "October";
                break;
            case 11:
                monthName = "November";
                break;
            case 12:
                monthName = "December";
                break;
            default:
                monthName = "Invalid month";
                break;
        }
        return monthName;
    }

    public static void printMonthBody(int year, int month) {
        int startDay = getStartDay(year, month);
        int numberOfDaysInMonth = getNumberOfDaysInMonth(year, month);

        for (int i = 0; i < startDay; i++) {
            System.out.print("    ");
        }

        for (int i = 1; i <= numberOfDaysInMonth; i++) {
            System.out.printf("%4d", i);
            if ((i + startDay) % 7 == 0) {
                System.out.println();
            }
        }

        System.out.println();
    }

    public static int getStartDay(int year, int month) {
        final int START_DAY_JAN_1_1800 = 3;
        int totalNumberOfDays = getTotalNumberOfDays(year, month);
        return (totalNumberOfDays + START_DAY_JAN_1_1800) % 7;
    }

    public static int getTotalNumberOfDays(int year, int month) {
        int total = 0;
        for (int i = 1800; i < year; i++) {
            if (isLeapYear(i)) {
                total += 366;
            } else {
                total += 365;
            }
        }
        for (int i = 1; i < month; i++) {
            total += getNumberOfDaysInMonth(year, i);
        }
        return total;
    }

    public static int getNumberOfDaysInMonth(int year, int month) {
        if (month == 1 || month == 3 || month == 5 || month == 7 || month == 8 || month == 10 || month == 12) {
            return 31;
        }
        if (month == 4 || month == 6 || month == 9 || month == 11) {
            return 30;
        }
        if (month == 2) {
            return isLeapYear(year) ? 29 : 28;
        }
        return 0;
    }

    public static boolean isLeapYear(int year) {
        return year % 400 == 0 || (year % 4 == 0 && year % 100 != 0);
    }
}


/*
 * This program generates a calendar for a specified year and month.
 * It prompts the user to enter the year and month, then prints the calendar layout with days of the specified month.
 * 
 * Functions:
 * - main(): Prompts the user for input and calls the printMonth() method.
 * - printMonth(): Prints the title and body of the calendar for the specified year and month.
 * - printMonthTitle(): Prints the title of the calendar (month and year).
 * - getMonthName(): Returns the name of the month based on its number.
 * - printMonthBody(): Prints the days of the month in the calendar.
 * - getStartDay(): Calculates the starting day of the month.
 * - getTotalNumberOfDays(): Calculates the total number of days from 1800 to the specified month and year.
 * - getNumberOfDaysInMonth(): Returns the number of days in the specified month.
 * - isLeapYear(): Checks if a year is a leap year.
 * 
 * The input process is wrapped in a loop to allow the user to continue entering new year and month values until 'Q' is entered to quit the program.
 */
