package labs.lab_04;

import java.util.Scanner;

public class SumUserInput {

    public static void main(String[] args) {
        try (Scanner input = new Scanner(System.in)) {
            System.out.print("Enter two numbers: ");
            double number = input.nextDouble();

            System.out.print("Enter number: ");
            double numbers = input.nextDouble();

            double sum = number + numbers;

            System.out.println("Sum is: " + sum);
        
        }catch(Exception e){
            System.out.println("an error occurred" + e);
        }
    }
}