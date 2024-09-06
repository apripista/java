public class PowerCalculator {
	public static int power(int voltage, int current) {
		int electric_power = voltage * current;
		return electric_power;
	}
	// main function: calling a function and passign the arguments
	public static void main(String[] args){
		System.out.println("Electric power of the circuit is: " + power(6, 8));
	}
}
