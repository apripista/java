// METHOD OVERLOADING IN JAVA

/*
Method overloading in java refers to the ability to define multiple methods in a class witht the same
names but with different parameters. These methods can have different numbers  or type of parameters

When you call an overloaded metho, the java compiler determine which version of the method to execute
based on the number and types of arguments passed during the method invocation. This allow you to create
multiple methods with the same name but with different behaviors based on the parameters passed
 */

/*
Key points about method overloading:

  1. Method overloading is determined at compile
     time based on the method signature,which includes the method name and the parameter list.

  2  Return type alone is not sufficient to differentiate overloaded methods.
     If two methods have the same name and parameter list but different return types, it will result in a compilation error

  3. Overloaded methods can have different access modifiers
     (e.g., public, private, protected) or different return types (as long as the parameter lists are different).

    Overloading can improve code readability and maintainability
    by providing intuitive method names for different variations of functionality.
 */


public class MethodOverloading {
    // Method to add two numbers
    public double add_numbers(double first, double second){
        return first + second;
    }

    // Method to add three numbers
    public double add_numbers(double first, double second, double third){
        return first + second + third;
    }

    public static void main(String[] args){
        // Creating an instance of the Scope class
        Overloading caclultor = new Overloading();

        // Assigning values to variables
        double first = 4;
        double second = 6;
        double third = 5;

        // Calling the appropriate add_numbers method based on the number of parameters
        double sum_two_numbers = caclultor.add_numbers(first, second);
        double sum_three_numbers = caclultor.add_numbers(first, second, third);

        // Printing the results
        System.out.println("Sum of " + first + " and " + second + " is: " + sum_two_numbers);
        System.out.println("Sum of " + first + ", " + second + ", and " + third + " is: " + sum_three_numbers);
    }
}


/*
Explanation:

    Class Definition:
        Scope class is defined.

    Method Definitions:
        add_numbers(double first, double second): This method takes two double parameters (first and second) and returns their sum.
        add_numbers(double first, double second, double third): This method takes three double parameters (first, second, and third) and returns their sum.

    Main Method:
        The main method:
            Creates an instance of the Scope class named Overloading.
            Assigns values to three double variables: first, second, and third.
            Calls the appropriate add_numbers method based on the number of parameters provided.
            Stores the returned values in variables sum_two_numbers and sum_three_numbers.
            Prints the results using System.out.println().

    Output:
        The program outputs the sum of two numbers and the sum of three numbers, along with the values of the numbers being added.
 */
