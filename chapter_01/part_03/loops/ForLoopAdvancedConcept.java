/*
Advanced For Loop Concepts in Java

This file provides a detailed explanation of how for loops work in Java, including
initialization, loop continuation conditions, and iteration actions. It includes various
examples to illustrate different for loop constructs and best practices.
*/

public class ForLoopAdvancedConcept{
    public static void main(String[] args) {

        // Example 1: Basic For Loop Structure
        System.out.println("BASIC FOR LOOP IN JAVA");
        System.out.println("");

        /*
        The for loop is a control flow statement that allows you to repeat a block of code
        a specific number of times. It consists of three main parts: initialization, condition,
        and iteration action. These parts are enclosed within parentheses and are separated
        by semicolons.
        */

        // Initializing the control variable i to 0, setting the loop condition to i < 100,
        // and incrementing i by 1 after each iteration.
        for (int i = 0; i < 100; i++) {
            System.out.println("Welcome to Java!"); // Prints the message 100 times
        }

        /*
        Explanation:
        - Initialization: 'int i = 0;' This sets the loop control variable 'i' to 0 at the start.
        - Condition: 'i < 100;' The loop continues to execute as long as this condition is true.
        - Iteration Action: 'i++;' After each iteration, 'i' is incremented by 1.
        - The loop body contains the statement to be repeated, enclosed in braces.
        - Once 'i' reaches 100, the condition 'i < 100' becomes false, and the loop terminates.
        */

        // Example 2: For Loop with Multiple Control Variables
        System.out.println("");
        System.out.println("FOR LOOP WITH MULTIPLE VARIABLES");
        System.out.println("");

        /*
        Java allows the use of multiple control variables in a for loop. These variables can be
        declared and initialized within the loop. Additionally, you can perform multiple actions
        after each iteration.
        */

        // In this example, two control variables, i and j, are initialized and updated in the loop.
        for (int i = 0, j = 10; i < j; i++, j--) {
            System.out.println("i: " + i + ", j: " + j + ", Sum: " + (i + j));
        }

        /*
        Explanation:
        - Multiple control variables can be initialized and updated within the for loop.
        - Here, 'i' and 'j' both start at 0 and 10 respectively, and are incremented and decremented with each iteration.
        - The loop continues to run as long as the sum of 'i' and 'j' is less than 10.
        - This demonstrates that you can control multiple variables simultaneously within a single for loop.
        */

        // Example 3: For Loop Without Initialization or Iteration Action
        System.out.println("");
        System.out.println("FOR LOOP WITHOUT INITIALIZATION OR ITERATION ACTION");
        System.out.println("");

        int k = 0;
        // This loop lacks initialization and iteration action within the for loop.
        // The control variable 'k' is defined outside the loop, and the iteration action is within the loop body.
        for (; k < 5; ) {
            System.out.println("k: " + k);
            k++; // The iteration action is handled manually within the loop body.
        }

        /*
        Explanation:
        - A for loop can have empty sections if the control variables are managed externally.
        - In this example, the initialization of 'k' happens before the loop, and its incrementation occurs inside the loop body.
        - The loop continues while 'k < 5', demonstrating flexibility in how for loops can be structured.
        - This approach is less common and typically used when the control variables are influenced by external factors.
        */

        // Example 4: Infinite Loop with Omitted Continuation Condition
        System.out.println("");
        System.out.println("INFINITE FOR LOOP WITH OMITTED CONTINUATION CONDITION");
        System.out.println("");

        /*
        An infinite loop occurs when the loop's continuation condition is never met,
        causing the loop to run indefinitely. In a for loop, this can happen if the condition
        is omitted or always evaluates to true.
        */

        // This loop is an infinite loop because it lacks a continuation condition.
        // To prevent an infinite loop, it has a break statement to exit after 5 iterations.
        int count = 0;
        for (;;) {
            System.out.println("This is iteration " + count);
            count++;
            if (count >= 5) break; // Exiting the loop after 5 iterations to avoid an infinite loop.
        }

        /*
        Explanation:
        - When the continuation condition is omitted, the loop assumes it's always true.
        - This creates an infinite loop that will continue to execute until explicitly broken.
        - The loop body should include a mechanism to terminate the loop, such as a 'break' statement.
        - Infinite loops are typically used in scenarios where the loop must run until an external event occurs.
        */

        // Example 5: For Loop with Post-Increment and Conditional Statements
        System.out.println("");
        System.out.println("FOR LOOP WITH POST-INCREMENT AND CONDITIONALS");
        System.out.println("");

        // This loop prints even numbers less than 10.
        // The loop control variable 'm' is incremented after checking if it's even.
        for (int m = 1; m < 10; m++) {
            if (m % 2 == 0) {
                System.out.println("Even number: " + m);
            }
        }

        /*
        Explanation:
        - The loop iterates from 1 to 9 and uses a conditional statement within the loop body.
        - It checks if the current value of 'm' is even (i.e., divisible by 2).
        - If true, it prints the even number; otherwise, it continues to the next iteration.
        - The loop showcases how to incorporate logic within the loop body to control output.
        */

    }
}

