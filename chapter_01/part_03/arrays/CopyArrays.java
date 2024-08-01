/*
 * This Java program demonstrates how to copy the contents of one array into another array.
 * 
 * The process of copying arrays involves the following steps:
 * 
 * 1. Declaration and Initialization:
 *    - Declare and initialize the source array with the elements to be copied.
 *    - Declare the target array with the same length as the source array.
 * 
 * 2. Copying Elements from Source to Target:
 *    - Iterate over each index of the source array.
 *    - Copy each element from the source array to the corresponding index of the target array.
 * 
 * 3. Printing the Target Array:
 *    - After copying, print out the elements of the target array to verify the copying process.
 * 
 * Example:
 * 
 *    int[] source = {2, 45, 3, 24};
 *    int[] target = new int[source.length];
 * 
 *    for(int i = 0; i < source.length; i++){
 *        target[i] = source[i];
 *    }
 * 
 *    System.out.println("Target ");
 *    for(int num : target){
 *        System.out.print(num + ", ");
 *    }
 * 
 *    Output: Target 2, 45, 3, 24,
 *    This indicates that the elements from the source array have been successfully copied to the target array.
 */

 package chapter_01.part_03.arrays;

 public class CopyArrays {
 
     public static void main(String[] args) {
         int[] source = {2, 45, 3, 24};
 
         int[] target = new int[source.length];
 
         for(int i = 0; i < source.length; i++){
             target[i] = source[i];
         }
 
         System.out.println("Target ");
         for(int num : target){
             System.out.print(num + ", " );
         }
     }
 }
 