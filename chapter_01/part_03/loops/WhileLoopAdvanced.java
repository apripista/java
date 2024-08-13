/*
5.2 The while Loop

Key Points:
- A while loop executes statements repeatedly while the condition is true.
- The syntax for the while loop is:

while (loop-continuation-condition) {
    // Loop body
    Statement(s);
}

- The part of the loop that contains the statements to be repeated is called the loop body.
- Each loop contains a loop-continuation-condition, a Boolean expression that controls the execution of the body.

Example 1:
*/

public class WhileLoopAdvanced {
    public static void main(String[] args) {
        System.out.println("WHILE LOOP WITH CONTROL VARIABLE");

        int count = 0;
        while (count < 100) {
            System.out.println("Welcome to Java!");
            count++;
        }

        /*
        In this example, the loop body will be executed 100 times. The control variable 'count' is used to track the number
        of iterations. The loop-continuation-condition is 'count < 100', which ensures the loop runs exactly 100 times.
        */

        System.out.println("SUMMING NUMBERS USING WHILE LOOP");

        int sum = 0, i = 1;
        while (i < 10) {
            sum = sum + i;
            i++;
        }
        System.out.println("Sum is: " + sum); // Output: Sum is 45

        /*
        Here, the loop sums numbers from 1 to 9. The variable 'i' is incremented after each iteration until it reaches 10,
        at which point the loop terminates.
        */

        // Common Mistake: Infinite Loop
        /*
        int sum = 0, i = 1;
        while (i < 10) {
            sum = sum + i;
        }
        This loop is infinite because 'i' is never incremented, so the condition 'i < 10' is always true.
        */

        // Off-By-One Error Example
        System.out.println("OFF-BY-ONE ERROR EXAMPLE");

        count = 0;
        while (count <= 100) {
            System.out.println("Welcome to Java!");
            count++;
        }
        /*
        This loop will execute 101 times instead of 100 due to the off-by-one error in the condition 'count <= 100'.
        */
    }
}

// Notes:
// - Ensure the loop-continuation-condition eventually becomes false to avoid infinite loops.
// - Be cautious of the off-by-one error, which can cause a loop to execute one more or one less time than intended.
