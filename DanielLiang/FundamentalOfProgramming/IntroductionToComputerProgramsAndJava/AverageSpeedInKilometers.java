package DanielLiang.FundamentalOfProgramming.IntroductionToComputerProgramsAndJava;

public class AverageSpeedInKilometers {

    public static void main(String[] args) {
        // constant 
        double distance = 14;
        double time = 45 + 30/60.0;

        // convert distance to kmh
        // find the average speed.
        double distance_in_miles = distance / 1.6;
        double average_speed = distance_in_miles / (time / 60);

        // output: speed in MpH
        System.out.println("\n\tAverage Speed Calculator.\n");
        System.out.println("distance is 14km and Total time is: 45 minutes and 30 seconds");
        System.out.println("The Answer Should be im miles per hour. (Hint: 1 Miles == 1.6km)");
        System.out.println("\naverage speed is:" + String.format("%.2f",average_speed) + " MpH");
    }
}