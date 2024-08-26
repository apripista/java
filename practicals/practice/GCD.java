import java.util.*;

public class GCD {

    public static void main(String[] args) {
        // Create a scanner object to read user input
        Scanner inputScanner = new Scanner(System.in);

        // Prompt the user to enter the number of numbers
        System.out.print("Enter the number of numbers: ");
        int num_numbers = inputScanner.nextInt();

        // Create an array to store the numbers entered by the user
        int[] numbers = new int[num_numbers];

        // Input numbers
        for (int number_index = 0; number_index < num_numbers; number_index++) {
            System.out.print("Enter number " + (number_index + 1) + ": ");
            numbers[number_index] = inputScanner.nextInt();
        }

        // Find GCD
        int initial_gcd = numbers[0];
        for (int number_index = 1; number_index < num_numbers; number_index++) {
            initial_gcd = find_gcd(initial_gcd, numbers[number_index]);
        }

        // Print the GCD of the entered numbers
        System.out.print("The GCD of ");
        for (int number_index = 0; number_index < num_numbers; number_index++) {
            System.out.print(numbers[number_index]);
            if (number_index < num_numbers - 1) {
                System.out.print(", ");
            }
        }
        System.out.println(" is: " + initial_gcd);

        // Close the scanner object to prevent resource leak
        inputScanner.close();
    }

    // Function to find GCD of two numbers
    public static int find_gcd(int first_number, int second_number) {
        while (second_number != 0) {
            int temp = second_number;
            second_number = first_number % second_number;
            first_number = temp;
        }
        return first_number;
    }
}

/*
Explanation:
- This program calculates the Greatest Common Divisor (GCD) of a given set of numbers entered by the user.
- It prompts the user to enter the number of numbers they want to find the GCD for, and then prompts for each number.
- It finds the GCD using the Euclidean algorithm.
- The calculated GCD is then printed.
- The program uses a Scanner object to read user input.
- The find_gcd method implements the Euclidean algorithm to find the GCD of two numbers.
*/ 
