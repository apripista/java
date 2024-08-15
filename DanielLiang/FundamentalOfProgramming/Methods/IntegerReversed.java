package DanielLiang.FundamentalOfProgramming.Methods;

import java.util.Scanner;

public class IntegerReversed {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("enter a number: ");
        int number = input.nextInt();

        System.out.print("reversed number is:   ");
        reverser(number);
    }

    public static void reverser(int number){
        while (number != 0) {
           int digit = number % 10;
           System.out.print(digit);
           number /= 10;

            
        }
        System.out.println();
    }
}