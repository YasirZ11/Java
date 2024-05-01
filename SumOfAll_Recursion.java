package Labsheet_07;

import java.util.Scanner;

public class SumOfAll_Recursion {

		public static int Sum(int n) {
			if (n==0)
				return 0;
			return n+Sum(n-1);
		}
	
	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the input: ");
		int n=sc.nextInt();
		
		System.out.println("The Sum is: "+Sum(n));
	}

}
