package labs.lab_01;

public class GrossSalaryCalculator {
    public static void main(String[] args) {
        // Predefined values
        double basicSalary = 5000.0;
        double hraPercentage = 10.0; // 10%
        double daPercentage = 8.0;   // 8%
        double taPercentage = 5.0;   // 5%
        
        // Calculate HRA, DA, TA
        double hra = (hraPercentage / 100) * basicSalary;
        double da = (daPercentage / 100) * basicSalary;
        double ta = (taPercentage / 100) * basicSalary;
        
        // Calculate gross salary
        double grossSalary = basicSalary + hra + da + ta;
        
        // Display the results
        System.out.println("Basic Salary: $" + basicSalary);
        System.out.println("HRA: $" + hra);
        System.out.println("DA: $" + da);
        System.out.println("TA: $" + ta);
        System.out.println("Gross Salary: $" + grossSalary);
    }
}
