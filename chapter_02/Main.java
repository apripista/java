// JAVA METHODS I

/*
A method is a block of code which only runs when it is called, You can pass data, known as parameters into a method
Methods are used to perform different actions, methods are also called functions. functions or methods are more important
because they are reusable, it is only defined once and can be used more than one.
 */


// Create a Methods / Function in Java
public class Main {

    // method declaration. first_method
    static void first_method(){
        System.out.println("I just got executed");
    }
    // from the codes above: 'first_method' is the name of the method.
    // static means that the method belongs to the Main class and not an object of the Main class. Do not worry keep up.
    // void means that the method does not have a return value.

    // To call a method in Java, write the method's name followed by two parentheses () and a semicolon;
    // the following code 'first_method' is used to print a text, when it is called
    // methods can also be called more times.
    public static void main(String[] args){
        first_method();
    }
}


/*
first define a method named first_method before calling it in the main method.
The first_method method is static, which means it belongs to the class itself, not an instance of the class.
The void keyword indicates that first_method does not return any value.
Inside first_method, it simply prints a message to the console.
In the main method, you call first_method using its name followed by parentheses () to execute its code.

This demonstrates how to define and call a method in Java,
following this approach where the method is defined before calling it.

*/