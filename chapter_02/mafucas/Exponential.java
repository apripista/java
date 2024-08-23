public class Exponential {

    public static void main(String[] args) {
        /*
        ### Exponent Methods

        The Math class in Java provides several methods to perform operations 
        involving exponents. These methods are useful for a wide range of 
        mathematical computations. The following table lists the exponent 
        methods and their descriptions:

        | Method         | Description                                                           |
        |----------------|-----------------------------------------------------------------------|
        | `exp(x)`       | Returns e raised to the power of x (e^x).                             |
        | `log(x)`       | Returns the natural logarithm of x (ln(x) = log_e(x)).                |
        | `log10(x)`     | Returns the base 10 logarithm of x (log_10(x)).                       |
        | `pow(a, b)`    | Returns a raised to the power of b (a^b).                             |
        | `sqrt(x)`      | Returns the square root of x (√x).                                    |
        */

        // Examples of Exponent Methods

        // Example 1: Calculating e^x using Math.exp(x)
        double expValue = Math.exp(1);
        System.out.println("Math.exp(1) = " + expValue);

        // Output:
        // Math.exp(1) = 2.718281828459045

        // Example 2: Calculating the natural logarithm using Math.log(x)
        double logValue = Math.log(Math.E);
        System.out.println("Math.log(Math.E) = " + logValue);

        // Output:
        // Math.log(Math.E) = 1.0

        // Example 3: Calculating the base 10 logarithm using Math.log10(x)
        double log10Value = Math.log10(10);
        System.out.println("Math.log10(10) = " + log10Value);

        // Output:
        // Math.log10(10) = 1.0

        // Example 4: Calculating the power using Math.pow(a, b)
        double powValue1 = Math.pow(2, 3);
        double powValue2 = Math.pow(3, 2);
        double powValue3 = Math.pow(4.5, 2.5);
        System.out.println("Math.pow(2, 3) = " + powValue1);
        System.out.println("Math.pow(3, 2) = " + powValue2);
        System.out.println("Math.pow(4.5, 2.5) = " + powValue3);

        // Output:
        // Math.pow(2, 3) = 8.0
        // Math.pow(3, 2) = 9.0
        // Math.pow(4.5, 2.5) = 22.91765149358557

        // Example 5: Calculating the square root using Math.sqrt(x)
        double sqrtValue1 = Math.sqrt(4);
        double sqrtValue2 = Math.sqrt(10.5);
        System.out.println("Math.sqrt(4) = " + sqrtValue1);
        System.out.println("Math.sqrt(10.5) = " + sqrtValue2);

        // Output:
        // Math.sqrt(4) = 2.0
        // Math.sqrt(10.5) = 3.24037034920393

        /*
        * These examples demonstrate how to use the exponent methods
        * provided by the Math class to perform various mathematical operations
        * involving exponents, logarithms, powers, and square roots.
        */
    }
}
