package Labsheet_07;

import java.util.Scanner;

public class FindSum_Recursion {

	public static int FindSum(int n) {
		
		if (n==0) {
			return 0;
		}
		return (n%10+FindSum(n/10));
			
	}
	
	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the input: ");
		int n=sc.nextInt();
		
		System.out.println("The Sum is: "+FindSum(n));
	}
}
