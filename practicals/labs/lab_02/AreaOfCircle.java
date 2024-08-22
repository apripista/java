package labs.lab_02;

import java.util.Scanner;

public class AreaOfCircle {

    public static void main(String[] args) {
        try (Scanner input = new Scanner(System.in)) {
            System.out.print("Enter the radius of the circle: ");
            double radius = input.nextDouble();

            double area = radius * radius * Math.PI;

            System.out.println("Area is: " + area);
        }catch(Exception e){
            System.err.println("an error occured please try again" + e);
        }
    }
}