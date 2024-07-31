package chapter_01.part_02;

// OPERATORS IN JAVA

// operators in java are used perform operations in variables and value
/* Operators in java are categorized in the following:

  1: - arithmentic 0perators:
    Arithmetic Operators are used to perform normal Arithmetic operations like:
    Example +, -, /, *, %, ++, --

      - addition +: Used to find the Sum of numbers
      - subtraction -: Used to find the difference of numbers
      - multiplication *: Used to find the product of numbers
      - division /: Used to find the quotient of division

      - Modulus %: Used to find the reminder after division of numbers
      - Increment ++: Used to inclease one value to a variable by one.
      - Do not worry we will use ++, -- operators in for loops and while loops as well so keep learning.
 */

public class Operators {
    public static void main(String[] args){

        System.out.println("Operators in Java.");
        System.out.println("PLEASE REMEMBER TO READ COMMENTS.");
        System.out.println("1. Arithmetic Operators in Java.");
        int numeral = 50 + 34; // Operator + is used to add(find the sum of numbers).
        System.out.println(numeral); // Output total, sum of 50 + 34 == 84.
        /*
         Although in the example above + operator is used to add two values together,
         it is also used to add variable to a variable
         LOOK AT THE EXAMPLE BELOW
         */
        int grade_one = 56;
        int grade_two = grade_one + 44;
        int total_grade = grade_two + grade_one;

        System.out.println(grade_one);  // Output 56
        System.out.println(grade_two);  // Output 100 ( 56 + 44)
        System.out.println(total_grade);  // Output 156 ( grade_two == 100 + grade _one == 56)

// MORE EXAMPLES:

        int result = 10 + 5; // Addition: 10 + 5 = 15
        int difference = 20 - 8; // Subtraction: 20 - 8 = 12
        int product = 5 * 4; // Multiplication: 5 * 4 = 20
        int quotient = 25 / 5; // Division: 25 / 5 = 5
        int remainder = 10 % 3; // Modulus: 10 % 3 = 1 (remainder of 10 divided by 3)
        int num = 7;
        num++; // Increment: num = num + 1 = 8
        num--; // Decrement: num = num - 1 = 7

        // RESULTS OF THE ABOVE CODES

        System.out.println(result);
        System.out.println(difference);
        System.out.println(product);
        System.out.println(quotient);
        System.out.println(remainder);
/*
   2: - assignemnt operators
        Example: =, +=, -=, *=, /=, %=, &=, |=, ^=, <<==, <<=
 */
        System.out.println("2. Assignment Operators.");
        //The example below will show how to assign a value to a variable.
        int my_age = 17; // initially my age is 17. Use = to assign a value to a variable.
        my_age += 5; // but i have to add a new value to my age, using other assignment operators will do their function
        System.out.println(my_age);  // Output 22.

        int eggs = 25; // Simple assignment: eggs is assigned the value 25
        eggs += 5; // Compound assignment: eggs = eggs + 5 = 30
        System.out.println(eggs);

/*

   3: - logic operators
        Example: &&, || and !
*/
        int average = 5;
        int num1 = 5;
        int num2 = 7;
        System.out.println(average > 3 && average < 10); // returns true because 5 is greater than 3 AND
        System.out.println(num1 > 3 && num2 < 10); // Logical AND: true (both conditions are true)
        System.out.println(num1 > 3 || num2 > 10); // Logical OR: true (at least one condition is true)
        System.out.println(!(num1 == num2)); // Logical NOT: true (the condition is false, so its negation is true)

        /*
   4: - comparison operators:
        Comparison Operators are used to compare values or variable. Comparison is more important in Programming
        because it is used to find answers and make decision. The return value of comparison operator may be true or
        false but not both. true and false are also known as boolean values.
        You did not understand this keep learning you will be aware of this concept in this parttow.
        example: ==, !=, >, <, >=, <=

*/
        int grade = 45;
        int marks = 87;
        int pass_mark = 50;
        System.out.println(pass_mark > grade); // Output true because pass_mark is great than grade.
        System.out.println(grade == pass_mark); // Output false
        System.out.println(grade == marks); // Output false
        System.out.println(grade != my_age); // Output true

        /*
        Comparison Operators are also used in control flow statement to make a decision in programming.
        */

        // MORE EXAMPLE TOO:
        int num3 = 10;
        int num4 = 15;
        System.out.println(num3 == num4); // Equal to: false (num3 is not equal to num4)
        System.out.println(num3 != num4); // Not equal to: true (num3 is not equal to num4)
        System.out.println(num3 > num4); // Greater than: false (num3 is not greater than num4)
        System.out.println(num3 < num4); // Less than: true (num3 is less than num4)
        System.out.println(num3 >= num4); // Greater than or equal to: false (num3 is not greater than or equal to num4)
        System.out.println(num3 <= num4); // Less than or equal to: true (num3 is less than or equal to num4)

    }
}