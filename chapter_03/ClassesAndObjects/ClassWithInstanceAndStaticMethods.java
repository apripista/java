package chapter_03.ClassesAndObjects;

/*
    The Fruit class represents a fruit with certain attributes (like name, color, and taste)
     and behaviors (like describing the fruit). We will define instance methods and static methods
      within this class to demonstrate how they work.
*/

class Fruit {
    // Instance attributes
    String name;
    String color;
    String taste;

    /*
        Instance Method: describe()
        This method describes the fruit by printing out its name, color, and taste.
        It can access the instance attributes (name, color, taste) directly because it belongs to an object.
    */
    public void describe() {
        System.out.println("This is a " + name + ". It is " + color + " and tastes " + taste + ".");
    }

    /*
        Static Method: welcomeMessage()
        This method prints a welcome message. 
        It does not depend on the attributes of any specific object, so it is defined as static.
        Since it is static, it can be called without creating an instance of the Fruit class.
    */
    static void welcomeMessage() {
        System.out.println("Welcome to the Fruit World!");
    }

    /*
        Static Method: exampleStaticMethod()
        This method shows how a static method cannot directly access instance variables.
        To access instance variables, it would need to create an object of the class.
    */
    public static void exampleStaticMethod() {
        // Static method cannot access 'name', 'color', or 'taste' directly because they are instance variables.
        // To access them, we need to create an object of the Fruit class.
        
        Fruit exampleFruit = new Fruit(); // Creating an object
        exampleFruit.name = "Orange";
        exampleFruit.color = "Orange";
        exampleFruit.taste = "Sweet";

        // Now, we can access the instance attributes through the object
        System.out.println("This is an example static method. Here is an example fruit: " + exampleFruit.name);
    }

    /*
        Main Method:
        This is where the program starts execution.
        We'll create objects, call instance methods, and call static methods here.
    */
    public static void main(String[] args) {
        // Calling a static method using the class name
        Fruit.welcomeMessage();

        // Creating an instance (object) of the Fruit class
        Fruit apple = new Fruit();
        apple.name = "Apple";
        apple.color = "Red";
        apple.taste = "Sweet";

        // Calling an instance method on the apple object
        apple.describe();

        // Creating another instance of the Fruit class
        Fruit banana = new Fruit();
        banana.name = "Banana";
        banana.color = "Yellow";
        banana.taste = "Sweet";

        // Calling an instance method on the banana object
        banana.describe();

        // Calling another static method
        Fruit.exampleStaticMethod();
    }
}

/*
 * Explanation:
 *
 * Instance Method (describe):
 * - Purpose: The describe method is an instance method. 
 *   It can access the instance attributes (name, color, taste) directly.
 * - Usage: You can call this method on any object of the Fruit class 
 *   to print out details about that specific fruit.
 *
 * Static Method (welcomeMessage):
 * - Purpose: The welcomeMessage method is static. 
 *   It’s a utility method that doesn’t rely on any instance data.
 * - Usage: You can call this method using the class name 
 *   (e.g., Fruit.welcomeMessage()), without creating an object.
 *
 * Static Method with Example (exampleStaticMethod):
 * - Purpose: This method demonstrates how a static method 
 *   cannot access instance variables directly. It must first create 
 *   an object to do so.
 * - Usage: The method creates an instance of Fruit within itself 
 *   to access instance variables, showing a workaround for static methods.
 *
 * Main Method:
 * - This is where the program starts execution. We create two objects 
 *   (apple and banana) of the Fruit class and call their instance methods. 
 *   We also call static methods directly from the class.
 *
 * Summary:
 * - Instance Methods: Belong to objects of the class. They can access 
 *   instance variables directly.
 * - Static Methods: Belong to the class itself. They can be called 
 *   without creating an object but cannot access instance variables directly.
 * - Public Methods: Accessible from other classes, typically used 
 *   to expose class functionality.
 * - Static Context: To access instance variables in a static context, 
 *   you need to create an instance of the class.
 */