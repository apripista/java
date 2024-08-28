public class ConversionTablesMilesToKm {

    public static void main(String[] args) {
        System.out.println("Miles\t\tKilometers\t|\t\tKilometers\t\tMiles");
        System.out.println("---------------------------------------------------------------|--------------------------");
        for (int miles = 1, km = 2; miles <= 10 && km <= 65; miles++, km += 5) {
            double kmToMiles = km / 1.609;
            double milesToKm = miles * 1.609;
            System.out.printf("%-9d\t%-12.3f\t|\t%-12d\t\t%-9.3f\n", miles, milesToKm, km, kmToMiles);
        }
    }
}
