import java.util.Scanner;

public class PrimeNumberFinder {

    // Method to check if a number is prime
    public static boolean isPrime(int number) {
        if (number < 2) {
            return false;
        }
        
        if (number == 2) {
            return true;
        }
        
        // Iterate from 2 to the square root of the number
        for (int i = 2; i <= Math.sqrt(number); i++) {
            if (number % i == 0) {
                return false;
            }
        }
        
        return true;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        // Prompt the user to enter the range of numbers
        System.out.print("Enter the starting number of the range: ");
        int start = scanner.nextInt();
        
        System.out.print("Enter the ending number of the range: ");
        int end = scanner.nextInt();
        
        // Print the prime numbers within the specified range
        System.out.println("Prime numbers between " + start + " and " + end + ":");
        
        // Check if the start number is greater than the end number
        if (start > end) {
            System.out.println(" ");
            System.out.print("Initial Number cannot be greater than Final number. ");
        }
        
        // Track the number of prime numbers printed
        int primeCount = 0;
        for (int i = start; i <= end; i++) {
            if (isPrime(i)) {
                // Print the prime number with 4 spaces padding
                System.out.printf("%4d", i);
                primeCount++;

                // Check if 10 prime numbers have been printed, then move to the next line
                if (primeCount % 10 == 0) {
                    System.out.println();
                }
            }
        }
        
        // If the last row is not complete, move to the next line
        if (primeCount % 10 != 0) {
            System.out.println();
        }
        
        scanner.close();
    }
}

/*
    This program allows users to find prime numbers within a specified range.
    - The isPrime method checks whether a given number is prime.
    - The main method prompts the user to enter the starting and ending numbers of the range.
    - It then iterates through the range and prints prime numbers, with 10 numbers per row.
    - Error handling is included for cases where the starting number is greater than the ending number.
*/
