package Labsheet_07;

import java.util.Scanner;

public class DeterPrime_Recursion {
	
	static boolean isPrime(int n) {
		if(n<=2)
			return (n==2)? true:false;
	
				else
		    for(int i=2;i<n;i++) {
			if(n%i==0)
				return false;
		}
		
		return true;
	}
	
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the input: ");
		int n=sc.nextInt();
		
		System.out.println("Is the number prime?: "+isPrime(n));
	}
}
