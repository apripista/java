package labs.lab_01;

public class ReverseNumber {
    public static void main(String[] args) {
        // Predefined value for the number to be reversed
        int number = 12345;
        
        // Display the original number
        System.out.println("Original number: " + number);
        
        // Call the reverseNumber method and display the result
        int reversedNumber = reverseNumber(number);
        System.out.println("Reversed number: " + reversedNumber);
    }

    // Method to reverse the given number
    public static int reverseNumber(int num) {
        int reversedNum = 0;
        
        while (num != 0) {
            int digit = num % 10;
            reversedNum = reversedNum * 10 + digit;
            num /= 10;
        }
        
        return reversedNum;
    }
}
