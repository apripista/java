package DanielLiang.FundamentalOfProgramming.Selections;

import java.util.Scanner;

public class LinearEquationUserInput {

    public static void main(String[] args) {
        System.out.println("solve linear equaton of 2 * 2");
        
        try (
        // scanner to store user input.
        Scanner input = new Scanner(System.in)) {
            System.out.print("Enter value of a, b, c, d, e, f: ");
            double a = input.nextDouble();
            double b = input.nextDouble();
            double c = input.nextDouble();
            double d = input.nextDouble();
            double e = input.nextDouble();
            double f = input.nextDouble();

            double x = (e * d - b * f) / (a * d - b * c);
            double y = (a * f - e * c) / (a * d - b * c);

            System.out.println("x is: " + x);
            System.out.println("y is: " + y);

            if((a * d - b * c) == 0){
                System.err.println("The equation has no solution.");
            }
        }catch (Exception e) {
            System.err.println("An error Occurred" + e);
        }

    }
}