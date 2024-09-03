public class MinMaxInArray {
    public static void main(String[] args) {
        float[] numbers = {50, 10, 20, 60, 120, 90};
        float min = numbers[0];
        float max = numbers[0];

        for (int i = 1; i < numbers.length; i++) {
            if (numbers[i] < min) {
                min = numbers[i];
            }
            if (numbers[i] > max) {
                max = numbers[i];
            }
        }

        System.out.println("Smallest element: " + min);
        System.out.println("Largest element: " + max);
    }
}

