package DanielLiang.FundamentalOfProgramming.Selections;

import java.util.Scanner;

public class FutureDates {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // prompt for today's day
        System.out.print("Enter today's day (Sunday is 0, Monday is 1, ..., Saturday is 6): ");
        int today = input.nextInt();

        // prompt for the number of days elapsed
        System.out.print("Enter the number of days elapsed since today: ");
        int elapsedDays = input.nextInt();

        // calculate future day
        int futureDay = (today + elapsedDays) % 7;

        // display result for today's day
        System.out.print("Today is ");
        if (today == 0)
            System.out.print("Sunday");
        else if (today == 1)
            System.out.print("Monday");
        else if (today == 2)
            System.out.print("Tuesday");
        else if (today == 3)
            System.out.print("Wednesday");
        else if (today == 4)
            System.out.print("Thursday");
        else if (today == 5)
            System.out.print("Friday");
        else
            System.out.print("Saturday");

        // display result for future day
        System.out.print(" and the future day is ");
        if (futureDay == 0)
            System.out.println("Sunday");
        else if (futureDay == 1)
            System.out.println("Monday");
        else if (futureDay == 2)
            System.out.println("Tuesday");
        else if (futureDay == 3)
            System.out.println("Wednesday");
        else if (futureDay == 4)
            System.out.println("Thursday");
        else if (futureDay == 5)
            System.out.println("Friday");
        else
            System.out.println("Saturday");

        input.close();
    }
}
