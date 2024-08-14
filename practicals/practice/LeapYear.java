import java.util.Scanner;

public class LeapYear {

    public static void main(String[] args){
        try (Scanner input = new Scanner(System.in)) {
            System.out.print("Enter a year: ");
            int year = input.nextInt();

            // Check if the year is a leap year
            
            boolean isLeapYear =
            (year % 4 == 0 && year % 100 != 0) || (year % 400 == 0);
            // Display the result
            System.out.println(year + " is a leap year? " + isLeapYear);
        }
    }
}

/*
    This program determines whether 
    a given year is a leap year based on user input.
    It prompts the user to enter a year, reads the input, 
    and then checks if the enteredyear is a leap year according 
    to the leap year rules.

    The main method handles user input by 
    reading the year entered by the user and then
    calls the isLeapYear method to determine if it's a leap year. 
    Finally, it displaysthe result to the user.

    The isLeapYear method takes an integer 
    year as input and returns a boolean value
    indicating whether the year is a leap year or not. 
    It implements the leap year calculation logic using 
    conditional expressions.

    Overall, this program demonstrates 
    how to determine leap years based on certain
    criteria and interact with users to check if a given year is a leap year.

 */