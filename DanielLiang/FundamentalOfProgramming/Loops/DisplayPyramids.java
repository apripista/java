import java.util.Scanner;

public class DisplayPyramids {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        // enter the number of lines
        System.out.print("Enter the number of lines (1 to 15): ");
        int n = scanner.nextInt();
        
        // input validation
        if (n < 1 || n > 15) {
            System.out.println("Please enter an integer between 1 and 15.");
        }
        
        // creating a pyramids
        for (int i = 0; i < n; i++) {
            // Print leading spaces
            for (int k = 0; k < n - i - 1; k++) {
                System.out.print("  ");
            }
            
            int number = 1;
            for (int j = 0; j <= i; j++) {
                System.out.print(number + "   ");
                
                // calculating the next number in the row
                number = number * (i - j) / (j + 1);
            }
            System.out.println();
        }
        
        scanner.close();
    }
}
