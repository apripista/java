public class LargestNForCube {

    public static void main(String[] args) {
        int n = 1;
        while (n * n * n <= 12000) {
            n++;
        }
        // decrement n by 1 to get the largest integer
        n--;
        System.out.println("The largest integer n such that n^3 is less than 12,000 is: " + n);
    }
}
