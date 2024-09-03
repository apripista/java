package chapter_03.ClassesAndObjects;

/*
 * Java Modifiers
 * 
 * Java modifiers are keywords that define the accessibility and behavior of classes, methods, and variables. 
 * They help control the visibility and usage of these entities within a Java program.
 * 
 * 1. Access Modifiers:
 * 
 * - public: 
 *   - Visibility: The entity is accessible from any other class.
 *   - Usage: Commonly used for classes, methods, and variables that need to be available universally.
 * 
 * - protected: 
 *   - Visibility: The entity is accessible within its own package and by subclasses in other packages.
 *   - Usage: Typically used for variables and methods that should be available to related classes but hidden from the public.
 * 
 * - default (no modifier):
 *   - Visibility: The entity is accessible only within its own package. If no access modifier is specified, the default access modifier is applied.
 *   - Usage: Useful for classes and members that are only relevant within the package.
 * 
 * - private:
 *   - Visibility: The entity is accessible only within its own class.
 *   - Usage: Used for variables and methods that should not be exposed outside the class, providing encapsulation.
 * 
 * 2. Non-Access Modifiers:
 * 
 * - static:
 *   - Usage: Indicates that the variable or method belongs to the class rather than any instance of the class. It can be accessed without creating an instance of the class.
 *   - Example: static int count; or static void methodName() { }.
 * 
 * - final:
 *   - Usage: Indicates that the variable's value cannot be changed (for variables), the method cannot be overridden (for methods), or the class cannot be subclassed (for classes).
 *   - Example: final int MAX_VALUE = 100; final void methodName() { }; final class MyClass { }.
 * 
 * - abstract:
 *   - Usage: Used to declare a class that cannot be instantiated (it can only be subclassed) or a method that must be implemented by subclasses.
 *   - Example: abstract class Animal { }; abstract void makeSound();.
 * 
 * - synchronized:
 *   - Usage: Used in multi-threaded programming to indicate that a method or block of code is synchronized, ensuring that only one thread can execute it at a time.
 *   - Example: synchronized void methodName() { }.
 * 
 * - volatile:
 *   - Usage: Indicates that a variable's value may be changed by different threads, ensuring that the most recent value is always read.
 *   - Example: volatile int counter;.
 * 
 * - transient:
 *   - Usage: Prevents serialization of certain variables. When an object is serialized, transient variables are not included in the serialized form.
 *   - Example: transient int tempValue;.
 * 
 * - native:
 *   - Usage: Indicates that a method is implemented in platform-dependent code (usually in C or C++).
 *   - Example: native void methodName();.
 * 
 * - strictfp:
 *   - Usage: Ensures that floating-point calculations adhere to IEEE 754 standards, providing consistent results across different platforms.
 *   - Example: strictfp class MyClass { }.
 * 
 * 3. Modifiers for Classes:
 * 
 * - public: Accessible from any other class.
 * - final: Cannot be subclassed.
 * - abstract: Cannot be instantiated and may contain abstract methods.
 * 
 * Summary:
 * Java modifiers are essential for controlling the accessibility and behavior of classes, methods, and variables. 
 * Proper use of modifiers enhances code security, readability, and maintainability. 
 * Understanding when and how to use each modifier is key to effective Java programming.
 */

public class JavaModifiersOverview {

    // Example of using modifiers

    public static void main(String[] args) {
        System.out.println("Java Modifiers Overview");
    }
}
