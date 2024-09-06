package DanielLiang.FundamentalOfProgramming.Selections;

import java.util.Scanner;

public class TrianglePerimeter {
    public static void main(String[] args) {
        try (// user prompt to enter the edges of the triangle
        Scanner scanner = new Scanner(System.in)) {
            System.out.println("Enter the lengths of the three edges of the triangle:");
            double edge1 = scanner.nextDouble();
            double edge2 = scanner.nextDouble();
            double edge3 = scanner.nextDouble();

            // check if the input forms a valid triangle
            boolean isValidTriangle = (edge1 + edge2 > edge3) && (edge1 + edge3 > edge2) && (edge2 + edge3 > edge1);
            if (isValidTriangle) {
                // compute the perimeter of the triangle
                double perimeter = edge1 + edge2 + edge3;
                System.out.println("Perimeter of the triangle: " + perimeter);
            } else {
                System.out.println("Invalid input. The input does not form a valid triangle.");
            }
        }catch (Exception e) {
            System.err.println("An error Occurred" + e);
        }
    }
}
