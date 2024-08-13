// JAVA PARAMETERS AND ARGUMENTS

/*Parameters:

Parameters are variables that are declared as part of a method's declaration.
They act as placeholders for values that are passed into the method when it is called.
Parameters define the type and order of the values that the method expects to receive.
Methods can have zero or more parameters.
Parameters are specified within the parentheses () in the method declaration.

 */

public class ParametersAndArguments {
    // method declaration
    static void introduce(String first_name, int age) {
        System.out.println("My name is: \'" + first_name + "\'" + " and I\'m " + age + " Old");
    }

    static void greet(String name) {
        System.out.println("Hello, " + name);
    }

    // call all two methods and passing arguments
    public static void main(String[] args) {
        introduce("Alice", 20);
        greet("Alice");
    }
}
/*
    Arguments:

    Arguments are the actual values that are passed into a method when it is called.
    Arguments are provided when calling the method and are passed in the same order as the method's parameters.
    The number and type of arguments must match the number and type of parameters specified in the method declaration.
    Arguments are passed within the parentheses () when calling the method.

*/

/*
In this example, "Alice" and 20 are argument passed to the greet method when it is called from the main method.
In summary, parameters are declared in the method signature and act as placeholders for values, while arguments
are the actual values passed into the method when it is called. Understanding the difference between parameters
and arguments is crucial for working with methods effectively in Java.
*/

// When a parameter is passed to the method, it is called an argument.
// So, from the example above: first_name, age and name are all parameters,
// while 20, Alice are arguments.


// Note that when you are working with multiple parameters, the method call must have
// the same number of arguments as there are parameters, and the arguments must be passed in the same order.
