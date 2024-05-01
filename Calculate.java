package Labsheet_07;

import java.util.Scanner;

public class Calculate {
	public static int calculate(int a[],int n) {
		if (n==1) {
			return a[0];
		}
		
		return a[n-1]+calculate(a,n-1);
	}

	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
			System.out.println("Enter the size of array: ");
			int n=sc.nextInt();
			int a[]= new int[n];
			
			System.out.println("Enter the array elements: ");
			for(int i=0; i<n;i++) {
				a[i]=sc.nextInt();
			}
			
			 System.out.println("Sum of the array is: "+calculate(a,n));
		
	}
}
