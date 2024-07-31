package chapter_01.part_01;

/*
Hello World: Your first Java program.

Every line of code that is inside a class is executed.
In our code below, a class called Main is declared.
A class name should always start with an uppercase letter.

Java is case-sensitive. Main and MaiN are two different things.
*/

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello World");
    }
}

/*
Explanation of Concepts:
- public class Main: Declares a class called Main, which is accessible from other classes.

- public static void main(String[] args): Declares the main method, which serves as the entry point of the program.
  - public: Specifies that the main method is accessible from other classes.
  - static: Indicates that the main method belongs to the class itself and not to instances of the class.
  - void: Indicates that the main method does not return any value.
  - main(String[] args): Signature of the main method, which takes an array of strings as arguments.

  - System.out.println("Hello World"): Outputs the string "Hello World" to the console.
  - System: A built-in Java class that provides access to the system resources.
  - out: A static member of the System class that represents the standard output stream.
  - println: A method of the PrintStream class (associated with the standard output stream)
   used to print a line of text to the console.

Note: println starts printing from a new line, whereas print does not.
*/