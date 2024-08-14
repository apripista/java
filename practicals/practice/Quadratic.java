import java.util.InputMismatchException;
import java.util.Scanner;

public class Quadratic {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // program description
        System.out.println("");
        System.out.println("Press CTRL + C to terminate the Program.");
        System.out.println("Enter Values as Asked Below: \n");

        boolean exit = false;
        while (!exit) {
            try {
                // User prompts
                System.out.print("What is the Value of a: ");
                double value_a = input.nextDouble();

                System.out.print("What is the value of b: ");
                double value_b = input.nextDouble();

                System.out.print("What is the value of c: ");
                double value_c = input.nextDouble();

                // Consume the newline character left in the input buffer
                input.nextLine();

                // Calculate the discriminant
                double discriminant = value_b * value_b - 4 * value_a * value_c;

                // Check if coefficient 'a' is zero (invalid for quadratic equations)
                if (value_a == 0) {
                    System.out.println("Coefficient 'a' cannot be zero. Please enter valid coefficients.");
                    continue; // Skip processing this set of coefficients
                }

                // Check if coefficients are within acceptable range (example bounds: -100 to 100)
                if (Math.abs(value_a) > 100 || Math.abs(value_b) > 100 || Math.abs(value_c) > 100) {
                    System.out.println("Coefficients must be within the range of -100 to 100. Please enter valid coefficients.");
                    continue; // Skip processing this set of coefficients
                }

                // Check if the discriminant is non-negative (real roots)
                if (discriminant >= 0) {
                    // Calculate the roots
                    double positive_root = (-value_b + Math.sqrt(discriminant)) / (2 * value_a);
                    double negative_root = (-value_b - Math.sqrt(discriminant)) / (2 * value_a);

                    // Print the roots with two decimal places
                    System.out.println("\nRoots of the quadratic equation:\n");
                    System.out.printf("Root: X = %.2f%n", positive_root);
                    System.out.printf("Or: X = %.2f%n", negative_root);
                } else {
                    // If the discriminant is negative, the roots are imaginary
                    System.out.println("\nThe roots are imaginary (non-real).");
                }
            } catch (InputMismatchException e) {
                System.out.println("\n\nInput Error: Please enter numeric values only.");
                input.nextLine(); // Clear the input buffer

            } catch (ArithmeticException e) {
                System.out.println("Error: Division by zero occurred. Please enter valid coefficients.");
                input.nextLine(); // Clear the input buffer
            }

            // Prompt user to continue or exit
            System.out.print("\nPress 'c' to continue, 'q' to quit: ");
            char choice = input.nextLine().charAt(0);
            if (choice == 'q') {
                exit = true; // Exit the loop
            }
        }

        input.close();
    }
}


// code explanations

/*
     Import Statements:
        import java.util.InputMismatchException;: 
        Imports the InputMismatchException class from 
        the java.util package, which is used to handle input mismatch errors.

        import java.util.Scanner;: Imports the Scanner class 
        from the java.util package, which is used for user input.

    Class Declaration:
        public class Quadratic {: Defines a class named Quadratic.

    Main Method:
        public static void main(String[] args) {: Entry point of the program.

    Scanner Object Creation:
        Scanner input = new Scanner(System.in);: Creates a Scanner object named
         'input' to read user input from the standard input stream (keyboard).

    Program Description:
        Prints a brief description of the program, explaining how to use it 
        and how to terminate it.

    User Input and Processing:
        Within a while loop that continues until the user decides to
        quit ('q' is entered), the program prompts the user to enter the 
        coefficients (a, b, c) of a quadratic equation.

        Each coefficient is read as a double using input.nextDouble().

        The program calculates the discriminant of the quadratic 
        equation using the formula b2−4acb2−4ac.

        If the discriminant is non-negative (indicating real roots), 
        the program calculates and prints the roots using the quadratic formula.
        
        If the discriminant is negative, the 
        program indicates that the roots are imaginary (non-real).
        
        InputMismatchException is caught 
        and handled if the user enters non-numeric input.

    User Prompt for Continuation:
        After processing each set of coefficients, 
        the program prompts the user to either continue 
        entering coefficients ('c') or quit ('q').

    Input Validation and Program Termination:
        If the user enters 'q', the loop exits, and the program terminates.
        The Scanner object is closed to release system resources.

This program allows the user to enter coefficients of quadratic equations and 
calculates the roots based on the entered coefficients. It provides an interactive 
experience where the user can continue entering equations or choose to exit the program.
 */