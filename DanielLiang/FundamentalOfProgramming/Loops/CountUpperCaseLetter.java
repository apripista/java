// package danielliang.fundamentals.loops;

import java.util.Scanner;

public class CountUpperCaseLetter {

    public static void main(String[] args) {
        try (Scanner input = new Scanner(System.in)) {
            System.out.println("\nEnter a String (or enter 'exit' to quit): ");

            while (true) {
                System.out.print("\nEnter a sentence: ");
                String string = input.nextLine();

                if (string.equalsIgnoreCase("exit")) {
                    System.out.print("Exiting the program...");
                    Thread.sleep(2000);
                    break;
                }

                int count = 0;
                StringBuilder uppercaseLetters = new StringBuilder();

                for (int value = 0; value < string.length(); value++) {
                    char character = string.charAt(value);

                    if (Character.isUpperCase(character)) {
                        count++;
                        // Append uppercase letter to StringBuilder
                        uppercaseLetters.append(character).append(" "); 
                    }
                }

                // Display the number of uppercase letters
                System.out.println("The number of uppercase letters is " + count + ".");

                // If there are any uppercase letters, display them
                if (count > 0) {
                    System.out.println("The uppercase letters are: " + uppercaseLetters);
                }
            }
        } catch (Exception e) {
            System.out.println("an error occurred: " + e);
        }
    }
}
