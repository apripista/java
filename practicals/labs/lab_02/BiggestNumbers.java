package labs.lab_02;

import java.util.Scanner;

public class BiggestNumbers {

    public static void main(String[] args) {
        try (Scanner input = new Scanner(System.in)) {
            // user prompt
            System.out.println("Enter Three numbers Separated with space: ");
            System.out.print("Enter Three Numbers: ");

            // stores
            double numberone = input.nextDouble();
            double numbertwo = input.nextDouble();
            double numberthree = input.nextDouble();

            // calculations.
            double sum = numberone + numbertwo + numberthree;
            double product = numberone * numbertwo * numberthree;
            double average = sum / 3;

            // results
            System.out.println("Sum: " + sum);
            System.out.println("Product: " + product);
            System.out.println("Average: " + average);
            // logic big number finder
            if (numberone > numbertwo && numberone > numberthree) {
                System.out.println(numberone + ": is a biggest number among the three");
                
            }else if (numbertwo > numberone && numbertwo > numberthree) {
                System.out.println(numbertwo + ": is a biggest number among the three");
                
            }else if (numberthree > numberone && numberthree > numbertwo) {
                System.out.println(numberthree + ": is a biggest number among the three");
                
            }else if (numberone == numbertwo && numbertwo == numberthree) {
                
            }else{
                System.out.println("All are equals");
            }
        }catch (Exception e){
            System.out.println("an error occurred please try again" + e);
        }
    }
}