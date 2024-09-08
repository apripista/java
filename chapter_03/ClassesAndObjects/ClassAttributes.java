package chapter_03.ClassesAndObjects;

/*

1. Creating Multiple Objects from a Single Class:
   - You can create multiple objects from the same class. 
   - Each object will have its own set of attributes, meaning they can have different values.

2. Creating Multiple Classes in a Single File:
   - In a single Java file, you can define multiple classes. 
   - However, only one of these classes can be public, and it must have the same name as the file. 
   - If none of the classes are public, you can name the file anything you want.

3. Defining and Using Multiple Attributes:
   - Each class can have its own set of attributes (variables). 
   - These attributes are specific to the objects created from that class.
   
Example Code with Explanations:
*/

class ClassAttributes {

    /*
    Attributes of ClassAttributes class:
      - Attribute 1: age (integer type)
      - Attribute 2: name (string type, with a default value of "Joctan")
    */
    int age;
    String name = "Joctan";

    /*
    The main method - the entry point of the program.
    Inside this method, we will demonstrate how to create multiple objects from the ClassAttributes class,
    modify their attributes, and print the results.
    */

    // we can also create a method in class and also call it in the main method
    static void SimpleMethod(){
        System.out.println("This is a simple method in java");
    }
    public static void main(String[] args) {
        // Creating the first object from the ClassAttributes class
        ClassAttributes object1 = new ClassAttributes();
        
        // Creating the second object from the ClassAttributes class
        ClassAttributes object2 = new ClassAttributes();
        
        // output the value of attributes before any modifications
        System.out.println("My name is: " + object1.name);
        // method called
        SimpleMethod(); // but more example to be taught in the next file.
        // Accessing and modifying attributes of object1
        object1.age = 23;
        object1.name = "Alice";

        // Accessing and modifying attributes of object2
        object2.age = 30;
        object2.name = "Bob";

        // Printing attributes of object1
        System.out.println("Object1 - Name: " + object1.name + ", Age: " + object1.age);

        // Printing attributes of object2
        System.out.println("Object2 - Name: " + object2.name + ", Age: " + object2.age);
    }
}

/*
Class 2: AnotherClass (inside the same file):
   - This class is separate from ClassAttributes but is still in the same file.
   - It has its own set of attributes: height and weight.
*/

class AnotherClass {

    /*
    Attributes of AnotherClass:
      - Attribute 1: height (double type, representing height in meters)
      - Attribute 2: weight (double type, representing weight in kilograms)
    */
    double height;
    double weight;

    /*
    Main method for AnotherClass:
      - This method demonstrates how to create an object from AnotherClass,
        modify its attributes, and print the results.
    */
    public static void main(String[] args) {
        // Creating an object from the AnotherClass class
        AnotherClass object3 = new AnotherClass();

        // Modifying attributes of object3
        object3.height = 5.9;
        object3.weight = 70.5;

        // Printing attributes of object3
        System.out.println("Object3 - Height: " + object3.height + " meters, Weight: " + object3.weight + " kg");
    }
}

/*
Explanation:
1. Multiple Objects from ClassAttributes:
   - We create two objects: object1 and object2 from the ClassAttributes class.
   - object1: object1.age is set to 23, and object1.name is set to "Alice".
   - object2: object2.age is set to 30, and object2.name is set to "Bob".
   - Both objects have the same set of attributes but with different values.

2. Multiple Classes in One File:
   - The file contains two classes: ClassAttributes and AnotherClass.
   - ClassAttributes: This is the main class where we first defined attributes like age and name.
   - AnotherClass: Another class in the same file with its own attributes, height and weight.

3. Using AnotherClass:
   - We create object3 from AnotherClass, then set height to 5.9 meters and weight to 70.5 kg.
   - This shows how you can define and use multiple classes and objects within a single file.

4. Printing the Attributes:
   - For each object, we print the values of its attributes using System.out.println().
   - This allows us to see how different objects hold different values for their attributes, even if they come from the same class.

Summary:
1. Multiple Objects:
   - You can create multiple objects from the same class, each with its own set of attribute values.
   
2. Multiple Classes:
   - You can define more than one class in a single Java file, although only one can be public (if any).
   
3. Attributes:
   - Attributes (or fields) store the state of an object. You can access and modify them using objects.

*/
