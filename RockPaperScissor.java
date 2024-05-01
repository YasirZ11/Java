package Exercise;

import java.util.Scanner;

public class RockPaperScissor {
	public static void main(String[] args) {
	Scanner sc= new Scanner(System.in);
	int computer= (int)(Math.random()*3);
	System.out.println("Computer : " + (int)(Math.random()*3));
	System.out.print("Enter a number 0-2");
	int user=sc.nextInt();
	switch(computer) {
	case 0: System.out.print("The Computer is Scissors.");
	break;
	case 1: System.out.print("The Computer is Rock.");
	break;
	case 2:System.out.print(" The Computeris Paper.");
	break;}
	switch(user){
	case 0:System.out.print(" User is Scissors.");
	break;
	case 1:System.out.print("The User is Rock.");
	break;
	case 2:System.out.print(" The User is Paper.");
	break;}
	if(computer==user) {
			 System.out.println(" it's draw.");}
		 else if(computer==1 && user==0 || computer==2 && user==1 || computer==0 && user==2) {
			 System.out.println(" Computer Wins.");}
		 else if(computer==2 && user==0 || computer==0 && user==1 || computer==1 && user==2 ) {
			 System.out.println(" User Wins.");}
		 }
}
	
	


                