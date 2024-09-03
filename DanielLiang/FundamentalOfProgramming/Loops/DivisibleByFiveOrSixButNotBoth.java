public class DivisibleByFiveOrSixButNotBoth {

    public static void main(String[] args) {
        final int NUMS_PER_LINE = 10;
        int count = 0;

        System.out.println("Numbers divisible by 5 or 6, but not both, from 100 to 200:");

        for (int num = 100; num <= 200; num++) {
            if ((num % 5 == 0 || num % 6 == 0) && !(num % 5 == 0 && num % 6 == 0)) {
                System.out.print(num + " ");
                count++;

                if (count % NUMS_PER_LINE == 0)
                    System.out.println();
            }
        }
    }
}