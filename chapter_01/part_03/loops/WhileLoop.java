/*
1. While Loop:

A while loop in Java repeatedly executes a block of code as long as a given condition is true. Here's the syntax:


while (condition) {
    // Code block to be executed
}

The condition is evaluated before each iteration. If the condition is true, the code block is executed.
If the condition is false initially, the code block will never execute.

*/

public class WhileLoop{
    public static void main(String[] args){
        System.out.println("WHILE LOOPS IN JAVA");
        System.out.println("");

        int count = 1;
        while (count <= 5) {
            System.out.println("Count is: " + count);
            count++;
        }
/*
Output:

Count is: 1
Count is: 2
Count is: 3
Count is: 4
Count is: 5
*/

// 2. Do-While Loop:

// A do-while loop in Java is similar to a while loop, but the condition is evaluated after the code block has been executed.
// This means the code block is guaranteed to execute at least once. Here's the syntax:
/*
do {
    // Code block to be executed
} while (condition);
*/
        System.out.println("");
        System.out.println("DO - WHILE LOOPS IN JAVA");
        System.out.println("");
        int even = 10;
        do {
            System.out.println("Count is: " + even);
            even++;
        } while (even <= 20);

/*
Output:

Count is: 1
Count is: 2
Count is: 3
Count is: 4
Count is: 5
*/

// Key Differences:

  //  In a while loop, the condition is checked before the loop executes. In a do-while loop, the condition is checked after the loop executes.
  //  Therefore, a do-while loop always executes at least once, whereas a while loop may not execute at all if the initial condition is false.

    }
}


// Note: Do not forget to increase the variable used in the condition, otherwise the loop will never end!
