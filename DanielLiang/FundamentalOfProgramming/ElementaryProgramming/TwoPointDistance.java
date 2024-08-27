package DanielLiang.FundamentalOfProgramming.ElementaryProgramming;

import java.util.Scanner;

public class TwoPointDistance {

    public static void main(String[] args) {
        try (Scanner input = new Scanner(System.in)){
            System.out.print("Enter x1 and y1: ");
            double x1 = input.nextDouble();
            double y1 = input.nextDouble();

            System.out.print("Enter x2 and y2: ");
            double x2 = input.nextDouble();
            double y2 = input.nextDouble();

            double distance = Math.sqrt((Math.pow(x2 - x1, 2)) + Math.pow((y2 - y1), 2));
            System.out.println("Distance between two points is: " + distance); 
         } catch (Exception e) {
            System.out.println("an error occurred" + e);
        }
    }
}