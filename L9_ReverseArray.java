package Labsheets;

import java.util.Scanner;

public class L9_ReverseArray {

	public static void main(String[] args) {
	
		Scanner s=new Scanner(System.in);
		int a[]=new int[10];
		System.out.print("Enter 10 integers:");
		
		for(int i=0;i<10;i++) {
			a[i]=s.nextInt();
		}
		System.out.println("Integers in reverse:");
			for(int i=9;i>=0;i--) {
				System.out.print(a[i]+" ");
			}
		
	}

}
