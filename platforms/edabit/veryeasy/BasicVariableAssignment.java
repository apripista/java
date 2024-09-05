public class BasicVariableAssignment {
	public static String nameString(String name) {
		  String b = "Edabit";
		  String result = name + b;
		  return result;
	}
	public static void main(String[] args){
		nameString("Joanes");
		// print to see the results
		System.out.println(nameString("Joctan"));
	}
}
