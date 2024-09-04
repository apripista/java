public class AreaOfTriangle {
	// a method to calculate the area of the triangle
	public static int triArea(int base, int height) {
		int area = (base * height) / 2;
		return area;
	}
	
	// calling a method
	public static void main(String[] args){
		System.out.println(triArea(2, 6));
	}
}
