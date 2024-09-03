// package DanielLiang.fundamentals.V;

import java.util.Scanner;

public class CountVowelsAndConsonants {

    public static void main(String[] args) {
        try (Scanner input = new Scanner(System.in)) {
                while (true) {
                    System.out.print("\nEnter a String: ");
                    String string = input.nextLine();

                    if(string.equalsIgnoreCase("exit")){
                        System.out.print("Exiting..");
                        Thread.sleep(2000);
                        break;
                    }
                    int vowelcount = 0;
                    int consonantcount = 0;

                    for (int value = 0; value < string.length(); value++){
                        char character = Character.toLowerCase(string.charAt(value));

                        if (character >= 'a' && character <= 'z' ) {
                            if (character == 'a' || character == 'e' || character == 'i' || character == 'o' || character == 'u') {
                                vowelcount++;
                            }else{
                                consonantcount++;
                            }
                        }
                    }
                    System.out.println("The number of vowels is " + vowelcount);
                    System.out.println("The number of consonants is " + consonantcount);
            
                }
            }catch (Exception e) {
                System.err.println("an error occurred: " + e);
        }
    }
}