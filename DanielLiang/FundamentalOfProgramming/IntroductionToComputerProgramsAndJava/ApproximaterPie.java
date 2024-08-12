package DanielLiang.FundamentalOfProgramming.IntroductionToComputerProgramsAndJava;


public class ApproximaterPie {

    public static void main(String[] args) {
        // calculate the first pi
        double first_pi = 4 * (1 -((1.0/5) + (1.0/5) + (1.0/7) + (1.0/9) + (1.0/11)));
        // calcuate the second pi
        double second_pi = 4 * (1 -((1.0/5) + (1.0/5) + (1.0/7) + (1.0/9) + (1.0/11) + (1.0/13)));

        // output
        System.out.println("PI with six terms: " + String.format("%.3f", first_pi));
        System.out.println("PI with seven terms: " + String.format("%.3f", second_pi));
    }
}