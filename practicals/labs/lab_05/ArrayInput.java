import java.util.Scanner;

public class ArrayInput {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] arr = new int[5];

        System.out.println("Enter five values:");
        for (int i = 0; i < arr.length; i++) {
            System.out.print("Value " + (i + 1) + ": ");
            arr[i] = scanner.nextInt();
        }

        System.out.println("Values in the array:");
        for (int value : arr) {
            System.out.print(value + " ");
        }

        scanner.close();
    }
}
