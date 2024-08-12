package DanielLiang.FundamentalOfProgramming.MathematicalFunctionsCharacterAndStrings;

import java.util.Scanner;

public class AreaOfHexagon {

    public static void main(String[] args) {
        try (Scanner input = new Scanner(System.in)) {
            System.out.print("Enter the  side: ");

            double side = input.nextDouble();
            double area = 6 * side * side /(4 *(Math.tan(Math.PI/6)));

            System.out.printf("Area of Hexagon is: %.2f", area);
            
        } catch (Exception e) {
            System.out.println("Bad expressions");
        }


    }
}