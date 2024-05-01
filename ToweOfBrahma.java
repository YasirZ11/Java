package Labsheet_07;

import java.util.Scanner;

public class ToweOfBrahma {
		
	static int count;
	
	public static int NoOfMoves(int disks, String start, String help, String end) {
		
		if (disks==1) {
			System.out.println("Move the "+disks+" disk from "+start+" to "+end);
				count++;
		}
		
		else {
			NoOfMoves(disks-1,start,end,help);
			System.out.println("Move the "+disks+" disk from "+start+" to "+end);
			count++;
			NoOfMoves(disks-1,help,start,end);
		}
		return count;
	}
	
	public static void main(String[] args) {
	
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the no of disks: ");
		int n=sc.nextInt();
		
		String A="Source";
		String B= "Auxiliary";
		String C= "Destination";
		
		System.out.println("No of Moves: "+ NoOfMoves(n,A,B,C));
	}
}
