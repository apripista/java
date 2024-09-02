package labs.lab_01;

public class CirclePropertiesCalculator {
    public static void main(String[] args) {
        // Predefined radius
        double radius = 4.0; // inches
        
        // Calculate area
        double area = Math.PI * radius * radius;
        
        // Calculate circumference
        double circumference = 2 * Math.PI * radius;
        
        // Display the results
        System.out.println("For a circle with radius " + radius + " inches:");
        System.out.println("Area: " + area + " square inches");
        System.out.println("Circumference: " + circumference + " inches");
    }
}
