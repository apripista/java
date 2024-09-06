public class BasicCalculator {
    public static int calculator(int num1, char operator, int num2) {

        // Handle division by zero
        if (operator == '/' && num2 == 0) {
            return 0;
        }

        // Switch case to handle different operations
        switch (operator) {
            case '+':
                return num1 + num2;
            case '-':
                return num1 - num2;
            case '*':
                return num1 * num2;
            case '/':
                return num1 / num2;
            default:
                throw new IllegalArgumentException("Invalid operator");
        }
    }

    public static void main(String[] args) {
        System.out.println(calculator(2, '+', 6)); // 8
        System.out.println(calculator(2, '-', 6)); // -4
        System.out.println(calculator(2, '*', 6)); // 12
        System.out.println(calculator(2, '/', 6)); // 0
    }
}
