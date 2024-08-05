import java.util.*;

public class Counter {

    public static void main(String[] args) {
        try (Scanner input = new Scanner(System.in)) { // Create a scanner object for user input
            int count, sum = 0, number;

            // Loop to prompt the user to enter numbers
            for (count = 0; count < 5; count++) {
                System.out.print("Enter a number: ");
                number = input.nextInt();
                sum += number; // Add the entered number to the sum
            }

            // Display the sum and count of numbers entered
            System.out.println("Sum is: " + sum);
            System.out.println("The count is: " + count);
        }
    }
}

/*
Explanation:
- This program prompts the user to enter five numbers and calculates their sum.
- It demonstrates the use of loops and user input handling in Java.
- The program utilizes a for loop to iterate five times, each time prompting the user to enter a number.
- The entered numbers are accumulated in a variable named 'sum'.
- After the loop, the program prints the sum of the entered numbers and the total count of numbers entered.
- Overall, the aim of this code is to demonstrate basic user input handling and loop usage in Java.
*/
