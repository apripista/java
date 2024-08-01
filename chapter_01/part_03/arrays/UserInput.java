/*
 * JAVA ARRAYS AND USER INPUTS
 */

package chapter_01.part_03.arrays;

import java.util.Scanner;

public class UserInput {

    public static void main(String[] args) {
        int size = 5; // size of the array

        // an array to store user input
        double[] numbers = new double[size];
        
        // Using try-with-resources to automatically close the Scanner
        try (Scanner input = new Scanner(System.in)) {
            double sum = 0;

            // prompt user to enter values
            // Loop to input values and calculate sum
            for (int i = 0; i < size; i++) {
                System.out.print("Enter value #" + (i + 1) + ": ");
                numbers[i] = input.nextDouble(); // Read double input
                sum += numbers[i]; // Add input to sum
            }

            // print the entered numbers
            System.out.println("\nYou entered the following numbers:");
            for (int i = 0; i < size; i++) {
                System.out.print(numbers[i] + ", ");
            }

            // Calculate the average
            double average = sum / size;

            // Print the sum and average
            System.out.println("\nSum of all elements in the array: " + sum);
            System.out.println("Average of elements in the array: " + average);
        } catch (Exception e) {
            // Handle any potential exceptions
            System.err.println("An error occurred: " + e.getMessage());
        }
    }
}

/* 
 * This Java program demonstrates user input handling with arrays.
 * 
 * General Functionality:
 * 
 * - Size of the Array:
 *   - The size variable determines the number of elements the user will input.
 * 
 * - Array for User Input:
 *   - An array named 'numbers' is created to store the user input values.
 * 
 * - User Input and Sum Calculation:
 *   - Using a Scanner object, the program prompts the user to input values for each element.
 *   - As the user inputs values, they are stored in the 'numbers' array, and their sum is calculated.
 * 
 * - Printing Entered Numbers:
 *   - After input, the program prints out the entered numbers to verify the input.
 * 
 * - Calculating Average:
 *   - The program calculates the average of the entered numbers by dividing the sum by the size of the array.
 * 
 * - Error Handling:
 *   - The program includes exception handling to catch any potential errors during input/output operations.
 *   - If an error occurs, an error message is printed to the console.
 */
