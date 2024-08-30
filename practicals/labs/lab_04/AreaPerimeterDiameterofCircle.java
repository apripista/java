package labs.lab_04;

import java.util.Scanner;

public class AreaPerimeterDiameterofCircle{

    public static void main(String[] args) {
        try (Scanner input = new Scanner(System.in)) {
            // user prompts
            System.out.print("Enter a radius: ");
            double radius = input.nextDouble();

            // calculations
            double diameter = 2 * radius;
            double area = Math.PI * radius * radius;
            double perimeter = 2 * Math.PI * radius;

            System.out.println("Diameter: " + diameter);
            System.out.println("Area is: " + area);
            System.out.println("Perimeter is: " + perimeter);
        
        }catch (Exception e) {
            System.out.println("an error occurred" + e);
        }
    }
}