public class FutureTuition {

    public static void main(String[] args) {
        double tuition = 10000;
        double increaseRate = 0.05; // 5% increase rate

        // Calculate tuition for ten years
        for (int year = 1; year <= 10; year++) {
            tuition *= (1 + increaseRate);
            System.out.printf("Year %d: $%.2f\n", year, tuition);
        }

        // Calculate total cost of four years' worth of tuition after the tenth year
        double totalCost = 0;
        for (int i = 0; i < 4; i++) {
            tuition *= (1 + increaseRate);
            totalCost += tuition;
        }
        System.out.printf("Total cost of four years' worth of tuition after the tenth year: $%.2f\n", totalCost);
    }
}
