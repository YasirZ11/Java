package Labsheets;

import java.util.Scanner;

public class L6_FutureDates {

	public static void main(String[] args) {
	Scanner s=new Scanner(System.in);
	
	System.out.println("Enter today's day: ");
	int t=s.nextInt();
	System.out.println("Enter number of days elapsed: ");
	int e=s.nextInt();
	int f=(t+e)%7;
	
		System.out.print("Today is ");
		
	if(t==0)
		System.out.print("Sunday");
	if(t==1)
		System.out.print("Monday");
	if(t==2)
		System.out.print("Tuesday");
	if(t==3)
		System.out.print("Wednesday");
	if(t==4)
		System.out.print("Thursday");
	if(t==5)
		System.out.print("Friday");
	if(t==6)
		System.out.print("Saturday");
	
	System.out.print(" and the future day is ");
	
	switch(f) {
	case 0:System.out.print("Sunday");
		break;
	case 1:System.out.print("Monday");
		break;
	case 2:System.out.print("Tuesday");
		break;
	case 3:System.out.print("Wednesday");
		break;
	case 4:System.out.print("Thursday");
		break;
	case 5:System.out.print("Friday");
		break;
	case 6:System.out.print("Saturday");
		break;
	}

	}

}
