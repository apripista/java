public class Tribonacci {
    public static int tribonacci(int n) {
        if (n == 0) {
            return 0; // Base case: T(0) = 0
        } else if (n == 1 || n == 2) {
            return 1; // Base case: T(1) = T(2) = 1
        } else {
            // Recursive case: T(n) = T(n-1) + T(n-2) + T(n-3)
            return tribonacci(n - 1) + tribonacci(n - 2) + tribonacci(n - 3);
        }
    }

    public static void main(String[] args) {
        int termIndex = 7; // Calculate the 7th term of the Tribonacci sequence
        int result = tribonacci(termIndex);
        System.out.println("The " + termIndex + "th term of Tribonacci sequence is: " + result);
    }
}


/*
In this example:

    The tribonacci method takes an integer n as input and calculates the nth term of the Tribonacci sequence.
    The base cases handle the initial terms of the sequence: T(0) = 0, T(1) = 1, and T(2) = 1.
    In the recursive case, the method calculates the nth term of the Tribonacci sequence by summing the previous three terms.
    This process continues until the base case is reached, and the nth term of the Tribonacci sequence is computed.
    The main method demonstrates how to call the tribonacci method and prints the result.

This example showcases how recursion can be used to solve problems beyond just Fibonacci sequences, such as the
Tribonacci sequence, which is a sequence of numbers where each term is the sum of the three preceding terms.
 */