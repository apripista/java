package DanielLiang.FundamentalOfProgramming.MathematicalFunctionsCharacterAndStrings;

public class RandomCharacter {

    public static void main(String[] args) {
        // Generate a random number between 0 and 25
        int randomNumber = (int) (Math.random() * 26);

        // Convert the random number to a character in the range 'A' to 'Z'
        char randomLetter = (char) ('A' + randomNumber);

        // Display the random uppercase letter
        System.out.println("Random uppercase letter: " + randomLetter);
    }
}
