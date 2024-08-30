package labs.lab_04;

public class RectangleAreaAndPerimeter {

    public static void main(String[] args) {
        // predefined variable values
        double length = 13.5;
        double width = 7;

        // calculations
        double area = length * width;
        double perimeter = 2 * (length + width);

        // results
        System.out.println("length: " + length + " Width: " + width);
        System.out.println("Area is: " + area);
        System.out.println("Perimeter is: " + perimeter);
    }
}