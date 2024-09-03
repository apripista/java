package labs.lab_01;

public class SwapNumbersWithoutThirdVariable {
    public static void main(String[] args) {
        // Predefined values for two numbers
        int number1 = 10;
        int number2 = 20;

        // Display original values
        System.out.println("Before swapping:");
        System.out.println("Number 1: " + number1);
        System.out.println("Number 2: " + number2);

        // Swapping without using a third variable
        number1 = number1 + number2;
        number2 = number1 - number2;
        number1 = number1 - number2;

        // Display swapped values
        System.out.println("\nAfter swapping:");
        System.out.println("Number 1: " + number1);
        System.out.println("Number 2: " + number2);
    }
}
