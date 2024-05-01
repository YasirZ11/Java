	package Labsheet_07;

import java.util.Scanner;

public class Reverse_Recursive {

		public static void Reverse(int n) {
			
			if (n<10) {
				System.out.print(n);
			}
			
			else {
				System.out.print(n%10);
				Reverse(n/10);
			}
			
		}
	
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the input: ");
		int n=sc.nextInt();
		
		System.out.println("Reversed Number: ");
		Reverse(n);
		
	}

}
