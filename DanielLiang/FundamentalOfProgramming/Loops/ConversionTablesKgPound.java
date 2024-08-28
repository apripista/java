public class ConversionTablesKgPound {

    public static void main(String[] args) {
        System.out.println("Kilograms\t\tPounds\t\t|\t\tPounds\t\tKilograms");
        System.out.println("----------------------------------------------------------|----------------------------------------------------------");
        for (int kilogram = 1, pound = 2; kilogram <= 199 && pound <= 515; kilogram += 2, pound += 5) {
            double poundToKg = pound / 2.2;
            double kgToPound = kilogram * 2.2;
            System.out.printf("%-9d\t\t%-9.1f\t|\t\t%-9d\t\t%-9.2f\n", kilogram, kgToPound, pound, poundToKg);
        }
    }
}
