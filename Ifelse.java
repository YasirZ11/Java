package lab;

import java.util.Scanner;

public class ExerciseIfelse {

	public static void main(String[] args) {
	
		Scanner s= new Scanner(System.in);
		System.out.println("Enter the overSpeed");
		double overSpeed=s.nextDouble();
		if (0< overSpeed && overSpeed<=5) {
			System.out.println("Fine is  Rs.200.00");}
			else if (5 < overSpeed && overSpeed<=10) {
				System.out.println("Fine is Rs.750.00");}
			else if (10 < overSpeed && overSpeed<=15) {
				System.out.println("Fine is Rs.1500.00");}
			else {
				System.out.println("Fine is Rs"+(1500+200*(overSpeed-15)));}
			}
	}


