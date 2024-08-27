package DanielLiang.FundamentalOfProgramming.ElementaryProgramming;

import java.util.Scanner;

public class HeatCapacity {

    public static void main(String[] args) {
        try (Scanner input = new Scanner(System.in)){
            System.out.print("Enter amount of water in kilograms: ");
            double mass = input.nextDouble();

            System.out.print("Enter the initial temperature: ");
            double initial_temperature = input.nextDouble();

            System.err.print("Enter the final temperature: ");
            double final_temperature = input.nextDouble();

            double HeatCapacity = mass * (final_temperature - initial_temperature ) * 4184;

            System.out.print("Enegy needed is: " + HeatCapacity + "J");
        } catch (Exception e) {
            System.out.println("an error occurred" + e);
        }
    }
}