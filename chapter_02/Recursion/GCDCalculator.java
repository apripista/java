public class GCDCalculator {
    public static int calculate_gcd(int a, int b) {
        // Base case: if one of the numbers is 0, the other number is the GCD
        if (b == 0) {
            return a;
        }
        
        // Recursive case: GCD(a, b) = GCD(b, a % b)
        else {
            return calculate_gcd(b, a % b);
        }
    }

    public static void main(String[] args) {
        int num1 = 48;
        int num2 = 18;
        int result = calculate_gcd(num1, num2);
        System.out.println("The GCD of " + num1 + " and " + num2 + " is: " + result);
    }
}


/*
In this example:

    Class name: GCDScope is descriptive and follows snake_case convention.
    Method name: calculate_gcd is descriptive and follows snake_case convention,
    indicating that it calculates the greatest common divisor of two numbers.
    Variable names: num1 and num2 are descriptive and follow snake_case convention,
    indicating the two numbers for which the GCD is to be calculated.

This version demonstrates how recursion can be used to solve mathematical problems,
such as finding the greatest common divisor of two numbers.
 */