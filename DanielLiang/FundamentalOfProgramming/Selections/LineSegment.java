package DanielLiang.FundamentalOfProgramming.Selections;

import java.util.Scanner;

public class LineSegment {
    public static void main(String[] args){
        try (Scanner input = new Scanner(System.in)) {
            //Prompt the user to enter the three points for p0, p1, and p2
            System.out.print("Enter three for p0, p1 and p2: ");
            double x0 = input.nextDouble();
            double y0 = input.nextDouble();
            double x1 = input.nextDouble();
            double y1 = input.nextDouble();
            double x2 = input.nextDouble();
            double y2 = input.nextDouble();

            // Calculation point in on line segment
            boolean distance = !(((x1 - x0) * (y2 - y0) - (x2 - x0) * (y1 - y0)) > 0 || ((x1 - x0) * (y2 - y0) - (x2 - x0) * (y1 - y0)) < 0 || ((x2 < x0) || (y2 < y0) || (x2 > x1) || (y2 > y1))) ;
            System.out.print( "(" + x2 + ", " + y2 + ")" + " is" );

            if(!distance) {
                System.out.print(" not on the line segment from (" + x0 + ", " + y0 + ") to (" + x1 + ", " + y1 + ")");
            }
            else {

                System.out.println(" on the line segment from (" + x0 + ", " + y0 + ") to " + "(" + x1 + ", " + y1 + ")");
            }

        }catch (Exception e) {
            System.err.println("An error Occurred" + e);
        }

    }
}