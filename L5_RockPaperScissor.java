package Labsheets;

import java.util.Scanner;

public class L5_RockPaperScissor {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);

		System.out.println("Enter the number between (0-2):");
			int n=s.nextInt();
			int c=(int)(Math.random()*3);
		System.out.println("Computer: "+(int)(Math.random()*3));	
		
		switch(n) {
		
		case 0:System.out.print("The user is scissor.");
			break;
		case 1:System.out.print("The user is rock."); 	
			break;
		case 2:System.out.print("The user is paper."); 	
		break;
		}
		
	switch(c) {
		
		case 0:System.out.print(" The computer is scissor.");
			break;
		case 1:System.out.print(" The computer is rock."); 	
			break;
		case 2:System.out.print(" The computer is paper."); 	
		break;
		}
	
	if(n==c)
		System.out.print(" It is draw.");
	else if( c==0 && n==2 || c==1 && n==0 || c==2 && n==1) 
		System.out.print(" Computer wins.");
	
	else if( c==0 && n==1 || c==1 && n==2 || c==2 && n==0) 
		System.out.print(" User wins.");
	}

}
