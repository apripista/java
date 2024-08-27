package DanielLiang.FundamentalOfProgramming.ElementaryProgramming;

import java.util.Scanner;

public class TriangleArea {

    public static void main(String[] args) {
        try (Scanner input = new Scanner(System.in)) {
            System.out.print("Enter three Points of the triangle: ");
            double x1 = input.nextDouble();
            double y1 = input.nextDouble();
            double x2 = input.nextDouble();
            double y2 = input.nextDouble();
            double x3 = input.nextDouble();
            double y3 = input.nextDouble();

            // calculate lengths of sides
            double side1 = Math.sqrt(Math.pow((x2 - x1), 2) + Math.pow((y2 - y1), 2));
            double side2 = Math.sqrt(Math.pow((x3 - x2), 2) + Math.pow((y3 - y2), 2));
            double side3 = Math.sqrt(Math.pow((x1 - x3), 2) + Math.pow((y1 - y3), 2));

            // calculate semi-perimeter
            double s = (side1 + side2 + side3) / 2;

            // calculate area using Heron's formula
            double area = Math.sqrt(s * (s - side1) * (s - side2) * (s - side3));

            System.out.println("The area is: " + area);

        } catch (Exception e) {
            System.err.println("an error occurred" + e);
        }
    }
}
