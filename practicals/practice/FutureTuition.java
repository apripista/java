public class FutureTuition {

    public static void main(String[] args) {
        // Print a message indicating the purpose of the program
        System.out.println("Future tuition.");

        // Initialize the initial tuition and year variables
        double tuition = 10000; // Initial tuition
        int year = 0; // Initial year

        // Calculate the future tuition until it reaches $20,000
        while (tuition < 20000) {
            // Increase the tuition by 7% annually
            tuition *= 1.07;
            // Increment the year count
            year++;
        }

        // Print the projected tuition when it reaches $20,000
        System.out.println("The tuition will be $" + tuition);
        // Print the number of years it takes for the tuition to double
        System.out.println("The tuition will be doubled in " + year + " years");
    }
}

/*
Explanation:
- This program calculates the number of years it takes for the tuition to double
  assuming an annual increase rate of 7%.
- The initial tuition is $10,000 and the program calculates the tuition for each
  subsequent year until it exceeds $20,000.
- It prints the projected tuition when it reaches $20,000 and the number of years
  it takes for the tuition to double.
- The calculation is done within a while loop.
- Each iteration of the loop increases the tuition by 7% and increments the year count.
- Once the tuition exceeds $20,000, the loop terminates.
*/
