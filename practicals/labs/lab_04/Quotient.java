package labs.lab_04;

import java.util.Scanner;

public class Quotient {

    public static void main(String[] args) {
        try (Scanner input = new Scanner(System.in)) {
            System.out.print("Enter a number: ");
            double first_number = input.nextDouble();

            System.out.println("Enter a number: ");
            double second_number = input.nextDouble();

            double quotient = first_number / second_number;


            System.out.println("Result is: " + quotient);
        
        }catch (Exception e) {
            System.out.println("an error occurred" + e);
        }
    }
}