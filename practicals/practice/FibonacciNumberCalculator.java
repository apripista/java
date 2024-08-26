import java.util.Scanner;

public class FibonacciNumberCalculator {

    public static void main(String[] args) {
        // Create a Scanner object to read user input
        Scanner input = new Scanner(System.in);

        // Prompt the user to enter the position of the Fibonacci number to find
        System.out.print("Enter the position of the Fibonacci number to find: ");
        int position = input.nextInt();

        // Calculate the Fibonacci number at the specified position
        int fibonacci_number = calculate_fibonacci(position);

        // Display the result to the user
        System.out.println("The Fibonacci number at position " + position + " is: " + fibonacci_number);

        // Close the Scanner object to release system resources
        input.close();
    }

    // Method to calculate the nth Fibonacci number
    public static int calculate_fibonacci(int position) {
        // Base cases: Fibonacci numbers for positions 0 and 1 are the same as their positions
        if (position <= 1) {
            return position;
        }

        // Initialize variables to store the Fibonacci numbers at positions 0 and 1
        int previous_fibonacci_number = 0;
        int current_fibonacci_number = 1;

        // Initialize variable to store the Fibonacci number at the specified position
        int fibonacci_number = 0;

        // Calculate Fibonacci numbers iteratively
        for (int term_index = 2; term_index <= position; term_index++) {
            // Calculate the Fibonacci number at the current position by summing the previous two Fibonacci numbers
            fibonacci_number = previous_fibonacci_number + current_fibonacci_number;

            // Update the values of the previous two Fibonacci numbers for the next iteration
            previous_fibonacci_number = current_fibonacci_number;
            current_fibonacci_number = fibonacci_number;
        }

        // Return the Fibonacci number at the specified position
        return fibonacci_number;
    }
}


/*
    This program calculates the Fibonacci number 
    at a given position in the Fibonacci sequence based on user input.

    It prompts the user to enter the position of the 
    Fibonacci number to find and then calculates the Fibonacci
    number at that position using an iterative approach.

    The main method handles user input by reading the 
    position entered by the user and then calls the calculate_fibonacci

    method to compute the Fibonacci number at that position. 
    Finally, it displays the result to the user.

    The calculate_fibonacci method takes an 
    integer position as input and returns 
    the Fibonacci number at that position.

    It implements the Fibonacci sequence 
    calculation iteratively, starting from 
    positions 0 and 1 and generating subsequent

    Fibonacci numbers until it reaches the specified position. 
    The method returns the Fibonacci number at the specified position.

    Overall, this program demonstrates how to calculate 
    Fibonacci numbers iteratively and interact with users to find
    the Fibonacci number at a specified position.

 */
