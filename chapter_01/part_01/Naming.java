package chapter_01.part_01;

/*
Naming Variables in Java:

    In Java, Variables are containers for storing data values.
    Every variable has a data type, which determines the type of data that can be stored it the variable.

Naming variables in Java is an important aspect of writing clean and readable code.
Follow these conventions and best practices to name variables effectively:

1. Use Descriptive Names:
   - Choose names that accurately describe the purpose or meaning of the variable.
   - Avoid single-letter variable names (e.g., x, y) except for loop counters or temporary variables.

2. Use CamelCase for Variable Names:
   - Start with a lowercase letter and capitalize the first letter of each subsequent word.
   - Example: firstName, lastName, accountBalance, numberOfStudents.

3. Follow Naming Conventions:
   - Class and Interface Names: Use nouns or noun phrases, starting with an uppercase letter (e.g., MyClass, MyInterface).
   - Method Names: Use verbs or verb phrases, starting with a lowercase letter (e.g., calculateTotal, displayMessage).
   - Constants: Use all uppercase letters with words separated by underscores (e.g., MAX_VALUE, PI).

4. Be Consistent:
   - Follow consistent naming conventions throughout your codebase to improve readability and maintainability.

In this example, we demonstrate how to name variables following the conventions mentioned above.
*/

public class Naming {
    public static void main(String[] args) {
        // Example of Naming Variables
        int student_age;               // Descriptive name using SnakeCase
        String student_name;           // Descriptive name using SnakeCase
        double account_balance;        // Descriptive name using SnakeCase
        final int MAX_STUDENTS = 100; // Constant name in all uppercase

        // Assigning Values to Variables
        student_age = 20;
        student_name = "John Doe";
        account_balance = 1000.50;

        // Output Variables
        System.out.println("Student Name: " + student_name);
        System.out.println("Student Age: " + student_age);
        System.out.println("Account Balance: " + account_balance);
        System.out.println("Maximum Students Allowed: " + MAX_STUDENTS);
    }
}

/*  Naming Convention in Programming:
    There are more naming convention in the example above I use Kebab Case
    You can use any of the following convention just feel free to use the one that you desire.

    Snake Case:
        Words are separated by underscores (_) and all letters are lowercase.
        Example: student_name

    Pascal Case:
        Similar to CamelCase but the first letter of each word is capitalized.
        Example: StudentName

    Upper Camel Case (also known as Pascal Case):
        Similar to CamelCase but the first letter of the first word is capitalized.
        Example: StudentName

    Hungarian Notation:
        Prefixes are added to variable names to indicate their data type.
        Example: strStudentName for a string variable.

    Lowercase:
        All letters are lowercase with words separated by underscores (_).
        Example: student_name

    Upper Snake Case:
        All letters are uppercase with words separated by underscores (_).
        Example: STUDENT_NAME

        PLEASE REMEMBER TO DECLARE A DESCRIPTIVE NAME IN NAMING VARIABLES FOR MORE READABLE CODES.
        ALSO DO NOT USE KEBAB CASE NAMING CONVENTION IN NAMING VARIBLES. LIKE student-name. BECAUSE
        variable names in Java do not allow the use of -
*/