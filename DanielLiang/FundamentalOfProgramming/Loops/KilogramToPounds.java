public class KilogramToPounds {

    public static void main(String[] args) {
        System.out.println("\tkilograms\t\tpounds");
        System.out.println("-----------------------------------------");
        for(int kilogram = 1; kilogram <= 199; kilogram +=2){
            double pound = kilogram * 2.2;
        
            String formattedPound = String.format("%.1f", pound);
        System.out.println("\t" + kilogram + "\t\t" + formattedPound + " \t");
        }
    }
}