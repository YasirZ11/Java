package Labsheets;

import java.util.Scanner;

public class L3_AmalgaQues {

	public static void main(String[] args) {

		Scanner s=new Scanner(System.in);
		
		System.out.println("Enter your name: ");
		String n=s.next();
		System.out.println("Enter your age: ");
		int a=s.nextInt();
		System.out.println("Enter your job: ");
		String j=s.next();
		System.out.println("Enter your salary: ");
		double sl=s.nextDouble();
		System.out.println();
		System.out.println("Hello "+n+" ! "+"You worked as "+j+" with salary "+sl+" Rs.");
		
	}

}
