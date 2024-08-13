/*
2. Advanced While Loop Concepts:

This file includes more complex examples of while loops, including the use of sentinel values,
input redirection, and loop design strategies.
*/

import java.util.Scanner;

public class SentinelAndInputRedirection{
    public static void main(String[] args) {

        // Example 1: Simple While Loop Example
        System.out.println("ADVANCED WHILE LOOPS IN JAVA");
        System.out.println("");

        int sum = 0, i = 1;
        while (i < 10) {
            sum = sum + i;
            i++;
        }
        System.out.println("Sum is: " + sum); // Output: Sum is 45

        /*
        In this example, the while loop adds numbers from 1 to 9 to the sum. The loop continues to execute
        until the condition (i < 10) becomes false. When i reaches 10, the loop terminates.
        */

        // Example 2: Controlling a Loop with a Sentinel Value
        System.out.println("");
        System.out.println("SENTINEL VALUE WHILE LOOPS IN JAVA");
        System.out.println("");

        Scanner input = new Scanner(System.in); // Create a Scanner object to read user input
        String data; // Declare a variable to store user input
        int total = 0; // Initialize a variable to keep track of the total sum

        // Prompt the user for input
        System.out.print("Enter an integer (or enter Q or E to quit): ");
        data = input.nextLine(); // Read the user's input as a string

        // Start a while loop that continues until the user enters "Q" or "E"
        while (!data.equalsIgnoreCase("Q") && !data.equalsIgnoreCase("E")) {
            try {
                // Try to convert the user's input to an integer
                int number = Integer.parseInt(data);
                total += number; // Add the integer to the total sum
            } catch (NumberFormatException e) {
                // Catch the exception if the input is not a valid integer
                System.out.println("Invalid input. Please enter an integer or Q/E to quit.");
            }
            // Prompt the user for input again
            System.out.print("Enter an integer (or enter Q or E to quit): ");
            data = input.nextLine(); // Read the next input
        }

        // After the loop ends, display the total sum of the entered integers
        System.out.println("The total sum is: " + total);

        /*
        This example demonstrates the use of a sentinel value to terminate a loop. The loop continues to
        read and sum input values until the user enters 0, which acts as the sentinel value, ending the loop.
        */

        // Example 3: Input and Output Redirection
        System.out.println("");
        System.out.println("INPUT/OUTPUT REDIRECTION IN JAVA");
        System.out.println("");

        // When dealing with large amounts of data, input redirection allows you to read input from a file.
        // For example, using `java SentinelValue < input.txt` reads input from a file instead of the keyboard.
        // Similarly, output redirection (`java ClassName > output.txt`) sends the output to a file.

        /*
        Input redirection example:
        java SentinelValue < input.txt

        Output redirection example:
        java SentinelValue > output.txt

        Both can be combined:
        java SentinelValue < input.txt > output.txt
        */

    }
}


// A loop that uses a sentinel value to control its 
// execution is called a sentinel-controlled loop.