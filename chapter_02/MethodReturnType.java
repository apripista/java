// RETURN VALUES IN JAVA METHODS

// if you want the method to return a value you can use a primitive
// data type such as int, char and so on instead of void to return a keyword inside the method

public class MethodReturnType {

    // Method to add two numbers and return the sum
    public static double add_numbers(double a, double b) {
        double sum = a + b;
        return sum;
    }

    public static void main(String[] args) {
        double num1 = 5;
        double num2 = 7;

        // Call the method and store the result in a variable
        double sum = add_numbers(num1, num2);

        // Print the result
        System.out.println("Sum of " + num1 + " and " + num2 + " is: " + sum);
    }
}

/*
The given Java code defines a class named Main with two methods:
  add_numbers(int a, int b): This method takes two integers as input parameters, adds them together, and returns the sum.

    main(String[] args): This is the entry point of the program. It initializes two integer variables num1 and num2 with
    values 5 and 7 respectively, calls the add_numbers method with these values, stores the result in a variable sum, and
    finally prints out the sum along with the numbers that were added.
 */