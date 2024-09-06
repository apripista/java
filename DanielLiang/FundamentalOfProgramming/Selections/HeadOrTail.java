package DanielLiang.FundamentalOfProgramming.Selections;

import java.util.Scanner;

public class HeadOrTail {

    public static void main(String[] args) {
        try (Scanner input = new Scanner(System.in)) {
            System.out.println("Enter q to exit.");
            while (true) {
                int random = (int)(Math.random() * 2);
                System.out.print("Enter a Guess: ");
                int guess = input.nextInt();
                if(guess != random){
                    System.out.println("Your guess is: " + guess);
                    System.out.println("But the Secrete Number is: " + random);
                    System.out.println("That's A Tail");
                } else if(guess == random){
                    System.out.println("Your guess is: " + guess);
                    System.out.println("And Secrete Number is: " + random);
                    System.out.println("And that's a Head");
                    System.out.println("You Got It.");
                }
                if(guess == 'q'){
                    System.out.println("exit");
                    break;
                } else{
                    System.out.println("Invalid Input.");
                }  
            }
           
        } catch (Exception e) {
            System.err.println("An error Occurred" + e);
        }
    }
}