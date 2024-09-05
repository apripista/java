public class ConvertMinutesIntoSeconds {
	// function to convert minutes to seconds
	public static int convert(int minutes) {
		int seconds = 60 * minutes;
		return seconds; // return the result in seconds
  }
	public static void main(String[] args){
		System.out.println(convert(5)); // print the result
	}
}