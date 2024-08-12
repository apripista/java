package DanielLiang.FundamentalOfProgramming.IntroductionToComputerProgramsAndJava;

public class AreaPerimeterOfCircle {

    public static void main(String[] args) {
        // PI and radius
        final double PI = 3.14;
        double radius = 5.5;

        // formulas for area and perimeter
        double area = PI * radius * radius;
        double perimeter = 2 * PI * radius;

        // perimeter and area
        System.out.println("\nRadius of the circle is: " + radius + "m");
        System.out.println("\nPerimeter of the circle is: " + perimeter);
        System.out.println("Area of the circle of is: " + area);
    }
}