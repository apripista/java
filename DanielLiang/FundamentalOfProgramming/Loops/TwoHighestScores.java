import java.util.Scanner;

public class TwoHighestScores {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the number of students: ");
        int numStudents = scanner.nextInt();
        scanner.nextLine(); // Consume newline character

        String highestScorer = "";
        double highestScore = Double.MIN_VALUE;
        String secondHighestScorer = "";
        double secondHighestScore = Double.MIN_VALUE;

        for (int i = 0; i < numStudents; i++) {
            System.out.print("Enter student's name: ");
            String name = scanner.nextLine();
            System.out.print("Enter student's score: ");
            double score = scanner.nextDouble();
            scanner.nextLine(); // Consume newline character

            if (score > highestScore) {
                secondHighestScore = highestScore;
                secondHighestScorer = highestScorer;
                highestScore = score;
                highestScorer = name;
            } else if (score > secondHighestScore) {
                secondHighestScore = score;
                secondHighestScorer = name;
            }
        }

        System.out.println("Student with the highest score: " + highestScorer);
        System.out.println("Student with the second highest score: " + secondHighestScorer);
    }
}
