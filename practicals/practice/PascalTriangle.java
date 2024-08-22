import java.util.Scanner;

public class PascalTriangle {

    public static void main(String[] args) {
        try (Scanner input = new Scanner(System.in)) {
            System.out.print("Enter the number of rows for Pascal's triangle: ");
            int numRows = input.nextInt();

            // Calculate the number of digits in the last number of the triangle
            int lastNumber = 1;
            for (int i = 1; i <= numRows; i++) {
                lastNumber *= 2;
            }
            int numDigits = String.valueOf(lastNumber).length();

            // Generate Pascal's triangle
            for (int i = 0; i < numRows; i++) {
                int number = 1;
                // Print spaces to center the triangle
                for (int j = 0; j < (numRows - i - 1) * (numDigits / 2); j++) {
                    System.out.print(" ");
                }
                // Calculate and print each number in the current row
                for (int j = 0; j <= i; j++) {
                    // Calculate the number using combination formula: nCr = n! / (r! * (n-r)!)
                    System.out.printf("%" + numDigits + "d ", number);
                    number = number * (i - j) / (j + 1);
                }
                System.out.println();
            }
        }
    }
}

/*
Explanation:
- This program generates Pascal's triangle up to a specified number of rows.
- It prompts the user to enter the number of rows for Pascal's triangle.
- It calculates the number of digits in the last number of the triangle to properly align the triangle.
- It generates each row of Pascal's triangle using the combination formula: nCr = n! / (r! * (n-r)!).
- The outer loop iterates over each row, and the inner loop calculates and prints each number in the current row.
- It prints spaces to center the triangle by adjusting the number of spaces based on the number of digits in the last number.
- Overall, this program generates and prints Pascal's triangle with proper alignment based on the specified number of rows.
*/
