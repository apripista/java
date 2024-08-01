
package chapter_01.part_03.arrays;

public class ArrayCopyExample {
    public static void main(String[] args) {
        // Source array
        int[] sourceArray = {1, 2, 3, 4, 5};

        // Destination array with the same length as source array
        int[] destinationArray = new int[sourceArray.length];

        // Copy elements from source array to destination array
        for (int i = 0; i < sourceArray.length; i++) {
            destinationArray[i] = sourceArray[i];
        }

        // Print the destination array to verify the copy
        System.out.println("Destination array:");
        for (int num : destinationArray) {
            System.out.print(num + " ");
        }
    }
}

/*
 

    This Java program demonstrates how to copy the contents of one array (sourceArray) into another array (destinationArray).
        Source Array:
        The sourceArray contains the original elements that we want to copy.
        Destination Array:
        The destinationArray is created with the same length as the sourceArray to hold the copied elements.
        Copying Elements:
        Using a for loop, each element from the sourceArray is copied to the corresponding index of the destinationArray.
        Printing the Destination Array:
        After copying, the destinationArray is printed to verify that the copy was successful.
    
 */