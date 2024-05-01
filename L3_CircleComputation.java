package Labsheets;

import java.util.Scanner;

public class L3_CircleComputation {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		System.out.println("Enter the radius: ");
		double r=s.nextDouble();
		System.out.println();
		System.out.println("The area :"+(Math.PI*r*r));
		System.out.println("The parameter :"+2*(Math.PI*r));
	}

}
