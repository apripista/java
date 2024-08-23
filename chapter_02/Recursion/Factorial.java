//  RECURSION CONCEPT cdIN JAVA

/*
Recursion in Java refers to the process where a method calls itself to solve a problem. In recursive programming, a
method solves a problem by dividing it into smaller, similar subproblems. These subproblems are solved by calling the
same method recursively until a base case is reached, at which point the recursion stops.

Key elements of recursion in Java:

    Base Case: A condition where the recursion stops.
    It defines the smallest subproblem that can be solved directly without further recursion.

    Recursive Case: A condition where the method calls itself with a modified version of the problem.
    This is used to break down larger problems into smaller, more manageable ones.

    Stack: Recursion utilizes the call stack to manage method calls.
    Each recursive call pushes a new frame onto the call stack, and
    the return values are popped off the stack when the base case is reached.

    Termination: It's crucial to ensure that recursive methods terminate.
    Without a proper base case or termination condition, the recursion would continue indefinitely,
    leading to stack overflow errors.
 */

public class Factorial {
    // Recursive method to calculate factorial
    public static int calculate_factorial(int number) {
        // Base case: if number is 0 or 1, return 1
        if (number == 0 || number == 1) {
            return 1;
        } else {
            // Recursive case: number! = number * (number-1)!
            return number * calculate_factorial(number - 1);
        }
    }

    public static void main(String[] args) {
        int input_number = 5;
        // Calculate factorial of input_number
        int factorial_result = calculate_factorial(input_number);
        System.out.println("Factorial of " + input_number + " is: " + factorial_result);
    }
}

/*
Explanation:

    The factorial_calculator class defines a method named calculate_factorial which calculates the factorial of a non-negative integer.
    The method uses recursion to break down the problem: number! = number * (number-1)!.
    The base case checks if the number is 0 or 1, in which case the method returns 1.
    In the recursive case, the method calls itself with number-1 until it reaches the base case.
    In the main method, we calculate the factorial of input_number (which is 5) and print the result.
    The recursive calls proceed as follows: calculate_factorial(5) -> 5 * calculate_factorial(4) -> 5 * 4 * calculate_factorial(3) -> ... -> 5 * 4 * 3 * 2 * 1.
    Finally, the result (120) is printed to the console.
 */
