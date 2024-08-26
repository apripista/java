import java.util.*;

public class Sentinel {

    public static void main(String[] args) {
        try (Scanner input = new Scanner(System.in)) {
            int sum = 0;
            int data = 1;
            // Continuously prompt the user for data until 0 is entered
            while (data != 0) {
                System.out.print("Enter data. Enter 0 to end: ");
                data = input.nextInt(); // Read user input
                sum += data; // Add the input to the running sum
            }

            System.out.println("The sum is: " + sum); // Print the final sum
        }
    }
}

/*
Explanation:
- This program demonstrates the use of a sentinel value to terminate a loop.
- It prompts the user to enter data and adds each input to a running sum until the user enters 0.
- The loop continues to prompt the user until a sentinel value (0) is entered, indicating the end of input.
- It keeps track of the sum of all the entered numbers.
- After the loop terminates (when the sentinel value is entered), it prints the sum of all entered numbers.
- This program provides a simple example of how to use a sentinel value to control loop termination.
*/
