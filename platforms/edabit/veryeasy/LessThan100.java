public class LessThan100 {
  public static boolean lessThan100(int a, int b) {
		int result = a + b;
		if(result < 100){
			return true;
		}
		else return false;
  }
	
	public static void main(String[] args){
		System.out.println(lessThan100(78, 98));
	}
}
