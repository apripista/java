public class AnyPrimeNumberInRange {
    // Helper function to check if a number is prime
    public static boolean isPrime(int num) {
        if (num <= 1) {
            return false;  // Numbers 0 and 1 are not prime
        }
        for (int i = 2; i * i <= num; i++) {
            if (num % i == 0) {
                return false;  // If divisible by any number other than 1 and itself, not prime
            }
        }
        return true;  // Prime number
    }
 
    // Function to check if there's any prime number in the range
    public static boolean PrimeNumberInRange(int n1, int n2) {
        for (int i = n1; i <= n2; i++) {
            if (isPrime(i)) {
                return true;  // Return true if any prime number is found in the range
            }
        }
        return false;  // Return false if no prime numbers are found
    }

    public static void main(String[] args) {
        // Test cases
        System.out.println(PrimeNumberInRange(10, 15));  // Output: true (prime numbers: 11, 13)
        System.out.println(PrimeNumberInRange(62, 66));  // Output: false (no prime numbers)
        System.out.println(PrimeNumberInRange(3, 5));    // Output: true (prime numbers: 3, 5)
    }
}
