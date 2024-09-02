package labs.lab_01;

public class CircleAreaAndCircumference {
    public static void main(String[] args) {
        // Predefined radius
        double radius = 5.0;

        // Calculate area
        double area = Math.PI * radius * radius;

        // Calculate circumference
        double circumference = 2 * Math.PI * radius;

        // Display the results
        System.out.println("For a circle with radius " + radius + ":");
        System.out.println("Area: " + area);
        System.out.println("Circumference: " + circumference);
    }
}
