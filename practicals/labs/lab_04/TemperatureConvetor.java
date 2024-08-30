package labs.lab_04;

import java.util.Scanner;

public class TemperatureConvetor {

    public static void main(String[] args) {
        try (Scanner input = new Scanner(System.in)) {
            // user prompt
            System.out.print("Enter a temperature in F: ");
            double fahrenheit = input.nextDouble();

            double temperature = 5.0 / 9 * (fahrenheit - 32);

            System.out.println("Temperature is: " + temperature);
        
        }catch(Exception e){
            System.out.println("an error occurred" + e);
        }
    }
}