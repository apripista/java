import java.util.Scanner;

public class ArraySumAndAverage {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] arr = new int[5];
        int sum = 0;

        System.out.println("Enter five values:");
        for (int i = 0; i < arr.length; i++) {
            System.out.print("Value " + (i + 1) + ": ");
            arr[i] = scanner.nextInt();
            sum += arr[i];
        }

        double average = sum / (double) arr.length;

        System.out.println("Sum of array elements: " + sum);
        System.out.println("Average of array elements: " + average);

        scanner.close();
    }
}
