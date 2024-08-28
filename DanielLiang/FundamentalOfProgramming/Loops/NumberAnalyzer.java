import java.util.Scanner;

public class NumberAnalyzer {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int positiveCount = 0;
        int negativeCount = 0;
        int total = 0;
        int count = 0;

        System.out.print("Enter an integer, the input ends if it is 0: ");

        while (true) {
            int num = scanner.nextInt();

            if (num == 0) {
                break;
            } else if (num > 0) {
                positiveCount++;
            } else {
                negativeCount++;
            }

            total += num;
            count++;
        }

        if (count == 0) {
            System.out.println("No numbers are entered except 0");
        } else {
            System.out.println("The number of positives is " + positiveCount);
            System.out.println("The number of negatives is " + negativeCount);
            System.out.println("The total is " + total);
            System.out.println("The average is " + ((double) total / count));
        }

        scanner.close();
    }
}
