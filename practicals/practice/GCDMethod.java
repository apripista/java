import java.util.Scanner;
import java.util.InputMismatchException;

public class GCDMethod {

    public static void main(String[] args) {
        try (Scanner input = new Scanner(System.in)) {
            // Prompt the user to enter the first integer
            System.out.print("First integer: ");
            int initial = input.nextInt();

            // Prompt the user to enter the second integer
            System.out.print("Second integer: ");
            int next_number = input.nextInt();

            // Printing the value of the GCD of the two given numbers
            System.out.println("The GCD of " + initial + " and " + next_number + " is: " + gcd(initial, next_number));
        } catch (InputMismatchException e) {
            // Handle the input mismatch exception
            System.out.println("Invalid input. Please enter integers only.");
        }
    }

    // Function to calculate the GCD of two numbers
    public static int gcd(int initial, int next_number) {
        int initial_gcd = 1;
        int possible_gdc = 2;

        // The loop that checks for the GCD value.
        while (possible_gdc <= initial && possible_gdc <= next_number) {
            if (initial % possible_gdc == 0 && next_number % possible_gdc == 0)
                initial_gcd = possible_gdc;
            possible_gdc++;
        }

        // returning a GCD value of parameters
        return initial_gcd;
    }
}

/*
This program calculates the Greatest Common Divisor (GCD) of two integers using the Euclidean algorithm.
It prompts the user to enter two integers, calculates their GCD, and then prints the result.

Explanation of the code:

1. The main method prompts the user to enter two integers and calculates their GCD using the gcd method.

2. The gcd method calculates the GCD of two integers using the Euclidean algorithm.
   - It initializes the initial_gcd to 1 and possible_gdc to 2.
   - It iterates through possible_gdc from 2 to the minimum of the two integers.
   - If both initial and next_number are divisible by possible_gdc, it updates initial_gcd to possible_gdc.
   - After the loop, it returns the calculated GCD.

3. Exception handling is implemented using a try-catch block around the Scanner input.
   - If the user inputs a non-integer value, it catches the InputMismatchException and prints an error message.

Overall, the program provides a simple way to calculate the GCD of two integers and handles invalid input gracefully.
*/
