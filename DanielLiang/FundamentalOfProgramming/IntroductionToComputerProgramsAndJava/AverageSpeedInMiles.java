package DanielLiang.FundamentalOfProgramming.IntroductionToComputerProgramsAndJava;

public class AverageSpeedInMiles {

    public static void main(String[] args) {
        // constants
        double distance = 24;
        double time = 40 + 30 / 60.0;

        double distance_in_km = distance * 1.6;
        double average_speed = distance_in_km / (time * 60);

        // output: average speed in kmh
        System.out.println("Average Speed in KmH is: " + String.format("%.3f", average_speed));
    }
}