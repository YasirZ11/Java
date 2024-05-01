package Labsheet_07;

import java.util.Scanner;

public class Palindrome_Recursion {
		static int ispalindrome(char a[], int n,int m) {
			if (n>=m)
				return 1;
			if(a[n]==a[m])
				return ispalindrome(a,n+1,m-1);
			
			return 0;
			
		}
		
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the input: ");
		String s=sc.next();
		char [] a=s.toCharArray();
		int n = s.length();
		
		System.out.println("If a[] is palindrome return 1 otherwise 0: "
							+ispalindrome(a,0,n-1));

	}

}
