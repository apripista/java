public class Trigonometric{  

 public static void main(String[] args){
    /*
    ### Mathematical Functions in the Math Class

    A method is a group of statements that performs a specific task. In this context, the Math class in Java provides various methods to perform mathematical operations. Previously, you've encountered the `pow(a, b)` method for exponentiation and the `random()` method for generating random numbers. This section introduces other useful methods in the Math class, categorized into trigonometric methods, exponent methods, and service methods. The service methods include rounding, `min`, `max`, `abs`, and `random` methods.

    The Math class also provides two useful double constants, `PI` and `E` (the base of natural logarithms), which can be accessed as `Math.PI` and `Math.E` in any program.

    ### Trigonometric Methods

    The Math class contains several methods for performing trigonometric functions. The following table (Table 4.1) lists these trigonometric methods and their descriptions:

    | Method            | Description                                                       |
    |-------------------|-------------------------------------------------------------------|
    | `sin(radians)`    | Returns the trigonometric sine of an angle in radians.            |
    | `cos(radians)`    | Returns the trigonometric cosine of an angle in radians.          |
    | `tan(radians)`    | Returns the trigonometric tangent of an angle in radians.         |
    | `toRadians(degree)` | Returns the angle in radians for the given angle in degrees.     |
    | `toDegrees(radians)` | Returns the angle in degrees for the given angle in radians.    |
    | `asin(a)`         | Returns the angle in radians for the inverse of sine.             |
    | `acos(a)`         | Returns the angle in radians for the inverse of cosine.           |
    | `atan(a)`         | Returns the angle in radians for the inverse of tangent.          |

    #### Important Notes:
    - The parameters for `sin`, `cos`, and `tan` are angles in radians.
    - The return values for `asin`, `acos`, and `atan` are angles in radians, ranging between -π/2 and π/2.

    */
    // Examples of Trigonometric Methods

    // Example 1: Converting Degrees to Radians

    double degreess = 45.0;
    double radianss = Math.toRadians(degreess);
    System.out.println(degreess + " degrees is " + radianss + " radians.");

    // Output:

    // 45.0 degrees is 0.7853981633974483 radians.


    // Example 2: Converting Radians to Degrees

    double radi = Math.PI / 4;
    double degrees = Math.toDegrees(radi);
    System.out.println(radi + " radians is " + degrees + " degrees.");

    // Output:

    // 0.7853981633974483 radians is 45.0 degrees.


    // Example 3: Calculating Trigonometric Values

    double radians = Math.PI / 6; // 30 degrees
    double sinValue = Math.sin(radians);
    double cosValue = Math.cos(radians);
    double tanValue = Math.tan(radians);
    System.out.println("sin(30 degrees) = " + sinValue);
    System.out.println("cos(30 degrees) = " + cosValue);
    System.out.println("tan(30 degrees) = " + tanValue);

    //Output:

    // sin(30 degrees) = 0.49999999999999994
    // cos(30 degrees) = 0.8660254037844387
    // tan(30 degrees) = 0.5773502691896257

    //  Example 4: Calculating Inverse Trigonometric Values

    double value = 0.5;
    double asinValue = Math.asin(value);
    double acosValue = Math.acos(value);
    double atanValue = Math.atan(value);
    System.out.println("asin(0.5) = " + Math.toDegrees(asinValue) + " degrees");
    System.out.println("acos(0.5) = " + Math.toDegrees(acosValue) + " degrees");
    System.out.println("atan(0.5) = " + Math.toDegrees(atanValue) + " degrees");

    // Output:

    // asin(0.5) = 30.0 degrees
    // acos(0.5) = 60.0 degrees
    // atan(0.5) = 26.56505117707799 degrees

    /*
    * These examples demonstrate how to use the trigonometric methods 
    * provided by the Math class to perform various mathematical operations 
    * involving angles and their trigonometric functions.
    */
    }
}