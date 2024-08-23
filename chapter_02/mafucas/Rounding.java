public class Rounding{

    public static void main(String[] args) {
        /*
        ### Rounding Methods

        The Math class in Java provides several methods for rounding numbers to their nearest integers. These methods are useful for various calculations where you need to approximate numbers to their closest whole values. The following table lists the rounding methods and their descriptions:

        | Method      | Description                                                                                 |
        |-------------|---------------------------------------------------------------------------------------------|
        | `ceil(x)`   | Rounds x up to its nearest integer. The result is returned as a double value.               |
        | `floor(x)`  | Rounds x down to its nearest integer. The result is returned as a double value.             |
        | `rint(x)`   | Rounds x to the nearest integer. If x is equally close to two integers, the even one is returned as a double value. |
        | `round(x)`  | Rounds x to the nearest integer. Returns an int if x is a float and a long if x is a double.|
        */

        // Examples of Rounding Methods

        // Example 1: Rounding up using Math.ceil(x)
        double ceilValue1 = Math.ceil(2.1);
        double ceilValue2 = Math.ceil(-2.1);
        System.out.println("Math.ceil(2.1) = " + ceilValue1);
        System.out.println("Math.ceil(-2.1) = " + ceilValue2);

        // Output:
        // Math.ceil(2.1) = 3.0
        // Math.ceil(-2.1) = -2.0

        // Example 2: Rounding down using Math.floor(x)
        double floorValue1 = Math.floor(2.9);
        double floorValue2 = Math.floor(-2.9);
        System.out.println("Math.floor(2.9) = " + floorValue1);
        System.out.println("Math.floor(-2.9) = " + floorValue2);

        // Output:
        // Math.floor(2.9) = 2.0
        // Math.floor(-2.9) = -3.0

        // Example 3: Rounding to the nearest integer using Math.rint(x)
        double rintValue1 = Math.rint(2.5);
        double rintValue2 = Math.rint(3.5);
        double rintValue3 = Math.rint(-2.5);
        System.out.println("Math.rint(2.5) = " + rintValue1);
        System.out.println("Math.rint(3.5) = " + rintValue2);
        System.out.println("Math.rint(-2.5) = " + rintValue3);

        // Output:
        // Math.rint(2.5) = 2.0
        // Math.rint(3.5) = 4.0
        // Math.rint(-2.5) = -2.0

        // Example 4: Rounding to the nearest integer using Math.round(x)
        int roundValue1 = Math.round(2.6f); // Returns int
        long roundValue2 = Math.round(2.0); // Returns long
        int roundValue3 = Math.round(-2.6f); // Returns int
        long roundValue4 = Math.round(-2.4); // Returns long
        System.out.println("Math.round(2.6f) = " + roundValue1);
        System.out.println("Math.round(2.0) = " + roundValue2);
        System.out.println("Math.round(-2.6f) = " + roundValue3);
        System.out.println("Math.round(-2.4) = " + roundValue4);

        // Output:
        // Math.round(2.6f) = 3
        // Math.round(2.0) = 2
        // Math.round(-2.6f) = -3
        // Math.round(-2.4) = -2

        /*
        * These examples demonstrate how to use the rounding methods
        * provided by the Math class to perform various mathematical operations
        * involving rounding numbers to their nearest integers.
        */
    }
}
