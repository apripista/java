package DanielLiang.FundamentalOfProgramming.Selections;

public class RandomPoint {
    public static void main(String[] args) {
        // generate random coordinates
        // random x-coordinate in the range [-50, 50]
        double x = Math.random() * 100 - 50;

        // random y-coordinate in the range [-100, 100]
        double y = Math.random() * 200 - 100; 
        
        // display the random coordinate
        System.out.println("Random coordinate: (" + x + ", " + y + ")");
    }
}
