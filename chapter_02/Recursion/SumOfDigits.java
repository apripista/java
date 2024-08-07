public class SumOfDigits {
    public static int sumOfDigits(int number) {
        // Base case: if the number is a single digit, return the number itself
        if (number < 10) {
            return number;
        }
        // Recursive case: calculate sum of digits of the number by summing the last digit
        // and recursively calling sumOfDigits with the number excluding the last digit
        else {
            return number % 10 + sumOfDigits(number / 10);
        }
    }

    public static void main(String[] args) {
        int number = 12345;
        int result = sumOfDigits(number);
        System.out.println("Sum of digits of " + number + " is: " + result);
    }
}

/*
Here's how the recursive function works:

    The sumOfDigits function takes an integer number as input.
    If the number is less than 10 (i.e., it's a single digit), the function simply returns the number itself (base case).
    Otherwise, the function recursively calls itself with the number divided by 10 to strip off the last digit, and adds this last digit to the result.
    This process continues until the base case is reached, and the sum of all digits is computed.

Recursion, in this case, provides an elegant solution for computing the sum of digits without the need for loops or additional variables.
 */