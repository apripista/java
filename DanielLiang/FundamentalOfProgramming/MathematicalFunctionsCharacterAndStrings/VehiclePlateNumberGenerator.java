package DanielLiang.FundamentalOfProgramming.MathematicalFunctionsCharacterAndStrings;

import java.util.Random;

public class VehiclePlateNumberGenerator {

    public static void main(String[] args) {

        // a random object
        Random randomer = new Random();

        // 3 letters
        char firstchar = (char)('A' + randomer.nextInt(26));
        char secondchar = (char)('A' + randomer.nextInt(26));
        char thirdchar = (char)('A' + randomer.nextInt(26));

        // 4 digits
        int digit1 = randomer.nextInt(10);
        int digit2 = randomer.nextInt(10);
        int digit3 = randomer.nextInt(10);
        int digit4 = randomer.nextInt(10);

        // print the plate number
         String plate = "" + firstchar + secondchar + thirdchar + digit1 + digit2 + digit3 + digit4;;
        System.out.println("Plate Number is: " + plate);

    }
}