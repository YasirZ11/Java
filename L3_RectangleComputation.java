package Labsheets;

import java.util.Scanner;

public class L3_RectangleComputation {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
	
		System.out.println("Enter the width: ");
		double w=s.nextDouble();
		System.out.println("Enter the length: ");
		double l=s.nextDouble();
		System.out.println();
		System.out.println("The area :"+(l*w));
		System.out.println("The parameter :"+2*(l+w));
	}

}
