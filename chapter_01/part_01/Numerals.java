package chapter_01.part_01;

// NUMERIC DATA TYPE IN JAVA
/*
In Java, you can work with various types of numerals,
including integers and floating-point numbers. You can use
println() method to print numbers, but you do not enclose them
in double quotes.

Let's explore some examples below:
*/

public class Numerals {
    public static void main(String[] args){
        // Printing integers
        System.out.println(3); // Output: 3
        System.out.println(475); // Output: 475

        // Performing mathematical operations inside println() method
        System.out.println(4 + 7 + " four plus seven"); // Output: 11 four plus seven
        // In the above example, 4 + 7 is first evaluated to 11, and then concatenated with the string " four plus seven"

        // Printing floating-point numbers
        System.out.println(3.14); // Output: 3.14
        System.out.println(2.5 + 3.5); // Output: 6.0 (result of addition)

        // Scientific notation
        System.out.println(6.022e23); // Output: 6.022E23 (Avogadro's number)

        // Using arithmetic operations with floating-point numbers
        double radius = 5.0;
        double area = Math.PI * radius * radius;
        System.out.println("Area of the circle with radius " + radius + " is " + area); // Output: Area of the circle with radius 5.0 is 78.53981633974483

        // Mixing integers and floating-point numbers in expressions
        double result = 10 / 3.0; // Division of integer 10 by floating-point number 3.0
        System.out.println("Result of division: " + result); // Output: Result of division: 3.3333333333333335

        // Converting between data types
        int intValue = 5;
        double doubleValue = intValue; // Implicit conversion from int to double
        System.out.println("Double value: " + doubleValue); // Output: Double value: 5.0

        double floatValue = 3.75;
        int intValue2 = (int) floatValue; // Explicit casting from double to int
        System.out.println("Int value: " + intValue2); // Output: Int value: 3
    }
}
