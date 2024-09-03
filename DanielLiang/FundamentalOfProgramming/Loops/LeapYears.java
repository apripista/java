public class LeapYears {
    public static void main(String[] args) {
        final int START_YEAR = 101;
        final int END_YEAR = 2100;
        final int LEAP_YEARS_PER_LINE = 10;
        int count = 0;

        // leap years between 101 and 2100
        System.out.println("Leap year between 100 and 2100\n");
        for (int year = START_YEAR; year <= END_YEAR; year++) {
            if (isLeapYear(year)) {
                count++;
                System.out.print(year + " ");
                // Print a new line after every 10 leap years
                if (count % LEAP_YEARS_PER_LINE == 0) {
                    System.out.println();
                }
            }
        }

        // Display the total number of leap years
        System.out.println("\nTotal number of leap years: " + count);
    }

    // Method to check if a year is a leap year
    public static boolean isLeapYear(int year) {
        return (year % 4 == 0 && year % 100 != 0) || (year % 400 == 0);
    }
}
