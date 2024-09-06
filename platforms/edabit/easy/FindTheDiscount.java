public class FindTheDiscount {
    public static double discount(int price, int percentage) {
        // Calculate the discount in double to handle decimal values
        double discount_per = (double) percentage / 100;
        double discount_amount = price * discount_per;
        double final_price = price - discount_amount;
        return final_price;
    }

    public static void main(String[] args) {
        // Print to see the results
        System.out.println("Final sale is: " + discount(1500, 50));  // 750.0
        System.out.println("Final sale is: " + discount(89, 20));    // 71.2
        System.out.println("Final sale is: " + discount(100, 75));   // 25.0
    }
}
