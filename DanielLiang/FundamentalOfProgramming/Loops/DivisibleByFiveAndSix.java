public class DivisibleByFiveAndSix {

    public static void main(String[] args) {
        final int NUMS_PER_LINE = 10;
        int count = 0;

        for (int num = 100; num <= 1000; num++) {
            if (num % 5 == 0 && num % 6 == 0) {
                System.out.print(num + " ");
                count++;

                if (count % NUMS_PER_LINE == 0)
                    System.out.println();
            }
        }
    }
}
