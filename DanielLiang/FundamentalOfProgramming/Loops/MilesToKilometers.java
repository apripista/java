public class MilesToKilometers {

    public static void main(String[] args) {
        System.out.println("\tmiles\t\t\tkilometers");
        for(int miles = 1; miles <= 10; miles++){
            double kilometers = miles * 1.609;

            String formatedkilometers = String.format("%.3f", kilometers);
            System.out.println("\t" + miles + " \t\t\t" + formatedkilometers );
        }
    }
}