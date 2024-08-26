import java.util.*;

public class NthTermsInArithmenticSequences {

    public static void main(String[] args) {
        // Creating a Scanner object to store user input
        Scanner input = new Scanner(System.in);

        // User prompts for the first term and common difference
        System.out.print("What is the first term: ");
        double first_term = input.nextDouble();

        System.out.print("Common difference: ");
        double common_difference = input.nextDouble();
        
        // Prompt for the nth term to be calculated
        System.out.print("What nth term do you need to calculate: ");
        double nth_term = input.nextDouble();

        // Calculating the nth term using the formula:
        // nth_term = first_term + (n - 1) * common_difference
        double nth = first_term + (nth_term - 1) * common_difference;

        // Displaying the result
        System.out.println("The " + nth_term + "th term is: " + nth);

        // Closing the Scanner object to prevent resource leak
        input.close();
    }
}
