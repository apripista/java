        // BREAK KEYWORD

        //1. break Keyword:

        // The break keyword is used to terminate the loop prematurely.
        // When encountered, it immediately exits the loop, and the control flow
        // moves to the statement immediately following the loop.

public class BreakContinue {
    public static void main(String[] args){
        System.out.println("THE Break Keyword");
        for (int number = 1; number <= 10; number++) {
            if (number == 3) {
                break; // exit the loop when number equals 3
            }
            System.out.println("Count is: " + number);
        }
        // 2. CONTINUE KEYWORD:
        //
        // The continue keyword is used to skip the remaining code inside the
        // loop for the current iteration and proceed with the next iteration.
        //
        System.out.println("");
        System.out.println("THE CONTINUE KEYWORD");
        for (int i = 1; i <= 5; i++) {
            if (i == 3) {
                continue; // skip printing when i equals 3
            }
            System.out.println("Count is: " + i);
        }

        //Output:

        //Count is: 1
        //Count is: 2
        //Count is: 4
        //Count is: 5

        //Key Points:
        //    break is used to completely exit the loop, while continue is used to skip the remaining code for the current iteration and move to the next iteration.
        //    Both keywords can be used in for, while, and do-while loops to control the loop's behavior based on certain conditions.
    }
}