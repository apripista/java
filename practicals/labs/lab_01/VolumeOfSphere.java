package labs.lab_01;

import java.util.Scanner;

public class VolumeOfSphere {
    public static void main(String[] args) {
        // Create a Scanner object
        Scanner scanner = new Scanner(System.in);

        // Prompt the user to input the radius of the sphere
        System.out.print("Enter the radius of the sphere: ");
        double radius = scanner.nextDouble();

        // Calculate the volume of the sphere
        double volume = (4.0 / 3.0) * Math.PI * Math.pow(radius, 3);

        // Display the volume of the sphere
        System.out.println("Volume of the sphere: " + volume);

        // Close the scanner
        scanner.close();
    }
}
