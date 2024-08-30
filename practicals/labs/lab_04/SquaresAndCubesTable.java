package labs.lab_04;

public class SquaresAndCubesTable {

    public static void main(String[] args) {
        System.out.println("");
        System.out.println("Number\t\tSquare\t\tCube");
        // finde square and cubes
        for (int i = 0; i <= 10; i++) {
            int square = i * i;
            int cube = i * i * i;
            System.out.println(i + "\t\t" + square + "\t\t" + cube);
        }
    }
}
