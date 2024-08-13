import java.util.Scanner;

public class FibonacciSequenceGenerator {

    public static void main(String[] args) {
        // Print The start of Fibonacci sequence generation
        System.out.println("Generating Fibonacci Sequence in Java");

        // Initialize variables for the Fibonacci sequence
        int previous_number = 0;
        int current_number = 1;
        int next_number;

        // Create a Scanner object to read user input
        Scanner input = new Scanner(System.in);

        // Prompt the user to enter the number of terms to generate
        System.out.print("Enter the number of terms you want to generate: ");
        int num_terms = input.nextInt();

        // Print the first two numbers of the Fibonacci sequence
        System.out.print(previous_number + " " + current_number + " ");

        // Generate the remaining terms of the Fibonacci sequence
        for (int term_index = 2; term_index <= num_terms; term_index++) {
            // Calculate the next number in the sequence
            next_number = previous_number + current_number;
            // Print the next number
            System.out.print(next_number + " ");

            // Update previous and current numbers for the next iteration
            previous_number = current_number;
            current_number = next_number;
        }

        // Close the Scanner object to release system resources
        input.close();
    }
}

/*
    This Java program generates a Fibonacci sequence
     based on the user's input for the number of terms to generate.

    It begins by printing a message indicating 
    the start of Fibonacci sequence generation.

    The program initializes variables to 
    keep track of the previous and current 
    numbers in the sequence, along with the next number to be calculated.

    It then creates a Scanner object to read user 
    input and prompts the user to enter the number 
    of terms they want to generate.

    After receiving the input, the program 
    prints the first two numbers of the Fibonacci sequence.

    Using a for loop, the program iterates to generate the 
    remaining terms of the Fibonacci sequence. For each iteration, 
    it calculates the next number in the sequence and prints it.

    Finally, the Scanner object is closed to release system resources.

 */