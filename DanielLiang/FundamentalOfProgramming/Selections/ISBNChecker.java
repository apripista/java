package DanielLiang.FundamentalOfProgramming.Selections;

import java.util.Scanner;

public class ISBNChecker {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // user prompt to enter the first 9 digits of the ISBN as integer
        System.out.print("Enter the first 9 digits of an ISBN as integer: ");
        int firstNineDigits = scanner.nextInt();

        // calculate the checksum
        int checksum = 0;
        int remainingDigits = firstNineDigits;
        for (int i = 9; i >= 1; i--) {
            int digit = remainingDigits % 10;
            checksum += digit * i;
            remainingDigits /= 10;
        }
        
        checksum %= 11;

        // determine the last digit of the ISBN
        char lastDigit;
        if (checksum == 10) {
            lastDigit = 'X';
        } else {
            lastDigit = (char)('0' + checksum);
        }

        // display the 10-digit ISBN
        System.out.println("The ISBN-10 number is " + firstNineDigits + lastDigit);

        // close the scanner
        scanner.close();
    }
}
