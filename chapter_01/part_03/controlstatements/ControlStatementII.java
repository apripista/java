/*
In Java, control statements are used to control the flow of execution in a program. They determine the order in which
statements are executed based on certain conditions or loops. Control statements allow developers to make decisions,
repeat code blocks, and perform various actions based on specific conditions.

There are several types of control statements in Java:

    Conditional Statements: These statements execute specific blocks of code based on certain conditions.
        if-else statements:These statements evaluate a condition and execute one block of code if the condition is true,
         and another block if the condition is false.
        switch statement: This statement evaluates an expression and executes different blocks of code based on the value
        of the expression.

    Looping Statements: These statements execute a block of code repeatedly as long as a certain condition is true.
        for loop: This loop is used to iterate over a range of values, executing a block of code a fixed number of times.
        while loop: This loop executes a block of code as long as a given condition is true. The condition is evaluated
        before entering the loop.
        do-while loop: This loop is similar to the while loop, but the condition is evaluated after the execution of the
         block of code, ensuring that the block is executed at least once.

    Branching Statements: These statements alter the normal flow of control by transferring control to another part of the program.
        break statement: This statement is used to terminate the loop or switch statement it is in and transfer control
        to the statement immediately following the loop or switch.
        continue statement: This statement is used to skip the current iteration of a loop and proceed to the next iteration.

Control statements are essential for creating flexible and efficient programs by allowing developers to control the flow
of execution based on different conditions and requirements.
*/

// Java also support comparison and logical conditions

// IN THIS FILE I WILL FOCUS ON if, else..if, and else STATEMENTS
/*
    Java has the following conditional statements:

    Use if to specify a block of code to be executed, if a specified condition is true
    Use else to specify a block of code to be executed, if the same condition is false
    Use else if to specify a new condition to test, if the first condition is false
    Use switch to specify many alternative blocks of code to be executed
 */
    // EXAMPLE:
 /*
   if (condition) {
   block of code to be executed if the condition is true
  }
*/
public class ControlStatementII {
    public static void main(String[] args){
        System.out.println("if statement");
        System.out.println("");
        if (20 < 23){
            System.out.println("20 is less than 23"); // True os 20 is less than 23.
        }

        // We can also test for variables
        System.out.println("");
        float pass_mark = 70;
        float my_marks = 78;

        if (my_marks >= pass_mark){
            System.out.println("Hey!, Yo did it.");
        }
        else {
            System.out.println("No!, please you've to retake the test.");
        }
        // In the example above it means if the my_marks is greater than pass_marks then I have passed the exam if not
        // I lose, i should retake the exam again...
        // else statement is used to output the value of a variable if the first condition used in if... is not true.
        // Use the else statement to specify a block of code to be executed if the condition is false.

        // ELSE IF STATEMENTS
        System.out.println("");

        int time = 22;
        if (time < 10) {
            System.out.println("Good morning.");
        } else if (time < 18) {
            System.out.println("Good day.");
        } else {
            System.out.println("Good evening."); // This will be the output.
        }

        /*
        Example explained
        In the example above, time (22) is greater than 10, so the first condition is false. The next condition,
        in the else if statement, is also false, so we move on to the else condition since condition1 and condition2
        is both false - and print to the screen "Good evening".
        However, if the time was 14, our program would print "Good day."
        */

        // Another Example
        int number = -5;

        if (number > 0){
            System.out.println("The number is Positive.");
        } else if (number < 0) {
            System.out.println("The number is Negative.");
        }
        else {
            System.out.println("The number is Zero.");
        }

        // Code explained.
        //     The program uses conditional statements (if, else if, and else) to determine the classification of the number.
        //    The if statement checks if the value of number is greater than 0. If true, it prints "The number is positive."
        //    If the if condition is false, the else if statement checks if the value of number is less than 0. If true,
        //    it prints "The number is negative."
        //    If both the if and else if conditions are false, the else statement is executed, which means the value of
        //    number must be 0. It prints "The number is zero."
    }
}