import java.util.Scanner;

public class DayOfWeekCalculator {

    public static void main(String[] args) {
        try (Scanner input = new Scanner(System.in)) {
            System.out.print("Enter year (e.g., 2012): ");
            int year = input.nextInt();

            System.out.print("Enter month (1-12): ");
            int month = input.nextInt();

            int maxDaysInMonth;
            switch (month) {
                case 2: // February
                    maxDaysInMonth = isLeapYear(year) ? 29 : 28;
                    break;
                case 4: case 6: case 9: case 11: // April, June, September, November
                    maxDaysInMonth = 30;
                    break;
                default: // January, March, May, July, August, October, December
                    maxDaysInMonth = 31;
                    break;
            }

            System.out.print("Enter day of the month (1-" + maxDaysInMonth + "): ");
            int day = input.nextInt();

            if (day < 1 || day > maxDaysInMonth) {
                System.out.println("Invalid day for the given month.");
                return;
            }

            int q = day;
            int m = month;
            int j = year / 100;
            int k = year % 100;

            if (month == 1 || month == 2) {
                m += 12;
                j -= 1;
            }

            int h = (q + (26 * (m + 1)) / 10 + k + k / 4 + j / 4 + 5 * j) % 7;

            String[] daysOfWeek = {"Saturday", "Sunday", "Monday", "Tuesday", "Wednesday", "Thursday", "Friday"};

            System.out.println("Day of the week is " + daysOfWeek[h]);
        }
    }

    // Method to check if a year is a leap year
    public static boolean isLeapYear(int year) {
        return (year % 4 == 0 && year % 100 != 0) || (year % 400 == 0);
    }
}


/*
    We begin by importing the Scanner class from the java.util package to enable user input.

    Inside the main method, we prompt the user to enter the year, month, and day of the month.

    We use a switch statement to determine the maximum number of days in the entered month. For months with varying lengths (February, April, June, September, and November), we calculate the maximum number of days accordingly. For February, we also check for leap years.

    We then prompt the user to enter the day of the month, ensuring that it falls within the valid range for the entered month.

    If the entered day is not valid, we display an error message and exit the program.

    If the day is valid, we proceed with the calculation using Zeller's Congruence algorithm.

    In Zeller's Congruence, we calculate the values of q, m, j, and k based on the user's input for year, month, and day.

    We adjust the month and year values as per the algorithm's requirements. For January and February, we treat them as months 13 and 14 of the previous year.

    Using the calculated values, we compute the day of the week (h) according to Zeller's formula.

    Finally, we display the name of the day of the week corresponding to the calculated value of h.

This program effectively calculates the day of the week for a given date using Zeller's Congruence algorithm, 
ensuring that the user's input for the year, month, and day of the month is validated appropriately.

*/