package chapter_01.part_02;

// BOOLEANS IN JAVA
/*
In programming, booleans are a data type that can have only one of two values: true or false.
Java provides a boolean data type to represent these values.

A boolean data type is declared using the boolean keyword, 
similar to how integers are declared using int, or floating-point numbers using float.
*/

public class Booleans {
    public static void main(String[] args) {
        // Declaring boolean variables
        boolean is_java_fun = true;
        boolean is_programming_easy = false;

        // Outputting boolean values
        System.out.println("Is Java fun? " + is_java_fun); // Output: Is Java fun? true
        System.out.println("Is programming easy? " + is_programming_easy); // Output: Is programming easy? false

        // Boolean expressions and comparisons
        int x = 5;
        int y = 10;
        boolean is_x_greater_than_y = x > y;
        boolean is_x_equal_toy = x == y;

        // Outputting boolean expressions
        System.out.println("Is x greater than y? " + is_x_greater_than_y); // Output: Is x greater than y? false
        System.out.println("Is x equal to y? " + is_x_equal_toy); // Output: Is x equal to y? false

        // Using boolean variables in conditional statements
        if (is_java_fun) {
            System.out.println("Yes, Java is fun!");
        } else {
            System.out.println("Java might not be fun for everyone.");
        }

        if (is_programming_easy) {
            System.out.println("Programming is easy!");
        } else {
            System.out.println("Programming can be challenging, but rewarding!");
        }
    }
}
