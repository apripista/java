package DanielLiang.FundamentalOfProgramming.Selections;

import java.util.Scanner;

public class SortThreeNumbers {

    public static void main(String[] args) {
        try (Scanner input = new Scanner(System.in)) {
            // user prompt for three numbers
            System.out.print("Enter three integers: ");
            int first_number = input.nextInt();
            int second_number = input.nextInt();
            int third_number = input.nextInt();

            // sort the integers
            // in non-decreasing order
            int temp;
            if (first_number > second_number) {
                temp = first_number;
                first_number = second_number;
                second_number = temp;
            }
            if (second_number > third_number) {
                temp = second_number;
                second_number = third_number;
                third_number = temp;
            }
            if (first_number > second_number) {
                temp = first_number;
                first_number = second_number;
                second_number = temp;
            }

            // display the sorted integers
            System.out.println("The integers in non-decreasing order are: " + first_number + " " + second_number + " " + third_number);
        
        }catch (Exception e) {
            System.err.println("An error Occurred" + e);
        }
        
    }
}
