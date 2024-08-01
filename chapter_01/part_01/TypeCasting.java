package chapter_01.part_01;

public class TypeCasting{
    public static void main(String[] args) {
        // Implicit Casting (Widening Conversion)
        int intValue = 10;
        double doubleValue = intValue; // Implicitly converts int to double
        System.out.println("Implicit Casting (Widening Conversion): " + doubleValue);

        // Explicit Casting (Narrowing Conversion)
        double doubleNum = 10.5;
        int intNum = (int) doubleNum; // Explicitly converts double to int
        System.out.println("Explicit Casting (Narrowing Conversion): " + intNum);

        // Example of Possible Loss of Information
        int largeNum = 1000;
        byte smallNum = (byte) largeNum; // Explicitly converts int to byte (possible loss of information)
        System.out.println("Example of Possible Loss of Information: " + smallNum);
    }
}
