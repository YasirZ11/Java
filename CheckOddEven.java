package Exercise;

import java.util.Scanner;

public class CheckOddEven {
	public static void main(String[] args) {
		Scanner i= new Scanner (System.in);
		System.out.println("Enter a number");
		int number= i.nextInt();
		if ( number % 2 ==0) {
			System.out.print("Even Number");	
		}
		else 
			System.out.print("Odd Number");
			
	}

}
