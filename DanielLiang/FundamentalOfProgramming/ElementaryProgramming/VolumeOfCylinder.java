package DanielLiang.FundamentalOfProgramming.ElementaryProgramming;

import java.util.Scanner;

public class VolumeOfCylinder {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // constant  variable
        final double PI = 3.14159;

        // user prompt.
        System.out.println("\n\tArea and Volume of the cylinders.");
        System.out.print("Enter the radius of the cylinder: ");
        double radius = input.nextDouble();

        System.out.print("Enter the length of he cylinder: ");
        double length = input.nextDouble();

        // input closed
        input.close();

        //area and volume calculations
        double area = PI * radius * radius;
        double volume = area * length;

        // output
        System.out.println("Area of the Cylinder is: " + String.format("%.3f", area));
        System.out.println("Volume of the cylinder is: " + String.format("%.3f", volume));
    }
}