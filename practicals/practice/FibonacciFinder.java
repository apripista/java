import java.util.Scanner;

public class FibonacciFinder {

    @SuppressWarnings("resource")
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Prompt user for the starting and ending positions
        System.out.print("Enter the starting position: ");
        int startting_position = input.nextInt();

        System.out.print("Enter the ending position: ");
        int ending_position = input.nextInt();

        // starting position is less than the ending position
        if (startting_position > ending_position) {
            System.out.println("Error: The starting position should be less than or equal to the ending position.");
            return; // Exit the program if there's an error
        }

        // generate fibonacci
        // numbers till the ending position
        int prev = 0;
        int current = 1;
        int fibCount = 2; 

        System.out.println("Fibonacci numbers from position " + startting_position + " to " + ending_position + ":");
        System.out.print(prev + " "); // Print the first Fibonacci number
        while (fibCount <= ending_position) {
            if (fibCount >= startting_position) {
                System.out.print(current + " ");
            }

            int next = prev + current;
            prev = current;
            current = next;
            fibCount++;
        }

        // Close the scanner object
        input.close();
    }
}
