// SWITCH STATEMENTS
/*
Instead of writing many if..else statements, you can use the switch statement.
The switch statement selects one of many code blocks to be executed:
*/

/*
A switch statement in Java allows you to select one of many code blocks to be executed based on the value of a variable
or expression. It's often used as an alternative to long chains of if-else if statements when you need to test multiple
conditions against the same variable. Here's how a switch statement works:

    Expression Evaluation: The expression inside the parentheses of the switch statement is evaluated. This expression
    must result in an integral value (such as an int or char) or an enum constant.

    Matching: The value of the expression is compared with the values specified in each case label within the switch block.

    Case Labels: Each case label represents a value that the expression might have. If a case label's value matches the
    value of the expression, the code block following that case label is executed.

    Break Statement: After executing the code block associated with a case label, the break statement is used to exit
    the switch statement. Without the break statement, execution will continue into the next case block.

    Default Case: If none of the case labels match the value of the expression, the code block following the default
    label (if provided) is executed. The default case is optional.

    Fall-through Behavior: If there is no break statement in a case block, execution will continue to the next case block.
    This is known as fall-through behavior and is sometimes used intentionally, but it's usually avoided unless specifically needed.
 */

public class ControlStatementI {
    public static void main(String[] args) {
        int sides = 4; // Predefined value representing a quadrilateral

        String shapeType;

        switch (sides) {
            case 1:
                shapeType = "Circle";
                break;
            case 3:
                shapeType = "Triangle";
                break;
            case 4:
                shapeType = "Quadrilateral";
                break;
            case 5:
                shapeType = "Pentagon";
                break;
            case 6:
                shapeType = "Hexagon";
                break;
            default:
                shapeType = "Polygon with more than 6 sides";
        }

        System.out.println("The shape type is: " + shapeType);
    }
}

// Explanation:
//    Variable Initialization: The sides variable is initialized with a predefined value of 4, which represents a quadrilateral.
//    Switch Statement: The switch statement is used to evaluate the value of sides and execute the corresponding case.
//    Each case represents a different type of shape based on the number of sides.

//    Case Blocks: Each case block contains the value to be compared with sides. If sides matches the value in a case block,
//    the corresponding block of code is executed.

//    Break Statements: Each case block ends with a break statement to exit the switch statement. Without break, execution
//    would continue to the next case block.

//    Default Case: If none of the case values match the value of sides, the default case is executed. In this case,
//    it assigns the value "Polygon with more than 6 sides" to the shapeType variable.
//
//    Output: The program prints the determined type of shape based on the value of sides. In this example, it would print "Quadrilateral".
