public class ConvertHoursIntoSeconds {
	public static int howManySeconds(int hours) {
		// calculation to convert hours to seconds
		int seconds = 60 * 60 * hours;
		return seconds;
  }
	public static void main(String[] args){
		// calling the howManySecond
		// method to print the output
		howManySeconds(1);
		howManySeconds(10);
		howManySeconds(2);
	}
}