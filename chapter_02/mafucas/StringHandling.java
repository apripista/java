import java.util.Scanner;

public class StringHandling {

    public static void main(String[] args) {
        
        // 1. Reading Strings from the Console
        // Explanation:
        // Creates a Scanner object to read input from the console.
        // input.next() reads the next token (word) from the input, delimited by whitespace.
        // input.nextLine() reads the entire line of input until the Enter key is pressed.
        
        try (Scanner input = new Scanner(System.in)) {
            // Read three strings separated by spaces
            System.out.print("Enter three words separated by spaces: ");
            String s1 = input.next();
            String s2 = input.next();
            String s3 = input.next();
            
            System.out.println("s1 is " + s1);
            System.out.println("s2 is " + s2);
            System.out.println("s3 is " + s3);
            
            // Read an entire line of text
            System.out.println("Enter a line: ");
            input.nextLine(); // Consume leftover newline
            String s = input.nextLine();
            System.out.println("The line entered is " + s);
            
            // 2. Reading a Character from the Console
            // Explanation:
            // Reads the entire line of input and then extracts the first character.
            
            System.out.print("Enter a character: ");
            String sChar = input.nextLine();
            char ch = sChar.charAt(0); // Extract the first character
            System.out.println("The character entered is " + ch);
        }
        
        
        
        // 3. Comparing Strings
        // Explanation:
        // Uses methods to compare strings: equals(), compareTo(), 
        // equalsIgnoreCase(), and compareToIgnoreCase().
        
        String s1Compare = "Welcome to Java";
        String s2Compare = "Welcome to Java";
        String s3Compare = "Welcome to C++";
        
        System.out.println(s1Compare.equals(s2Compare)); // true
        System.out.println(s1Compare.equals(s3Compare)); // false
        System.out.println(s1Compare.compareTo(s3Compare)); // Positive integer (indicates s1Compare > s3Compare)
        System.out.println(s1Compare.compareToIgnoreCase(s3Compare)); // Case-insensitive comparison
        
        // 4. Obtaining Substrings
        // Explanation:
        // Uses substring(beginIndex) and substring(beginIndex, endIndex) to extract parts of a string.
        
        String message = "Welcome to Java";
        String substring1 = message.substring(0, 11); // "Welcome to "
        String substring2 = message.substring(11); // "Java"
        
        System.out.println(substring1 + "HTML"); // "Welcome to HTML"
        
        // 5. Finding Characters or Substrings
        // Explanation:
        // Uses indexOf() and lastIndexOf() to find positions of characters or substrings.
        
        System.out.println(message.indexOf('W')); // 0
        System.out.println(message.indexOf('o')); // 4
        System.out.println(message.indexOf('o', 5)); // 9
        System.out.println(message.indexOf("come")); // 3
        System.out.println(message.lastIndexOf('o')); // 9
        System.out.println(message.lastIndexOf("Java")); // 11
        
        // 6. Conversion Between Strings and Numbers
        // Explanation:
        // Converts strings to numbers using parseInt() and parseDouble().
        // Converts numbers to strings by concatenating with an empty string.
        
        String intString = "123";
        int intValue = Integer.parseInt(intString); // Converts to int
        
        String doubleString = "123.45";
        double doubleValue = Double.parseDouble(doubleString); // Converts to double
        
        System.out.println("Integer value: " + intValue);
        System.out.println("Double value: " + doubleValue);
        
        int number = 456;
        String str = number + ""; // Converts number to string
        System.out.println("String value: " + str);
    }
}

/*
 * Explanation:

    Reading Strings from the Console:
        Scanner object is used to capture user input.
        next() reads words; nextLine() reads entire lines.
        After using next(), calling nextLine() can result in skipping input
        because of the newline character left in the buffer.

    Reading a Character from the Console:
        Reads an entire line and extracts the first character using charAt(0).

    Comparing Strings:
        equals() checks for exact equality.
        compareTo() compares two strings lexicographically.
        equalsIgnoreCase() and compareToIgnoreCase() ignore case differences.

    Obtaining Substrings:
        substring(beginIndex) extracts a part of the string from the specified index to the end.
        substring(beginIndex, endIndex) extracts a part from beginIndex to endIndex - 1.

    Finding Characters or Substrings:
        indexOf() finds the first occurrence.
        lastIndexOf() finds the last occurrence.

    Conversion Between Strings and Numbers:
        Integer.parseInt() and Double.parseDouble() convert strings to integers and doubles.
        Concatenation with an empty string converts numbers to strings.
 */