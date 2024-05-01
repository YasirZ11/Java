package one;

import java.util.Scanner;

public class RectangularComputation {
	public static void main(String[] args) {
		Scanner sc= new Scanner (System.in);
		double length=2.5 ,width= 4.5;
		double area=(length*width);
		double perimeter=2*(length+width);
		
		System.out.println("Area of a rectangle: "+area);
		System.out.println("Perimeter of a rectangle : "+perimeter);
	}
}
