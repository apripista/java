public class Fibonacci {
    // Method to calculate the nth Fibonacci term
    public static int calculateFibonacciTerm(int termIndex) {
        // Base case: if termIndex is 0 or 1, return termIndex
        if (termIndex == 0 || termIndex == 1) {
            return termIndex; // Fibonacci sequence starts with 0 and 1
        }
        // Recursive case: calculate Fibonacci(termIndex-1) + Fibonacci(termIndex-2)
        else {
            return calculateFibonacciTerm(termIndex - 1) + calculateFibonacciTerm(termIndex - 2);
            // Sum of the previous two terms gives the current term
        }
    }

    public static void main(String[] args) {
        int termIndexToCalculate = 5; // We want to calculate the 5th Fibonacci term
        int result = calculateFibonacciTerm(termIndexToCalculate); // Calculate the Fibonacci term
        System.out.println("The " + termIndexToCalculate + "th term of Fibonacci sequence is: " + result);
        // Output the result
    }
}


/*
    The method calculateFibonacciTerm is responsible for computing the nth Fibonacci term.
    The variable termIndex represents the index of the term we want to calculate.
    The comments provide explanations for the base case and the recursive case.
    The main method is updated with a more descriptive variable name termIndexToCalculate to indicate the term we want to calculate.
    The output message in the main method is modified to clearly indicate which term of the Fibonacci sequence is being calculated.


 */