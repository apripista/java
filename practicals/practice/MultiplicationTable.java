public class MultiplicationTable {

    public static void main(String[] args) {
        // Print the title of the multiplication table
        System.out.println("                Multiplication Table.");
        
        // Display the number title
        System.out.print("   ");
        for (int j = 1; j <= 7; j++)
           System.out.print("      " + j); // Print column headings

        System.out.println("\n-------------------------------------------------------");   
        
        // Display table body
        for (int i = 1; i <= 7; i++) {
            // Print row number
            System.out.print(i + " | ");
            
            for (int j = 1; j <= 7; j++) {
                // Display the product and align properly
                System.out.printf(" %4d  ", i * j);
            }
            System.out.println(); // Move to the next line for the next row
        }
    }
}

/*
Explanation:
- This program generates and displays a multiplication table for numbers from 1 to 7.
- It first prints the title of the multiplication table.
- Then it prints column headings from 1 to 7.
- Next, it prints a line of hyphens to separate the title from the table body.
- The table body consists of rows and columns representing the multiplication table.
- It iterates over each row and column to calculate and print the product of the row number and column number.
- The printf method is used to ensure proper alignment of the numbers in the table.
- Each row is terminated with a newline character to move to the next row.
- Overall, this program provides a visual representation of the multiplication table for numbers from 1 to 7.
*/
