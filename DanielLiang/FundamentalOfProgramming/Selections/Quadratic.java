package DanielLiang.FundamentalOfProgramming.Selections;

import java.util.Scanner;

public class Quadratic {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // user prmpt for a, b, and c
        System.out.print("Enter a, b, c: ");
        double a = input.nextDouble();
        double b = input.nextDouble();
        double c = input.nextDouble();

        // calculate the discriminant
        double discriminant = b * b - 4 * a * c;

        // discriminant and root calculations
        if (discriminant > 0) {
            double r1 = (-b + Math.pow(discriminant, 0.5)) / (2 * a);
            double r2 = (-b - Math.pow(discriminant, 0.5)) / (2 * a);
            System.out.println("The equation has two roots " + r1 + " and " + r2);
        } else if (discriminant == 0) {
            double r = -b / (2 * a);
            System.out.println("The equation has one root " + r);
        } else {
            System.out.println("The equation has no real roots");
        }

        input.close();
    }
}
