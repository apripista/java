// JAVA SCOPE

/*
In Java, scope refers to the region of a program where a particular variable can be accessed.
The scope of a variable is determined by where it is declared in the code. Java has several types of scopes:
*/

/*
    Class Scope (Static Scope):
        Variables declared at the class level (outside any method) have class scope.
        These variables are accessible throughout the class, including within all methods.

    Method Scope:
        Variables declared within a method have method scope.
        These variables are accessible only within the method in which they are declared.
        They cannot be accessed outside the method.

    Block Scope:
        A block is a group of zero or more statements enclosed in curly braces {}.
        Variables declared within a block have block scope.
        These variables are accessible only within the block in which they are declared.
        Nested blocks can have their own scope, and variables declared in an outer block are accessible in the inner block.

    Local Scope:
        Variables declared within a block or method have local scope.
        They are accessible only within the block or method in which they are declared.
        Once the block or method execution completes, local variables are destroyed.

    Instance Scope:
        Instance variables are declared within a class but outside any method, and they belong to an instance of the class.
        Their scope is tied to the instance of the class (object) they belong to.
        Instance variables are accessible from within any method or block of the class,
        as well as from methods of other classes if accessed through an object reference.

    Parameter Scope:
        Parameters are variables declared in the parameter list of a method.
        They have method scope and are accessible only within the method.
        They act as placeholders for values passed to the method when it is called.

Understanding scope is crucial for writing maintainable and bug-free code in Java,
as it helps prevent naming conflicts and ensures that variables are used where they are intended to be used.
It also plays a significant role in memory management, as variables with limited scope are automatically deallocated
when they are no longer needed.
*/

public class JavaScope {
    // Class-level variable (instance scope)
    private int classVar = 10;

    // Method with block scope
    public void methodWithBlockScope() {
        int blockVar = 20; // Block-level variable

        // Accessing class-level variable
        System.out.println("Class variable accessed within methodWithBlockScope(): " + classVar);

        // Accessing block-level variable
        System.out.println("Block variable accessed within methodWithBlockScope(): " + blockVar);
    }

    // Method with method scope
    public void methodWithMethodScope() {
        int methodVar = 30; // Method-level variable

        // Accessing class-level variable
        System.out.println("Class variable accessed within methodWithMethodScope(): " + classVar);

        // Accessing method-level variable
        System.out.println("Method variable accessed within methodWithMethodScope(): " + methodVar);
    }

    // Main method
    public static void main(String[] args) {
        Scope obj = new Scope();

        // Accessing class-level variable
        System.out.println("Class variable accessed within main method: " + obj.classVar);

        // Accessing method with block scope
        obj.methodWithBlockScope();

        // Accessing method with method scope
        obj.methodWithMethodScope();

        // Accessing block-level variable (not accessible outside the block)
        // System.out.println("Trying to access block variable outside its scope: " + blockVar); // This line will cause a compilation error
    }
}


/*
Explanation:

    Scope class defines a class-level variable classVar.
    methodWithBlockScope() and methodWithMethodScope() methods demonstrate block and method scopes respectively.
    Inside each method, we access both the class-level variable and the variables declared within their respective scopes.
    In the main method, we create an instance of Scope class and demonstrate accessing the class-level variable and invoking the methods.
    Trying to access the block-level variable outside its block scope will result in a compilation error, as demonstrated in the commented-out line.
 */


/*
A block of code may exist on its own or it can belong to an if, while or for statement. In the case of for statements,
 variables declared in the statement itself are also available inside the block's scope.
 */