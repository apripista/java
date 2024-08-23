public class StringManipulations {

    public static void main(String[] args) {
        // Introduction to Strings
        String message = "Welcome to Java";
        
        // Getting the length of a string
        int length = message.length();
        System.out.println("The length of \"" + message + "\" is " + length);
        
        // Getting characters from a string
        char firstChar = message.charAt(0); // 'W'
        char lastChar = message.charAt(message.length() - 1); // 'a'
        System.out.println("First character: " + firstChar);
        System.out.println("Last character: " + lastChar);
        
        // Concatenating strings
        String s1 = "Hello";
        String s2 = "World";
        String concatenatedMessage = s1.concat(" ").concat(s2); // "Hello World"
        System.out.println("Concatenated message: " + concatenatedMessage);
        
        // Using + operator for concatenation
        String message1 = "Hello";
        String message2 = "World";
        String combinedMessage = message1 + " " + message2; // "Hello World"
        System.out.println("Combined message using + operator: " + combinedMessage);
        
        // Converting strings to uppercase and lowercase
        String upperCaseMessage = message.toUpperCase(); // "WELCOME TO JAVA"
        String lowerCaseMessage = message.toLowerCase(); // "welcome to java"
        System.out.println("Uppercase: " + upperCaseMessage);
        System.out.println("Lowercase: " + lowerCaseMessage);
        
        // Trimming strings
        String stringWithSpaces = "\t Good Night \n";
        String trimmedMessage = stringWithSpaces.trim(); // "Good Night"
        System.out.println("Trimmed message: '" + trimmedMessage + "'");
        
        // Concatenating strings with trim
        String greeting = "Hello";
        String trimmedConcatenatedMessage = greeting.concat(", ").concat(message.trim());
        System.out.println("Trimmed concatenated message: " + trimmedConcatenatedMessage);
        
        // Example to demonstrate += operator for concatenation
        message += " and Java is fun";
        System.out.println("Updated message using += operator: " + message);
        
        // Example to show operator precedence
        int i = 1, j = 2;
        System.out.println("i + j is " + i + j); // Outputs "i + j is 12"
        System.out.println("i + j is " + (i + j)); // Outputs "i + j is 3"
        
        // Handling out-of-bounds access
        try { // YOU WILL LEARN MORE ABOUT TRY, CATCH AND THROW IN THE LATER CHAPTERS.
            char outOfBoundChar = message.charAt(message.length()); // This will throw an exception
        } catch (StringIndexOutOfBoundsException e) {
            System.out.println("Caught exception: " + e.getMessage());
        }
    }
}

/*
 * Explanation:

    String Definition: Strings in Java are sequences of characters and are handled as objects. The String class is a part of the Java library and is not a primitive type.

    Methods: The String class provides methods like length(), charAt(index), concat(s), toUpperCase(), toLowerCase(), and trim() to manipulate and retrieve information from strings.

    String Literals: You can use string literals directly for operations like length(). Example: "Welcome to Java".length().

    Concatenation: You can use both concat() method and + operator for string concatenation.

    Conversion: Methods like toUpperCase() and toLowerCase() are used to convert the case of characters in a string.

    Trimming: The trim() method removes leading and trailing whitespace from a string.

    Index Handling: Always ensure that the index used in methods like charAt() is within bounds to avoid StringIndexOutOfBoundsException.
 */
