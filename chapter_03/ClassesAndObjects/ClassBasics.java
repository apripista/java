package chapter_03.ClassesAndObjects;

/**
 * This is a simple Java program that demonstrates the basics of
 * creating classes and objects without using constructors.
 */

/**
* This is the ClassBasics class, which contains the main method.
* The main method is the entry point of every Java application.
*/
public class ClassBasics {

   // The main method is where the program starts running.
   public static void main(String[] args) {
       // Create an object of the Circle class
       // 'new' is used to create a new instance of the Circle class
       Circle myCircle = new Circle();

       /**
        * Now, we have an object of the Circle class called myCircle.
        * We can access its radius field and assign a value to it.
        * Here, we are setting the radius of myCircle to 5.0.
        */
       myCircle.radius = 5.0;

       // Print the radius of myCircle
       System.out.println("The radius of myCircle is: " + myCircle.radius);

       /**
        * Let's create another object of the Circle class.
        * This time we'll call it anotherCircle.
        */
       Circle anotherCircle = new Circle();

       // Set a different radius for anotherCircle
       anotherCircle.radius = 10.0;

       // Print the radius of anotherCircle
       System.out.println("The radius of anotherCircle is: " + anotherCircle.radius);
   }
}



// Define the Circle class
class Circle {
   /**
    * This is a field (also known as an attribute or instance variable)
    * that stores the radius of the circle.
    */
   double radius;
}



/*
 * What the Code Does:
Defining a Class:
The Circle class is defined first. It has one field, radius, which holds the size of the circle.

Creating Objects:
Inside the ClassBasics class's main method, two objects of the Circle class are created: 
myCircle and anotherCircle. The 'new' keyword is used to create these objects.

Setting and Accessing Fields:
The radius field of each Circle object is accessed and modified using the dot (.) operator.
The radius is then printed to the console.

Summary:
The program illustrates how to define a class (Circle), create objects from that
 class (myCircle, anotherCircle), and work with the fields (radius) of those objects.
The new keyword is used to instantiate objects, allowing you to use the class as a blueprint 
to create multiple individual instances with their own data.
 */


 /*
  * The new keyword in Java is used to create instances of a class, which means it's 
  responsible for creating objects from that class. When you use the new keyword, 
  you are essentially calling the class's constructor to allocate memory for a new object and to
   initialize it.

Why Use new?
Memory Allocation:
When you use new, Java allocates memory for the new object on the heap. 
This memory allocation is necessary to store the object's data (e.g., its fields or properties)
 and to track the object during the program's execution.

Constructor Invocation:
The new keyword invokes the class's constructor, which is a special method designed to initialize the object.
 The constructor can set initial values for the object's fields or perform any setup required before the object is used.

Creating Unique Instances:
Each time you use new, you create a unique instance of the class. For example, 
if you create two Main objects using new, each object will have its own set of fields and can be modified 
independently.
  */