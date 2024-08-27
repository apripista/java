package DanielLiang.FundamentalOfProgramming.ElementaryProgramming;

import java.util.Scanner;

public class ShowCurrentTimeGMT {
    public static void main(String[] args) {
        try (Scanner input = new Scanner(System.in)) {
            // enter the time zone offset to GMT
            System.out.print("Enter the time zone offset to GMT: ");
            int offset = input.nextInt();

            //  the total milliseconds since midnight, Jan 1, 1970
            long totalMilliseconds = System.currentTimeMillis();

            // the total seconds since midnight, Jan 1, 1970
            long totalSeconds = totalMilliseconds / 1000;

            // compute the current second in the minute in the hour
            long currentSecond = totalSeconds % 60;

            // the total minutes
            long totalMinutes = totalSeconds / 60;
            // compute the current minute in the hour
            long currentMinute = totalMinutes % 60;

            // the total hours
            long totalHours = totalMinutes / 60;

            // compute the current hour
            long currentHour = (totalHours + offset) % 24;

            // results
            System.out.println("The current time is " + currentHour + ":" + currentMinute + ":" + currentSecond);
        
        }catch (Exception e) {
            System.out.println("an error occurred" + e);
        }
    }
}
