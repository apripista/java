public class CharacterTesting {

    public static void main(String[] args) {
        // Comparing Characters Using Relational Operators
        char char1 = 'a';
        char char2 = 'b';
        char char3 = 'A';
        char char4 = '1';
        char char5 = '8';

        // Compare using relational operators
        System.out.println(char1 < char2); // Output: true
        // Explanation: Unicode of 'a' (97) is less than 'b' (98).

        System.out.println(char1 < char3); // Output: false
        // Explanation: Unicode of 'a' (97) is greater than 'A' (65).

        System.out.println(char4 < char5); // Output: true
        // Explanation: Unicode of '1' (49) is less than '8' (56).

        // Testing whether a character is a number, a letter, an uppercase letter, or a lowercase letter
        testCharacterType('A'); // Output: A is an uppercase letter
        testCharacterType('a'); // Output: a is a lowercase letter
        testCharacterType('5'); // Output: 5 is a numeric character
        testCharacterType('#'); // Output: # is a special character

        // Using Character class methods for testing characters
        System.out.println("\nUsing Character Class Methods:");
        System.out.println("isDigit('a') is " + Character.isDigit('a')); // Output: false
        System.out.println("isDigit('1') is " + Character.isDigit('1')); // Output: true
        System.out.println("isLetter('a') is " + Character.isLetter('a')); // Output: true
        System.out.println("isLetter('1') is " + Character.isLetter('1')); // Output: false
        System.out.println("isLowerCase('a') is " + Character.isLowerCase('a')); // Output: true
        System.out.println("isUpperCase('a') is " + Character.isUpperCase('a')); // Output: false
        System.out.println("toLowerCase('T') is " + Character.toLowerCase('T')); // Output: t
        System.out.println("toUpperCase('q') is " + Character.toUpperCase('q')); // Output: Q
    }

    public static void testCharacterType(char ch) {
        if (ch >= 'A' && ch <= 'Z') {
            System.out.println(ch + " is an uppercase letter");
        } else if (ch >= 'a' && ch <= 'z') {
            System.out.println(ch + " is a lowercase letter");
        } else if (ch >= '0' && ch <= '9') {
            System.out.println(ch + " is a numeric character");
        } else {
            System.out.println(ch + " is a special character");
        }
        // Explanation:
        // - Checks if the character is within the range of uppercase letters (A-Z).
        // - Checks if the character is within the range of lowercase letters (a-z).
        // - Checks if the character is within the range of numeric characters (0-9).
        // - If none of the above, it is a special character.
    }
}

/*
 * Output Comments:
 * 
 * 1. **Comparing Characters Using Relational Operators**:
 *    - Demonstrates how characters can be compared using relational operators based on their Unicode values.
 *    - Examples show the results of comparing characters like 'a' and 'b', 'a' and 'A', '1' and '8'.
 * 
 * 2. **Testing Character Types**:
 *    - The method `testCharacterType` determines if a character is an uppercase letter, lowercase letter, numeric character, or special character.
 *    - Uses conditional statements to check the range of Unicode values.
 * 
 * 3. **Using Character Class Methods**:
 *    - Demonstrates various `Character` class methods for testing and converting characters.
 *    - Examples include checking if a character is a digit, letter, lowercase, or uppercase.
 *    - Shows how to convert characters to lowercase or uppercase.
 */
