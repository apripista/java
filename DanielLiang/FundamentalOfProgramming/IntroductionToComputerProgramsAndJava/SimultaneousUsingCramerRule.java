package DanielLiang.FundamentalOfProgramming.IntroductionToComputerProgramsAndJava;

public class SimultaneousUsingCramerRule {

    public static void main(String[] args) {
        // values of a, b, c, d, e, and f
        double a = 3.4, b = 50.2, c = 2.1, d = 0.55, e = 44.5, f = 5.9;

        // cramer's rule
        double x = (e * d - b * f) / (a * d - b * c);
        double y = (a * f - e * c) / (a * d - b * c);

        System.out.println("\n\tsimultaneouls Equation using Cramer's rule.\n");

        // simlitaneous expression
        System.out.println("Equation is: ");
        System.out.println("3.4x + 50.2y = 44.5");
        System.out.println("2.1x + 0.55y = 5.9");

        // output value of x and y
        System.out.println("\n\tValue of X: " + String.format("%.2f", x));
        System.out.println("\tValue of Y: " + String.format("%.2f", y));
    }
}