package DanielLiang.FundamentalOfProgramming.ElementaryProgramming;

import java.util.Scanner;

public class NumberOfYears {

    public static void main(String[] args) {
        try (Scanner input = new Scanner(System.in)){
            // user prompts
            System.out.print("Enter the number of the minutes: ");
            double minutes = input.nextDouble();

            // calculations
            double year = (int)(minutes / 535600);
            int days = (int)(minutes / 1440) % 365;

            // outputs
            System.out.println(minutes + " is equal to " + year + " and " + days + " days");
        } catch (Exception e) {
            System.out.println("an error occurred" + e);
        }
    }
}