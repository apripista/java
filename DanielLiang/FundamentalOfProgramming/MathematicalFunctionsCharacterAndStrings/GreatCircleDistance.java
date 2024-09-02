package DanielLiang.FundamentalOfProgramming.MathematicalFunctionsCharacterAndStrings;

import java.util.Scanner;

public class GreatCircleDistance {

    public static void main(String[] args) {
        // Constants
        final double EARTH_RADIUS = 6371.01; // Radius of Earth in kilometers

        // Create a Scanner
        Scanner input = new Scanner(System.in);

        // Input coordinates for point 1
        System.out.print("Enter point 1 (latitude and longitude) in degrees: ");
        String[] point1 = input.nextLine().split(", ");
        double lat1 = Double.parseDouble(point1[0]);
        double lon1 = Double.parseDouble(point1[1]);

        // Input coordinates for point 2
        System.out.print("Enter point 2 (latitude and longitude) in degrees: ");
        String[] point2 = input.nextLine().split(", ");
        double lat2 = Double.parseDouble(point2[0]);
        double lon2 = Double.parseDouble(point2[1]);

        // Convert degrees to radians
        double lat1Rad = Math.toRadians(lat1);
        double lon1Rad = Math.toRadians(lon1);
        double lat2Rad = Math.toRadians(lat2);
        double lon2Rad = Math.toRadians(lon2);

        // Calculate the great circle distance
        double distance = EARTH_RADIUS * Math.acos(
            Math.sin(lat1Rad) * Math.sin(lat2Rad) +
            Math.cos(lat1Rad) * Math.cos(lat2Rad) * Math.cos(lon1Rad - lon2Rad)
        );

        // Output the distance
        System.out.printf("The distance between the two points is %.10f km%n", distance);

        input.close();
    }
}
