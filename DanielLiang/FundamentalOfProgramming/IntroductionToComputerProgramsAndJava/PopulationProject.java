package DanielLiang.FundamentalOfProgramming.IntroductionToComputerProgramsAndJava;

public class PopulationProject {

    public static void main(String[] args) {
        
        // constants
        int expected_time = 5;
        double seconds_per_year = 365 * 24 * 60 * 60;
        double births_per_second = 1.0 / 7;
        double deaths_per_second = 1.0 / 13;
        double immigrants_per_second = 1.0 / 45;

        // events in a year
        double births_per_year = births_per_second * seconds_per_year;
        double deaths_per_year = deaths_per_second * seconds_per_year;
        double immigrants_per_year = immigrants_per_second * seconds_per_year;

         // events in five years
        double births_in_five_year = births_per_year * expected_time;
        double deaths_in_five_year = deaths_per_year * expected_time;
        double immigrants_in_five_year = immigrants_per_year * expected_time;
        double net_population_change_per_year = births_per_year - deaths_per_year + immigrants_per_year;

        double net_population_change_in_next_five_years = net_population_change_per_year * expected_time;

        System.out.println("Birth Population is the next 5 years will be: " + String.format("%.2f", births_in_five_year));
        System.out.println("Deaths Population in the next 5 years will be: " + String.format("%.2f",deaths_in_five_year));
        System.out.println("Immigrants population in the next 5 years will be: " + String.format("%.2f", immigrants_in_five_year));

        // total population in a year and next 5 years
        System.out.println("\nIn one Year Population is Projected to be: " + String.format("%.00f", net_population_change_per_year));
        System.err.println("Total Population in the next 5 Years will be: " + String.format("%.00f", net_population_change_in_next_five_years));
    }
}