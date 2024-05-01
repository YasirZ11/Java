package one;

import java.util.Scanner;

public class CircleComputation {

	public static void main(String[] args) {
		Scanner sc= new Scanner (System.in);
		double radius=3.1 ;
		double area= Math.PI*radius*radius;
		double circumference=2*Math.PI*radius;
		
		System.out.println("Area of a circle: "+area);
		System.out.println("Perimeter of a circumference : "+circumference);
	}
}
