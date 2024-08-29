import java.util.Scanner;

public class HighestScore {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the number of students: ");
        int numStudents = scanner.nextInt();
        scanner.nextLine(); // Consume newline character

        String highestScorer = "";
        double highestScore = Double.MIN_VALUE;

        for (int i = 0; i < numStudents; i++) {
            System.out.print("Enter student's name: ");
            String name = scanner.nextLine();
            System.out.print("Enter student's score: ");
            double score = scanner.nextDouble();
            scanner.nextLine(); // Consume newline character

            if (score > highestScore) {
                highestScore = score;
                highestScorer = name;
            }
        }

        System.out.println("\nStudent with the highest score: " + highestScorer);
    }
}
