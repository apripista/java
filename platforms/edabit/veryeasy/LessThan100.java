public class LessThan100 {
  public static boolean lessThan100(int a, int b) {
		int result = a + b;
		// conditions to check if 
		// the integers are less than 100 or not
		if(result < 100){
			return true;
		}
		else return false;
  }
	
	public static void main(String[] args){
		// calling the function and printing the output
		System.out.println(lessThan100(78, 98));
	}
}
