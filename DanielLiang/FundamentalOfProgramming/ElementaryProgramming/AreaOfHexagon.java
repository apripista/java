package DanielLiang.FundamentalOfProgramming.ElementaryProgramming;

import java.util.Scanner;

public class AreaOfHexagon {

    public static void main(String[] args) {
        try (Scanner input = new Scanner(System.in)) {
            // user prompt
            System.out.println("\n\tEnter the side of the hexagon in m");
            System.out.print("\nWhat is the side of hexagon: ");
            double side = input.nextDouble();

            // area calculation
            double area = 3 * ((Math.pow(3, 0.5) / 2)) * side * side;

            // output
            System.out.println("\nare a is: " + String.format("%.4f", area));
        
        } catch (Exception e) {
            System.err.println("\nan error occurred: " + e);
        }
    }
}