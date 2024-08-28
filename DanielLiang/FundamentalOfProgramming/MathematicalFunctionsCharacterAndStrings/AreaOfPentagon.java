package DanielLiang.FundamentalOfProgramming.MathematicalFunctionsCharacterAndStrings;
import java.util.*;

public class AreaOfPentagon {

    public static void main(String[] args){
        try (Scanner input = new Scanner(System.in)) {
            System.out.print("Enter the Length Form the center to the vertex: ");

            double radius = input.nextDouble();

            double distance = 2 * radius * (Math.sin(Math.PI/5));
            double area = 5 * distance * distance /(4 * (Math.tan(Math.PI/5)));

            System.out.printf("Area of the Pentagon is:  %.2f", area);
            
        } catch (Exception e) {
            System.err.println("Bad Expression");
        }

    }
    
}