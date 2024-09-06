package DanielLiang.FundamentalOfProgramming.Selections;

import java.util.Scanner;

public class PalindromeNumber {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // user prompt to enter a three-digit integer
        System.out.print("Enter a three-digit integer: ");
        int number = scanner.nextInt();

        // extract digits
        int firstDigit = number / 100;
        int lastDigit = number % 10;

        // check if it's a palindrome
        if (firstDigit == lastDigit) {
            System.out.println(number + " is a palindrome");
        } else {
            System.out.println(number + " is not a palindrome");
        }

        // close the scanner
        scanner.close();
    }
}
