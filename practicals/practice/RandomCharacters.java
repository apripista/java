import java.util.Random;

public class RandomCharacters {

    public static void main(String[] args) {
        int first = getRandNumber();
        int second = getRandNumber();
        char charone = getRandChar();
        char chartwo = getRandChar();
        char larger = GetRandChar();
        char another_lager = GetRandChar();
        char specialChar = getRandomSpecialChar();

        // combine random number, characters, and special character
        String strings = "" + another_lager + first + specialChar + charone + chartwo + larger + second;

        // Print the string of the random numbers, characters, and special character
        System.out.println("Random Number is: " + strings);
    }

    public static int getRandNumber() {
        Random random = new Random();
        return random.nextInt(10); // generate random number from 0 to 9
    }

    public static char getRandChar() {
        Random random = new Random();
        return (char) ('a' + random.nextInt(26)); // random letter from a to z
    }

    public static char GetRandChar() {
        Random random = new Random();
        return (char) ('A' + random.nextInt(26)); // random letters from A to Z
    }

    public static char getRandomSpecialChar() {
        Random random = new Random();
        char[] specialChars = {'*', '.', '>', '?', '_', '+', '{', '$', '#', '@'};
        return specialChars[random.nextInt(specialChars.length)]; // random special character
    }
}


/*
    This program generates a random string containing a combination of numbers, lowercase and uppercase letters, 
    and special characters. It demonstrates the use of the java.util.Random class to generate random values.

    The main method initializes several variables by calling various methods:
        - Two random integers (first and second) are generated using the getRandNumber method.
        - Two random lowercase letters (charone and chartwo) are generated using the getRandChar method.
        - Two random uppercase letters (larger and another_lager) are generated using the GetRandChar method.
        - One random special character (specialChar) is generated using the getRandomSpecialChar method.

    These random values are then combined into a single string, 'strings', in a specific order:
        - Another_lager (uppercase letter)
        - First (random number)
        - SpecialChar (random special character)
        - Charone (lowercase letter)
        - Chartwo (lowercase letter)
        - Larger (uppercase letter)
        - Second (random number)

    Finally, the program prints out the generated random string.

    Methods:
    - getRandNumber(): Generates a random number between 0 and 9.
    - getRandChar(): Generates a random lowercase letter between 'a' and 'z'.
    - GetRandChar(): Generates a random uppercase letter between 'A' and 'Z'.
    - getRandomSpecialChar(): Selects a random special character from a predefined array of special characters.
*/
