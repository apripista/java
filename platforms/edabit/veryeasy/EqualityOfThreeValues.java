public class EqualityOfThreeValues {
    public static int equal(int a, int b, int c) {
        if (a == b && b == c) {
            return 3; // All values are equal
        } else if (a == b || b == c || a == c) {
            return 2; // Two values are equal
        } else {
            return 0; // All values are different
        }
    }

    public static void main(String[] args) {
        System.out.println(equal(6, 7, 6)); // Test case: should return 2
        System.out.println(equal(3, 4, 3)); // Test case: should return 2
        System.out.println(equal(1, 1, 1)); // Test case: should return 3
        System.out.println(equal(3, 4, 1)); // Test case: should return 0
    }
}
