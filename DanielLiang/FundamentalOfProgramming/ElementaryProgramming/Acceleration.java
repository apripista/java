package DanielLiang.FundamentalOfProgramming.ElementaryProgramming;

import java.util.Scanner;

public class Acceleration {

    public static void main(String[] args) {
        try (Scanner input = new Scanner(System.in)) {
            // user prompt:
            // starting velocity, final velocity and time taken
            System.out.println("\n\tEnter your data in m and seconds. \n");
            System.out.print("\tStarting velociy: ");
            double initial_velocity = input.nextDouble();

            System.out.print("\tFinal Velocity: ");
            double final_velocity = input.nextDouble();

            System.out.print("\tTime taken: ");
            double time = input.nextDouble();

            // calculate acceleration
            double acceleration = (final_velocity - initial_velocity) / time;
            System.out.println("\nAcceletation is: " + String.format("%.4f",acceleration) + "m/s^2");
        }catch(Exception e){
            System.err.println("\nan error occurred: " + e);
        }
    }
}