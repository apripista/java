package DanielLiang.FundamentalOfProgramming.IntroductionToComputerProgramsAndJava;

public class AreaPerimeterOfRectangle {

    public static void main(String[] args) {
        // length and width
        double lenght = 9.7;
        double width = 4.5;

        // formulas for area and perimeter
        double area = width * lenght;
        double perimeter = 2 * ( lenght * width);

        // area and perimeter
        System.out.println("\n\tArea of the Rectangle.\n");
        System.out.println("Length is: " + lenght + "m and width is: " + width + "m");
        System.out.println("Area of the rectangle is: " + area);
        System.out.println("Perimeter of the rectangle is: " + perimeter);
    }
}