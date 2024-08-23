public class MaxMinAbs {

    public static void main(String[] args) {
        /*
        ### Max, Min, and Abs Methods

        The Math class in Java provides methods to find the maximum, minimum, and absolute
        values of given numbers. These methods are useful for comparing values and ensuring
        non-negative results. The following methods are particularly important:

        | Method         | Description                                   |
        |----------------|-----------------------------------------------|
        | `max(a, b)`    | Returns the greater of two values.            |
        | `min(a, b)`    | Returns the smaller of two values.            |
        | `abs(x)`       | Returns the absolute (non-negative) value of a number. |

        */

        // Examples of Max, Min, and Abs Methods

        // Example 1: Finding the maximum of two values using Math.max(a, b)
        int intergers = Math.max(3, 7);
        double value = Math.max(3.5, 2.8);
        System.out.println("Math.max(3, 7) = " + intergers);
        System.out.println("Math.max(3.5, 2.8) = " + value);

        // Output:
        // Math.max(3, 7) = 7
        // Math.max(3.5, 2.8) = 3.5

        // Example 2: Finding the minimum of two values using Math.min(a, b)
        int minValue1 = Math.min(3, 7);
        double minValue2 = Math.min(3.5, 2.8);
        System.out.println("Math.min(3, 7) = " + minValue1);
        System.out.println("Math.min(3.5, 2.8) = " + minValue2);

        // Output:
        // Math.min(3, 7) = 3
        // Math.min(3.5, 2.8) = 2.8

        // Example 3: Finding the absolute value using Math.abs(x)
        int absValue1 = Math.abs(-10);
        double absValue2 = Math.abs(-5.5);
        System.out.println("Math.abs(-10) = " + absValue1);
        System.out.println("Math.abs(-5.5) = " + absValue2);

        // Output:
        // Math.abs(-10) = 10
        // Math.abs(-5.5) = 5.5

        /*
        * These examples demonstrate how to use the max, min, and abs methods
        * provided by the Math class to perform various mathematical operations
        * involving comparisons and absolute value calculations.
        */
    }
}
