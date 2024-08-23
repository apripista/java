import java.util.Scanner;

public class StringHandlingAndFormatting {
    public static void main(String[] args) {
        // 1. Reading Strings from the Console
        Scanner input = new Scanner(System.in);
        
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
        String s = input.nextLine();
        System.out.println("The line entered is " + s);
        
        // 2. Reading a Character from the Console
        System.out.print("Enter a character: ");
        String sChar = input.nextLine();
        char ch = sChar.charAt(0); // Extract the first character
        System.out.println("The character entered is " + ch);

        // 3. Comparing Strings
        String s1Compare = "Welcome to Java";
        String s2Compare = "Welcome to Java";
        String s3Compare = "Welcome to C++";
        
        System.out.println(s1Compare.equals(s2Compare)); // true
        System.out.println(s1Compare.equals(s3Compare)); // false
        System.out.println(s1Compare.compareTo(s3Compare)); // Positive integer (s1Compare > s3Compare)
        System.out.println(s1Compare.compareToIgnoreCase(s3Compare)); // Case-insensitive comparison

        // 4. Obtaining Substrings
        String message = "Welcome to Java";
        String substring1 = message.substring(0, 11); // "Welcome to "
        String substring2 = message.substring(11); // "Java"
        
        System.out.println(substring1 + "HTML"); // "Welcome to HTML"

        // 5. Finding Characters or Substrings
        System.out.println(message.indexOf('W')); // 0
        System.out.println(message.indexOf('o')); // 4
        System.out.println(message.indexOf('o', 5)); // 9
        System.out.println(message.indexOf("come")); // 3
        System.out.println(message.lastIndexOf('o')); // 9
        System.out.println(message.lastIndexOf("Java")); // 11

        // 6. Conversion Between Strings and Numbers
        String intString = "123";
        int intValue = Integer.parseInt(intString); // Converts to int
        
        String doubleString = "123.45";
        double doubleValue = Double.parseDouble(doubleString); // Converts to double
        
        System.out.println("Integer value: " + intValue);
        System.out.println("Double value: " + doubleValue);
        
        int number = 456;
        String str = number + ""; // Converts number to string
        System.out.println("String value: " + str);
        
        // 4.6 Formatting Console Output
        // Compute interest and format the output
        double amount = 12618.98;
        double interestRate = 0.0013;
        double interest = amount * interestRate;
        
        // Display with default formatting (6 digits after the decimal point)
        System.out.println("Interest is $" + interest); // Output: Interest is $16.404674

        // Display with two digits after the decimal point using casting
        System.out.println("Interest is $" + (int)(interest * 100) / 100.0); // Output: Interest is $16.4

        // Correct formatting with printf
        System.out.printf("Interest is $%.2f\n", interest); // Output: Interest is $16.40

        // Formatting examples
        int count = 5;
        double amountFormatted = 45.56;
        System.out.printf("count is %d and amount is %.2f\n", count, amountFormatted);

        // Formatting with width and precision
        System.out.printf("Formatted examples:\n");
        System.out.printf("%5d\n", 123); // Output: "  123"
        System.out.printf("%-5d\n", 123); // Output: "123  "
        System.out.printf("%10.2f\n", 123.456); // Output: "    123.46"
        System.out.printf("%-10.2f\n", 123.456); // Output: "123.46    "

        // Display a table using printf
        System.out.printf("%-10s%-10s%-10s%-10s%-10s\n", "Degrees", "Radians", "Sine", "Cosine", "Tangent");
        int degrees = 30;
        double radians = Math.toRadians(degrees);
        System.out.printf("%-10d%-10.4f%-10.4f%-10.4f%-10.4f\n", degrees, radians, Math.sin(radians), Math.cos(radians), Math.tan(radians));
        
        degrees = 60;
        radians = Math.toRadians(degrees);
        System.out.printf("%-10d%-10.4f%-10.4f%-10.4f%-10.4f\n", degrees, radians, Math.sin(radians), Math.cos(radians), Math.tan(radians));
    }
}


/*
 * Explanations:

    Reading Strings from the Console:
        input.next() reads the next token (word) from the input.
        input.nextLine() reads the entire line of input.

    Reading a Character from the Console:
        input.nextLine() reads the entire line of input, and sChar.charAt(0) extracts the first character.

    Comparing Strings:
        equals(s1) checks if two strings are exactly the same.
        compareTo(s1) compares strings lexicographically.
        compareToIgnoreCase(s1) performs case-insensitive comparison.

    Obtaining Substrings:
        substring(beginIndex) returns a substring starting from the given index.
        substring(beginIndex, endIndex) returns a substring from beginIndex to endIndex - 1.

    Finding Characters or Substrings:
        indexOf(ch) returns the index of the first occurrence of ch.
        lastIndexOf(ch) returns the index of the last occurrence of ch.

    Conversion Between Strings and Numbers:
        Integer.parseInt(intString) converts a string to an integer.
        Double.parseDouble(doubleString) converts a string to a double.

    Formatting Console Output:
        System.out.printf(format, item1, item2, ..., itemk) 
        formats output based on the provided format specifiers.
        %d is used for decimal integers.
        %f is used for floating-point numbers.
        %s is used for strings.
        %.2f specifies two digits after the decimal point.
        %-8d left-justifies the integer within a field width of 8 characters.
 */