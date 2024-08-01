package arrays;
// MULT DIMENSIONAL ARRAYS
//
//A multidimensional array in Java is an array that contains other arrays as its elements. Unlike a
// one-dimensional array, which represents a list of elements in a single line, a multidimensional array represents a
// tabular or grid-like structure where elements are organized into rows and columns, or even deeper levels of nesting
// in the case of three-dimensional or higher-dimensional arrays.
//Creation of Multidimensional Arrays:
//
//You can create a multidimensional array by using nested square brackets [][] to specify the dimensions. For example:
//
//int[][] matrix = {
//    {1, 2, 3},  // First row
//    {4, 5, 6},  // Second row
//    {7, 8, 9}   // Third row
//};
//
//This creates a 2D array (matrix) with 3 rows and 3 columns.

//Accessing Elements:
//To access an element in a multidimensional array, you use multiple indices. For example,
// to access the element in the second row and third column of the matrix:
//
//int element = matrix[1][2]; // Accessing the element at row 2, column 3 (value: 6)
//
//Differences from One-Dimensional Arrays:
//
//    Structure: Multidimensional arrays have a hierarchical structure, with each level representing a dimension.
//    Initialization: Initializing a multidimensional array requires nested
//    curly braces to specify the elements for each dimension.
//    Accessing Elements: Accessing elements requires specifying indices for each dimension.
//    Memory Allocation: Elements of a multidimensional array are stored in contiguous memory locations,
//    similar to one-dimensional arrays, but with additional levels of indexing.
//
//Advantages:
//
//    Structured Data: Multidimensional arrays provide a convenient way to represent structured data, such as matrices or tables.
//    Efficient Access: Accessing elements using indices allows for efficient retrieval and manipulation of data.
//
//Disadvantages:
//
//    Fixed Size: Like one-dimensional arrays, multidimensional arrays
//    have a fixed size once created, which can be restrictive if the size needs to change dynamically.
//    Complexity: Dealing with multiple dimensions can increase the complexity of code,
//    especially when iterating over elements.
//
//Overall, multidimensional arrays are useful for representing structured data and organizing elements
// in a tabular format, but they require careful management of indices and dimensions.

public class MultdimensionalArray {
    public static void main(String[] args){
        // Creating a two-dimensional array (matrix)
        int[][] matrix = {
                {1, 2, 3},  // First row
                {4, 5, 6},  // Second row
                {7, 8, 9}   // Third row
        };

        // Printing the values of the matrix
        System.out.println("Values of the matrix:");
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println(); // Move to the next line after printing each row
        }

        // Accessing elements in the multidimensional array
        int element1 = matrix[1][2]; // Accessing the element at the second row and third column (6)
        System.out.println("Value at matrix[1][2]: " + element1);

        // Modifying elements in the multidimensional array
        matrix[0][0] = 10; // Modifying the element at the first row and first column to 10
        System.out.println("Modified value at matrix[0][0]: " + matrix[0][0]);

        // Creating a three-dimensional array
        int[][][] threeDArray = {
                {
                        {1, 2, 3},  // First row of the first "layer"
                        {4, 5, 6}   // Second row of the first "layer"
                },
                {
                        {7, 8, 9},  // First row of the second "layer"
                        {10, 11, 12} // Second row of the second "layer"
                }
        };

        // Printing the values of the three-dimensional array
        System.out.println("Values of the three-dimensional array:");
        for (int i = 0; i < threeDArray.length; i++) {
            for (int j = 0; j < threeDArray[i].length; j++) {
                for (int k = 0; k < threeDArray[i][j].length; k++) {
                    System.out.print(threeDArray[i][j][k] + " ");
                }
                System.out.println(); // Move to the next line after printing each "layer"
            }
            System.out.println(); // Add a blank line after printing each "layer"
        }

        // Accessing elements in the three-dimensional array
        int element2 = threeDArray[1][0][2]; // Accessing the element at the second "layer", first row, and third column (9)
        System.out.println("Value at threeDArray[1][0][2]: " + element2);
    }
}
