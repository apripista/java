package labs.lab_01;

public class SimpleInterestCalculator {
    public static void main(String[] args) {
        // Predefined values
        double principal = 1000.0;
        double rate = 5.0; // 5%
        double time = 2.5; // years

        // Calculate simple interest
        double simpleInterest = (principal * rate * time) / 100;

        // Display the result
        System.out.println("Principal: $" + principal);
        System.out.println("Rate: " + rate + "%");
        System.out.println("Time: " + time + " years");
        System.out.println("Simple Interest: $" + simpleInterest);
    }
}
