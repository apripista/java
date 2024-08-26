public class MethodOverloadingCircelArea {
    // Constant for the value of PI
    static final double PI = 3.14;

    // Method to calculate the area of a circle
    static double calculateArea(double radius){
        return PI * radius * radius; // Area = π * r^2
    }

    // Method to calculate the area of a rectangle
    static double calculateArea(double length, double width){
        return length * width; // Area = length * width
    }

    // Method to calculate the area of a triangle
    static double calculateTriangleArea(double base, double height){
        return (base * height) / 2.0; // Area = (base * height) / 2
    }

    public static void main(String[] args){
        // Define dimensions for circle, rectangle, and triangle
        double radius = 5;
        double length = 6;
        double width = 4;
        double height = 6;
        double base = 3;

        // Calculate and print the area of each shape
        System.out.println("The area of a circle is: " + calculateArea(radius));
        System.out.println("The area of a rectangle is: " + calculateArea(length, width));
        System.out.println("The area of a triangle is: " + calculateTriangleArea(base, height));
    }
}

/*
Explanation:
- This program demonstrates method overloading in Java to calculate the area of different geometric shapes.
- It defines three static methods: calculateArea for a circle, calculateArea for a rectangle, and calculateTriangleArea for a triangle.
- The calculateArea method for a circle takes the radius as a parameter and returns the area calculated using the formula π * r^2.
- The calculateArea method for a rectangle takes the length and width as parameters and returns the area calculated using the formula length * width.
- The calculateTriangleArea method takes the base and height as parameters and returns the area calculated using the formula (base * height) / 2.
- In the main method, it defines dimensions for a circle, rectangle, and triangle and calculates their respective areas using the methods defined above.
- Finally, it prints the calculated areas for each shape.
*/
