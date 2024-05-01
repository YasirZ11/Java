package Labsheets;

import java.util.Scanner;

public class CricketMatch {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
	
		int d[]=new int[11];
		int m[]=new int[11];
		int y[]=new int[11];
		
		 System.out.println("Enter the date: ");
		 for(int i=0;i<11;i++) {
			 d[i]=s.nextInt();
		 }
		
		 System.out.println("Enter the month: ");
		 for(int i=0;i<11;i++) {
			 m[i]=s.nextInt();
		 }
		 
		 System.out.println("Enter the year: ");
		 for(int i=0;i<11;i++) {
			 y[i]=s.nextInt();
		 }
		 
		 System.out.println("Players Date of birth: ");
		 for(int i=0;i<11;i++) {
			 System.out.println("Player "+(i+1)+": "+d[i]+"-"+m[i]+"-"+y[i]);
		 }
		 
		 int sumd=0;
		 
		 for(int i=0;i<11;i++) {
			 sumd+=(d[i]+m[i]+y[i])%10;
			 
		 }
		 System.out.println(sumd);
	}

}
