package DanielLiang.FundamentalOfProgramming.MathematicalFunctionsCharacterAndStrings;

import java.util.Scanner;

public class EstimateArea {

    public static void main(String[] args) {
        // Constants
        final double EARTH_RADIUS = 6371.01; // Radius of Earth in kilometers

        // Create a Scanner
        Scanner input = new Scanner(System.in);

        // Input coordinates for each city
        System.out.print("Enter the coordinates of Atlanta (latitude and longitude) in degrees: ");
        String[] atlanta = input.nextLine().split(", ");
        double lat1 = Double.parseDouble(atlanta[0]);
        double lon1 = Double.parseDouble(atlanta[1]);

        System.out.print("Enter the coordinates of Orlando (latitude and longitude) in degrees: ");
        String[] orlando = input.nextLine().split(", ");
        double lat2 = Double.parseDouble(orlando[0]);
        double lon2 = Double.parseDouble(orlando[1]);

        System.out.print("Enter the coordinates of Savannah (latitude and longitude) in degrees: ");
        String[] savannah = input.nextLine().split(", ");
        double lat3 = Double.parseDouble(savannah[0]);
        double lon3 = Double.parseDouble(savannah[1]);

        System.out.print("Enter the coordinates of Charlotte (latitude and longitude) in degrees: ");
        String[] charlotte = input.nextLine().split(", ");
        double lat4 = Double.parseDouble(charlotte[0]);
        double lon4 = Double.parseDouble(charlotte[1]);

        // Convert degrees to radians
        lat1 = Math.toRadians(lat1);
        lon1 = Math.toRadians(lon1);
        lat2 = Math.toRadians(lat2);
        lon2 = Math.toRadians(lon2);
        lat3 = Math.toRadians(lat3);
        lon3 = Math.toRadians(lon3);
        lat4 = Math.toRadians(lat4);
        lon4 = Math.toRadians(lon4);

        // Calculate distances between each pair of adjacent cities
        double d1 = EARTH_RADIUS * Math.acos(Math.sin(lat1) * Math.sin(lat2) +
                                            Math.cos(lat1) * Math.cos(lat2) * Math.cos(lon1 - lon2));
        double d2 = EARTH_RADIUS * Math.acos(Math.sin(lat2) * Math.sin(lat3) +
                                            Math.cos(lat2) * Math.cos(lat3) * Math.cos(lon2 - lon3));
        double d3 = EARTH_RADIUS * Math.acos(Math.sin(lat3) * Math.sin(lat4) +
                                            Math.cos(lat3) * Math.cos(lat4) * Math.cos(lon3 - lon4));
        double d4 = EARTH_RADIUS * Math.acos(Math.sin(lat4) * Math.sin(lat1) +
                                            Math.cos(lat4) * Math.cos(lat1) * Math.cos(lon4 - lon1));
        double d5 = EARTH_RADIUS * Math.acos(Math.sin(lat1) * Math.sin(lat3) +
                                            Math.cos(lat1) * Math.cos(lat3) * Math.cos(lon1 - lon3));
        double d6 = EARTH_RADIUS * Math.acos(Math.sin(lat2) * Math.sin(lat4) +
                                            Math.cos(lat2) * Math.cos(lat4) * Math.cos(lon2 - lon4));

        // Calculate the area of the two triangles using Heron's formula
        double s1 = (d1 + d5 + d2) / 2;
        double area1 = Math.sqrt(s1 * (s1 - d1) * (s1 - d5) * (s1 - d2));

        double s2 = (d2 + d6 + d3) / 2;
        double area2 = Math.sqrt(s2 * (s2 - d2) * (s2 - d6) * (s2 - d3));

        // Calculate the total area
        double totalArea = area1 + area2;

        // Output the total area
        System.out.printf("The estimated area enclosed by the four cities is %.2f km²%n", totalArea);

        input.close();
    }
}
