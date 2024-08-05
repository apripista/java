// RANDOM CHARACTERS INTEGERS, SMALL LETTERS AND CAPITAL LETTERS.

import java.util.Random;

public class CombinedRandomCharacterGenerator {

    // Method to generate a random lowercase letter
    public static char getRandomLowerCaseLetter() {
        Random rand = new Random();
        return (char) ('a' + rand.nextInt(26)); // ASCII value of 'a' is 97
    }

    // Method to generate a random uppercase letter
    public static char getRandomUpperCaseLetter() {
        Random rand = new Random();
        return (char) ('A' + rand.nextInt(26)); // ASCII value of 'A' is 65
    }

    // Method to generate a random digit character
    public static char getRandomDigitCharacter() {
        Random rand = new Random();
        return (char) ('0' + rand.nextInt(10)); // ASCII value of '0' is 48
    }

    public static void main(String[] args) {
        // Generate and combine 2 random uppercase letters
        StringBuilder combinedChars = new StringBuilder();
        for (int i = 0; i < 2; i++) {
            combinedChars.append(getRandomUpperCaseLetter());
        }

        // Generate and combine 3 random digits
        for (int i = 0; i < 3; i++) {
            combinedChars.append(getRandomDigitCharacter());
        }

        // Generate and combine 2 random lowercase letters
        for (int i = 0; i < 2; i++) {
            combinedChars.append(getRandomLowerCaseLetter());
        }

        // Print the combined random characters
        System.out.println("Combined random characters: " + combinedChars.toString());
    }
}

/*
    This program generates a combination of random characters consisting of 2 uppercase letters,
    3 digits, and 2 lowercase letters. It then combines these characters into a single string
    and prints the result.

    The getRandomUpperCaseLetter method generates a random uppercase letter using ASCII values,
    getRandomDigitCharacter generates a random digit character, and getRandomLowerCaseLetter
    generates a random lowercase letter. These methods are called to generate the required
    characters, and the StringBuilder class is used to concatenate them into a single string.

    The main method orchestrates the generation of random characters, combining them into
    a single line, and printing the result.
*/
