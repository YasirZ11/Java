package Labsheets;

import java.util.Scanner;

public class L10_SumInteger {
	
	
		public static int sumDigit() {
			Scanner s=new Scanner (System.in);
			System.out.println("Enter a value: ");
			long n=s.nextLong();
			
			int sum=0;
			for(int i=1;i>0;i++) {
				sum+=(int)(n%10);
				n=n/10;
			}
			return sum;
		}
	
	public static void main(String[] args) {
		System.out.print("Sum digit is: "+sumDigit());
	}

}
