package chapter_01.part_03.arrays;

// ARRAY IN JAVA.
/*
In Java, an array is a data structure that allows you to store a fixed-size sequence of elements of the same type.
It provides a convenient way to group multiple variables of the same type under a single name. Arrays are used to store
multiple values in a single variable, instead of declaring separate variables for each value.
Each element in the array is accessed by its index, which is an integer value indicating its position within the array.

Here are some key points about arrays in Java:
- Fixed Size: Once an array is created, its size cannot be changed.
- Homogeneous Elements: All elements in an array must be of the same data type.
- Indexed Access: Elements in an array are accessed using zero-based indices.
- Contiguous Memory Allocation: Elements in an array are stored in contiguous memory locations.
- Length Property: Arrays in Java have a length property that returns the number of elements in the array.
*/

public class Arrays {
    @SuppressWarnings("unused")
    public static void main(String[] args){
        // Creating an array of strings and initializing it with values
        String[] cars = {"BMW", "Volvo", "Ferrari", "Mazda", "Toyota", "Jaguar", "Ford"};

        // Accessing and printing the first element of the array
        System.out.println(cars[0]); // Outputs BMW because BMW is at index 0 which is the first element in this array.

        // Accessing and printing the fourth element of the array
        System.out.println(cars[3]); // Outputs Mazda.

        // Changing the value of the fourth element in the array
        cars[3] = "Opel";
        System.out.println(cars[3]); // Outputs Opel instead of Mazda

        // Printing the length of the array
        System.out.println("Length of 'cars' array: " + cars.length); // Output 7. As the array has 7 items

        // Creating an array of integers and accessing elements by index
        int[] numbers = {1, 2, 3, 4, 5};
        int thirdElement = numbers[2]; // Accessing the third element (index 2)

        // Printing the length of the integer array
        System.out.println("Length of 'numbers' array: " + numbers.length); // Output the length of the array

        // Iterating through the integer array using a for loop
        System.out.println("Iterating through 'numbers' array using for loop:");
        for (int i = 0; i < numbers.length; i++) {
            System.out.println("Element at index " + i + ": " + numbers[i]);
        }

        // Iterating through the integer array using a for-each loop
        System.out.println("Iterating through 'numbers' array using for-each loop:");
        for (int num : numbers) {
            System.out.println(num);
        }

        // Creating arrays of different data types
        boolean[] flags = {true, false, true}; // Array of booleans
        double[] prices = {10.99, 20.50, 15.75}; // Array of doubles
        System.out.println("Second price in 'prices' array: " + prices[1]); // Outputs 20.50

        // Initializing an empty array of integers
        int[] emptyArray = new int[3];
        System.out.println("First element of 'emptyArray': " + emptyArray[0]); // Outputs 0 (default value)
        // Assigning values to the empty array
        emptyArray[0] = 10;
        emptyArray[1] = 20;
        emptyArray[2] = 30;
        System.out.println("Second element of 'emptyArray': " + emptyArray[1]); // Outputs 20

        // Multi-dimensional arrays
        int[][] matrix = {{1, 2, 3}, {4, 5, 6}, {7, 8, 9}};
        System.out.println("Element at [1][2] in 'matrix' array: " + matrix[1][2]); // Outputs 6

        // Array of strings with different lengths
        String[] fruits = new String[3];
        fruits[0] = "Apple";
        fruits[1] = "Banana";
        fruits[2] = "Orange";
        System.out.println("Length of 'fruits' array: " + fruits.length); // Outputs 3
    }
}
