// FOR LOOPS IN JAVA

/*
Certainly! Let's explore the for loop in Java.
For Loop:

A for loop in Java is used to iterate over a range of values.
It consists of three parts: initialization, condition, and increment/decrement.

When you know exactly how many times you want to loop through a block of code, use the for loop instead of a while loop:
Here's the syntax of a for loop:

for (initialization; condition; increment/decrement) {
    // Code block to be executed
}

    Initialization: Initializes the loop control variable.
    Condition: Evaluates the loop control variable. If true, the loop continues; otherwise, it terminates.
    Increment/Decrement: Modifies the loop control variable after each iteration.
*/

// EXAMPLE
public class ForLoop {
    public static void main(String[] args){
        for (int number = 0; number <=20; number++){
            System.out.println(number); // repeate a number
        }

/*
Example explained

Statement 1 sets a variable before the loop starts (int number  = 0).

Statement 2 defines the condition for the loop to run (number must be less than 20).
If the condition is true, the loop will start over again, if it is false, the loop will end.

Statement 3 increases a value (number++) each time the code block in the loop has been executed.
*/

        // FINDING A EVEN NUMBER
        System.out.println("");
        System.out.println("EVEN NUMBER FINDER");
        for (int even = 0; even <= 100; even = even + 2){
            System.out.println(even + ": Is even Number");
        }

        // Enhanced For Loop (for-each loop):
        //
        //In Java, the enhanced for loop is a simpler way to iterate through collections or arrays.
        // It doesn't require explicit initialization, condition, or increment/decrement. Instead,
        // it automatically iterates through the elements of an array or collection.
        //
        //Here's the syntax of an enhanced for loop:
        //
        //java
        //
        //for (elementType element : arrayOrCollection) {
        //    // Code block to be executed
        //}
        //
        //Example (for iterating over an array):
        //
         int[] numbers = {1, 2, 3, 4, 5};
         for (int number : numbers) {
              System.out.println("Number is: " + number);
         }

        //Output:

        //Number is: 1
        //Number is: 2
        //Number is: 3
        //Number is: 4
        //Number is: 5
        //
        //Key Points:
        //
        //    The for loop is used when the number of iterations is known in advance.
        //    The enhanced for loop simplifies the process of iterating over arrays and
        //    collections, especially when you don't need the index of each element.

        //    Both types of loops can be nested within each other
        //    and combined with other control statements to create complex logic.
    }
}
