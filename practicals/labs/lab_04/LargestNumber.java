package labs.lab_04;

import java.util.Scanner;

public class LargestNumber {

    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
            // user prompts
            System.out.print("Enter a number: ");
            double number = scanner.nextDouble();

            System.out.print("Enter a number: ");
            double second_number = scanner.nextDouble();

            if(number > second_number){
                System.out.println(number + " Is large number");
            }else if(second_number > number){
                System.out.println(second_number + " Is large number");
            }else{
                System.out.println("These numbers are equal.");
            }
        }catch(Exception e){
            System.out.println("an error occured" + e);
        }
    }
}