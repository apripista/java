public class Character {

    public static void main(String[] args) {
        // char Data Type Examples
        char letter = 'A';
        char numChar = '4';

        System.out.println("char Data Type Examples:");
        System.out.println("letter: " + letter); // Output: letter: A
        System.out.println("numChar: " + numChar); // Output: numChar: 4

        // Unicode and ASCII Code Examples
        /*
         * Unicode and ASCII Code
         * Characters in a computer are stored as sequences of binary numbers 
         * (0s and 1s). Encoding maps a character to its binary representation.
         * Java supports Unicode, which allows for the representation of a vast 
         * array of characters from different languages and symbols around the world.
         * Unicode: Initially designed as a 16-bit encoding scheme, allowing 
         * for 65,536 characters. It has been extended to support over a 
         * million characters (supplementary characters).
         * 
         * ASCII: An older, 8-bit encoding scheme representing 128 characters, 
         * including letters, digits, punctuation, and control characters.
         */
        char unicodeLetter = '\u0041'; // Unicode for 'A'
        char asciiLetter = 65; // ASCII code for 'A'

        System.out.println("\nUnicode and ASCII Code Examples:");
        System.out.println("unicodeLetter: " + unicodeLetter); // Output: unicodeLetter: A
        System.out.println("asciiLetter: " + asciiLetter); // Output: asciiLetter: A

        // Escape Sequences for Special Characters
        /*
         * Escape Sequences for Special Characters
         * Escape sequences are used to represent special characters in Java.
         * These sequences start with a backslash (\) followed by a character or 
         * combination of digits.
         * 
         * Common escape sequences include:
         * 
         * \b: Backspace
         * \t: Tab
         * \n: Linefeed
         * \f: Formfeed
         * \r: Carriage Return
         * \\: Backslash
         * \": Double Quote
         */
        System.out.println("\nEscape Sequences for Special Characters:");
        System.out.println("He said \"Java is fun\""); // Output: He said "Java is fun"
        System.out.println("\\t is a tab character"); // Output: \t is a tab character
        System.out.println("First line\nSecond line"); // Output: 
                                                      // First line
                                                      // Second line

        // Increment and Decrement on char Variables
        char ch = 'a';
        System.out.println("\nIncrement and Decrement on char Variables:");
        System.out.println("Original character: " + ch); // Output: Original character: a
        ch++;
        System.out.println("Next character: " + ch); // Output: Next character: b

        // Combining all concepts in one example
        char letter2 = 'B';
        char unicodeLetter2 = '\u0042'; // Unicode for 'B'
        char asciiLetter2 = 66; // ASCII code for 'B'

        System.out.println("\nCombining All Concepts:");
        System.out.println("letter2: " + letter2); // Output: letter2: B
        System.out.println("unicodeLetter2: " + unicodeLetter2); // Output: unicodeLetter2: B
        System.out.println("asciiLetter2: " + asciiLetter2); // Output: asciiLetter2: B
        System.out.println("Escape sequence example: \"Hello, World!\""); // Output: Escape sequence example: "Hello, World!"
        System.out.println("Increment example: " + (++letter2)); // Output: Increment example: C
        System.out.println("Decrement example: " + (--letter2)); // Output: Decrement example: B
    }

    // CODES ARE USED IN CharacterTesting.java, YOU CAN DELETE THEM NOW AND REMEMBER TO REPLACE THEM 
    // WHEN YOU RUN THE CharacterTesting.java FILE thanks.
    public static String isDigit(char c) {
        throw new UnsupportedOperationException("Unimplemented method 'isDigit'");
    }

    public static String isLetter(char c) {
        throw new UnsupportedOperationException("Unimplemented method 'isLetter'");
    }

    public static String toLowerCase(char c) {
        throw new UnsupportedOperationException("Unimplemented method 'toLowerCase'");
    }

    public static String isUpperCase(char c) {
        throw new UnsupportedOperationException("Unimplemented method 'isUpperCase'");
    }

    public static String isLowerCase(char c) {
        throw new UnsupportedOperationException("Unimplemented method 'isLowerCase'");
    }

    public static String toUpperCase(char c) {
        throw new UnsupportedOperationException("Unimplemented method 'toUpperCase'");
    }
}

/*
 * Explanation

    char Data Type Examples:
        Demonstrates how to assign and print char variables using character literals.
            char letter = 'A'; assigns the character 'A' to the variable letter.
            char numChar = '4'; assigns the character '4' to the variable numChar.

    Unicode and ASCII Code Examples:
        Shows how to use Unicode escape sequences and ASCII code values to assign characters to char variables.
            char unicodeLetter = '\u0041'; assigns the Unicode character 'A' to unicodeLetter.
            char asciiLetter = 65; assigns the ASCII character 'A' (decimal 65) to asciiLetter.

    Escape Sequences for Special Characters:
        Illustrates the usage of escape sequences to include special characters in strings.
            System.out.println("He said \"Java is fun\""); prints a string with double quotes.
            System.out.println("\\t is a tab character"); prints the escape sequence for a tab character.
            System.out.println("First line\nSecond line"); prints a string with a newline character.

    Increment and Decrement on char Variables:
        Demonstrates the use of increment (++) and decrement (--) operators on char variables to navigate through Unicode characters.
            char ch = 'a'; assigns the character 'a' to the variable ch.
            ch++; increments ch to the next character in the Unicode sequence, which is 'b'.

    Combining All Concepts:
        Combines all the previously mentioned concepts in a single section, showing
         the use of char literals, Unicode, ASCII, escape sequences, and increment/decrement operations.
            char letter2 = 'B'; assigns the character 'B' to the variable letter2.
            char unicodeLetter2 = '\u0042'; assigns the Unicode character 'B' to unicodeLetter2.
            char asciiLetter2 = 66; assigns the ASCII character 'B' (decimal 66) to asciiLetter2.
            System.out.println("Escape sequence example: \"Hello, World!\""); prints a string with double quotes.
            System.out.println("Increment example: " + (++letter2)); increments letter2 to 'C'.
            System.out.println("Decrement example: " + (--letter2)); decrements letter2 back to 'B'.

This Java file provides a comprehensive overview of how to work with characters in Java, 
covering essential concepts and their practical applications.
 */