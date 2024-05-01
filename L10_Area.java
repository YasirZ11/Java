package Labsheets;

public class L10_Area {

	public static void areaOfCircle(int r) {
		System.out.println("Area of circle: "+Math.PI*r*r);
	}
	
	public static void areaOfRectangle(int w, int l) {
		System.out.println("Area of rectangle: "+w*l);
		
	}
	
	public static void areaOfTriangle(int b, int h) {
		System.out.println("Area of triangle: "+(b*h)/2);
	}
	
	public static void main(String[] args) {
		
		areaOfCircle(4);
		areaOfRectangle(5,9);
		areaOfTriangle(8,6);
		
	}

}
