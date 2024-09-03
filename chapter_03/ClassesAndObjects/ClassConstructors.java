package chapter_03.ClassesAndObjects;

/*
 * Explanation of Constructors in Java:
 *
 * A constructor is a special method used to initialize objects when they are created.
 * It has the same name as the class and does not have a return type, not even void.
 * Constructors play a crucial role in ensuring that objects are in a valid state 
 * before they are used.
 *
 * Types of Constructors:
 * 1. Default Constructor:
 *    - A constructor with no parameters. If no constructor is defined, 
 *      Java automatically provides a default one.
 *    - Initializes object attributes to default values (e.g., 0, null).
 *
 * 2. Parameterized Constructor:
 *    - A constructor that takes parameters to allow specific initialization 
 *      of attributes when creating an object.
 *    - Enables flexibility by allowing different values to be assigned 
 *      to object attributes upon creation.
 *
 * Example Code:
 */

public class ClassConstructors{
    public static void main(String[] args) {
        // Creating a Dog object using the default constructor
        Dog dog1 = new Dog();
        dog1.describe(); // Output: Dog Name: Unknown, Breed: Unknown, Age: 0
    
        // Creating a Dog object using the parameterized constructor
        Dog dog2 = new Dog("Buddy", "Golden Retriever", 3);
        dog2.describe(); // Output: Dog Name: Buddy, Breed: Golden Retriever, Age: 3
    }
}

class Dog {
    // Attributes of the Dog class
    String name;  // Name of the dog
    String breed; // Breed of the dog
    int age;      // Age of the dog

    // Default constructor
    public Dog() {
        name = "Unknown"; // Set default name
        breed = "Unknown"; // Set default breed
        age = 0; // Set default age
    }

    // Parameterized constructor
    public Dog(String dogName, String dogBreed, int dogAge) {
        name = dogName; // Initialize name
        breed = dogBreed; // Initialize breed
        age = dogAge; // Initialize age
    }

    // Method to describe the Dog
    public void describe() {
        // Print out the dog's details
        System.out.println("Dog Name: " + name + ", Breed: " + breed + ", Age: " + age);
    }

}

/*
 * Key Points:
 * - Constructors are crucial for initializing object state. 
 * - A class can have multiple constructors (constructor overloading) 
 *   with different parameters.
 * - Avoiding the 'this' keyword can make it simpler to understand parameter 
 *   initialization, especially for beginners.
 * - Proper use of constructors ensures that objects start in a valid state,
 *   making your code cleaner and reducing errors during runtime.
 */
