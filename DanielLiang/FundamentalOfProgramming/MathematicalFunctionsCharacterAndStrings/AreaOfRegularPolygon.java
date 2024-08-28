package DanielLiang.FundamentalOfProgramming.MathematicalFunctionsCharacterAndStrings;

import java.util.*;

public class AreaOfRegularPolygon {

    public static void main(String[] args){
        try (Scanner input = new Scanner(System.in)){
            System.out.print("Enter Number of Sides: ");
            double numbers_of_sides = input.nextDouble();


            System.out.print("Enter the sides: ");
            double sides = input.nextDouble();

            double area = numbers_of_sides * sides * sides/ (4 * Math.tan(Math.PI / numbers_of_sides));
            System.out.printf("Area of the ploygon is: %.2f", area);
        } catch (Exception e) {
           
        }
    }
}