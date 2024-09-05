package labs.lab_01;

public class MarksCalculator {
    public static void main(String[] args) {
        // Predefined marks for 5 subjects
        int subject1Marks = 85;
        int subject2Marks = 90;
        int subject3Marks = 75;
        int subject4Marks = 80;
        int subject5Marks = 95;

        // Calculate total marks
        int totalMarks = subject1Marks + subject2Marks + subject3Marks + subject4Marks + subject5Marks;

        // Calculate percentage
        double percentage = (totalMarks * 100.0) / (5 * 100.0);

        // Display the results
        System.out.println("Marks in Subject 1: " + subject1Marks);
        System.out.println("Marks in Subject 2: " + subject2Marks);
        System.out.println("Marks in Subject 3: " + subject3Marks);
        System.out.println("Marks in Subject 4: " + subject4Marks);
        System.out.println("Marks in Subject 5: " + subject5Marks);
        System.out.println("Total Marks: " + totalMarks);
        System.out.println("Percentage: " + percentage + "%");
    }
}
