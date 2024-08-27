package DanielLiang.FundamentalOfProgramming.ElementaryProgramming;

import java.util.Scanner;

public class WindChillIndex {

    public static void main(String[] args) {
        try (Scanner input = new Scanner(System.in)) {
            System.out.print("Enter a temperature: ");
            double ta = input.nextDouble();

            System.out.print("Wind Speed: ");
            double speed = input.nextDouble();

            if (ta <= 41 && ta >= -58 && speed >= 2) {
                double windchillindex = 35.74 + 0.6215 * ta - 35.75 * Math.pow(speed, 0.16) + 0.4275 * ta * Math.pow(speed, 0.16);
                System.out.println("The wind chill index is: " + windchillindex);
            } else {
                System.out.println("The input temperature or wind speed is out of range.");
            }

        }catch(Exception e){
            System.out.println("an error occurred" + e);
        }
    }
}
