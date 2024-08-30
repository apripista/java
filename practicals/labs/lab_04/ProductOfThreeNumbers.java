package labs.lab_04;

import java.util.Scanner;

public class ProductOfThreeNumbers {

    public static void main(String[] args) {
        try (Scanner input = new Scanner(System.in)) {
            // user prompts
            System.out.print("Enter a first number: ");
            double x = input.nextDouble();

            System.out.print("Enter a second number: ");
            double y = input.nextDouble();

            System.out.print("Enter a third number: ");
            double z = input.nextDouble();

            // calcuate products
            double product = x * y * z;

            // output
            System.out.println("Product of numbers is: " + product);
        
        }catch(Exception e){
            System.out.println("an error occurred" + e);
        }

    }
}