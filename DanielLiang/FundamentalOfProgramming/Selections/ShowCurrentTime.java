package DanielLiang.FundamentalOfProgramming.Selections;

import java.util.Scanner;

public class ShowCurrentTime {
    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
            // prompt the user to enter the time zone offset to GMT
            System.out.print("Enter the time zone offset to GMT: ");
            int timeZoneOffset = scanner.nextInt();

            // obtain the total milliseconds since midnight, Jan 1, 1970
            long totalMilliseconds = System.currentTimeMillis();

            // obtain the total seconds since midnight, Jan 1, 1970
            long totalSeconds = totalMilliseconds / 1000;

            // compute the current second in the minute in the hour
            long currentSecond = totalSeconds % 60;

            // obtain the total minutes
            long totalMinutes = totalSeconds / 60;

            // compute the current minute in the hour
            long currentMinute = totalMinutes % 60;

            // obtain the total hours
            long totalHours = totalMinutes / 60;

            // compute the current hour
            long currentHour = (totalHours + timeZoneOffset) % 24;

            // determine if it's AM or PM
            String am_pm = (currentHour < 12) ? "AM" : "PM";

            // convert to 12-hour format
            currentHour = currentHour % 12;
            if (currentHour == 0) {
                currentHour = 12; // 12 AM or 12 PM
            }

            // display the current time in the specified time zone
            System.out.println("The current time is " + currentHour + ":" + currentMinute + ":" + currentSecond + " " + am_pm);
        
        }catch (Exception e) {
            System.err.println("An error Occurred" + e);
        }
    }
}
