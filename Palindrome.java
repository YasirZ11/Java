package Labsheet_07;

import java.util.Scanner;

public class Palindrome {
		static char a[];
		static int size;
	
		static int start=0;
		static int ispalindrome(char a[], int n) {
			if(a[start]==a[n-1]) {
				start++;
				
				if(n==size/2) 
					return 1;
					else
						return ispalindrome(a,n-1);
			}
			return 0;
			
			}
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the input: ");
		String s=sc.next();
		size = s.length();
		a= new char[size];
	
			for (int i=0;i<s.length();i++) {
				a[i]=s.charAt(i);	
			}
			
			if(ispalindrome(a,size)==1)
				System.out.println(s+" is palindrome");
				
			else
				System.out.println(s+" is not a palindrome");
	}

}
