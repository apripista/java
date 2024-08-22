import java.util.Scanner;

public class NaturalNumber {

    public static void main(String[] args) {
        // Open a scanner for user input
        try (Scanner input = new Scanner(System.in)) {
            // Prompt the user for the initial and final numbers
            System.out.println("Find even, odd, or prime numbers in a range");
            System.out.print("Enter the initial number: ");
            int initial_value = input.nextInt();
            System.out.print("Enter the final number: ");
            int final_value = input.nextInt();

            // Present options to the user
            System.out.println("Choose an option:");
            System.out.println("1. Find even numbers");
            System.out.println("2. Find odd numbers");
            System.out.println("3. Find prime numbers");
            char option = input.next().charAt(0);

            // Perform actions based on user choice
            switch (option) {
                case '1':
                    if (initial_value > final_value) {
                        System.out.println("Initial number cannot be greater than the final value.");
                        break;
                    }
                    System.out.println("Even numbers in the range:");
                    for (int value = initial_value; value <= final_value; value++) {
                        if (value % 2 == 0) {
                            System.out.println(value);
                        }
                    }
                    break;

                case '2':
                    if (initial_value > final_value) {
                        System.out.println("Initial number cannot be greater than the final value.");
                        break;
                    }
                    System.out.println("Odd numbers in the range:");
                    for (int value = initial_value; value <= final_value; value++) {
                        if (value % 2 != 0) {
                            System.out.println(value);
                        }
                    }
                    break;

                case '3':
                    System.out.println("Prime numbers in the range:");
                    for (int value = initial_value; value <= final_value; value++) {
                        if (isPrime(value)) {
                            System.out.println(value);
                        }
                    }
                    break;

                default:
                    System.out.println("Invalid option. Please choose 1, 2, or 3.");
            }
        }
    }

    // Method to check if a number is prime
    public static boolean isPrime(int num) {
        if (num <= 1) {
            return false;
        }
        for (int i = 2; i <= Math.sqrt(num); i++) {
            if (num % i == 0) {
                return false;
            }
        }
        return true;
    }
}

/*
    This program allows users to find even, odd, or prime numbers in a specified range. 
    It prompts the user to enter the initial and final numbers of the range, and then presents 
    options to find even numbers, odd numbers, or prime numbers within that range.

    - The main method handles user input and selection of options, including error handling for invalid inputs.
    - The program contains a method isPrime to check whether a given number is prime or not.
    - Depending on the user's choice, the program iterates through the range of numbers and prints 
      even, odd, or prime numbers accordingly.
*/
