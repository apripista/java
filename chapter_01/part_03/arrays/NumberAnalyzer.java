/*
 * Theme: Number Analysis with Arrays in Java
 * 
 * This Java program allows users to input a set of numbers, calculates their sum, product, 
 * and average, and then displays the results. It demonstrates the use of arrays in Java 
 * for storing and processing numerical data, along with exception handling for input/output operations.
 */

 package arrays;

 import java.util.*;
 
 public class NumberAnalyzer {
 
     public static void main(String[] args) {
 
         // Using try-with-resources to automatically close the Scanner
         try (Scanner input = new Scanner(System.in)) {
 
             // Initializing variables for sum, product, and average
             double sum = 0;
             double product = 1; // Initialize product to 1 to prevent multiplication by 0
             double average = 0;
 
             // Asking the user to input the number of elements
             System.out.print("Enter number of Element: ");
             int size = input.nextInt();
             double[] numbers = new double[size];
 
             // Loop to input numbers, calculate sum, product, and average
             for (int value = 0; value < size; value++) {
                 System.out.print("Enter a #" + (value + 1) + ": ");
                 numbers[value] = input.nextDouble();
                 
                 // Calculating sum and product
                 sum += numbers[value];
                 product *= numbers[value];
                 
                 // Calculating average inside the loop to update it for each new value
                 average = sum / size;
             }
 
             // Printing the entered numbers
             System.out.print("You entered the following numbers: ");
             for (int i = 0; i < size; i++) {
                 System.out.print(numbers[i] + ", ");
             }
 
             // Printing sum, product, and average of the entered numbers
             System.out.println("\nSum of elements are: " + sum);
             System.out.println("Product of numbers is: " + product);
             System.out.println("Average of numbers are: " + average);
 
         } catch (Exception e) {
             // Exception handling in case of input/output errors
             System.err.println("An error Occurred" + e);
         }
     }
 }
 
/*
 * This Java program prompts the user to input a number of elements, 
 * then reads those elements from the console. It calculates the sum, 
 * product, and average of the entered numbers and displays the results.
 * 
 * The steps of the program are as follows:
 * 
 * 1. Importing Required Libraries:
 *    - Importing the java.util package to use the Scanner class for user input.
 * 
 * 2. Main Method:
 *    - The main method initializes variables for sum, product, and average.
 *    - It prompts the user to enter the number of elements.
 *    - It reads the size of the array from the user.
 *    - It initializes an array 'numbers' with the given size.
 *    - It iterates through the array, prompting the user to input each element,
 *      calculates the sum and updates the product and average in each iteration.
 *    - It then prints out the entered numbers.
 *    - Finally, it prints out the sum, product, and average of the entered numbers.
 * 
 * 3. Exception Handling:
 *    - It catches any exceptions that might occur during input/output operations 
 *      using a try-catch block and prints an error message if an exception occurs.
 */
