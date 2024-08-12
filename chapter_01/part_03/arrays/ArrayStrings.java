package arrays;

/*
The import statement import java.util.Arrays; is necessary to bring the Arrays class into your program's scope.
The Arrays class is a utility class provided by the Java standard library (java.util package) that contains several
static methods for working with arrays. In this particular example, we use the Arrays.toString() method from the Arrays
class to convert the array friends into a human-readable string representation, which includes the contents of the array
Without importing java.util.Arrays, the compiler wouldn't recognize the Arrays class, and you would get a compilation
error when you try to use Arrays.toString().

By importing java.util.Arrays, you make the Arrays class available in your code, allowing you to call its
static methodswithout qualifying them with the class name (Arrays). This makes your code more concise and readable.

 */


import java.util.Arrays;

public class ArrayStrings {
    public static void main(String[] args){
        String[] friends = {"perfect", "perfumes", "son"};
        System.out.println(Arrays.toString(friends));
        System.out.println(friends); // output memory reference

        System.out.println("\n My really friend is called: " + friends[0]);
    }
}


/*
When you directly print an array in Java using
System.out.println(), it doesn't print the content of the array but instead prints the object reference.

To print the contents of the array, you need to loop through
 the elements and print them individually or use Arrays.toString() method.

This will print:
[perfect, perfumes, son]

In this modified code, Arrays.toString(friends) converts the array friends
into a human-readable string representation which includes the contents of the array.
 */