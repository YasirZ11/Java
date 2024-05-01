package Exercise;
import java.util.Scanner;
public class PrintNumberInWord_MultiIfElse {
	public static void main(String[] args) {
		Scanner s= new Scanner (System.in);
		System.out.println("Enter a num");
		int num= s.nextInt();
		if (num==1) {
			System.out.print("ONE");}
		else if (num==2) {
			System.out.print("TWO");}	
		else if (num==3) {
			System.out.print("THREE");}
		else if (num==4) {
			System.out.print("FOUR");}
		else if (num==5) {
			System.out.print("FIVE");}
		else if (num==6) {
			System.out.print("SIX");}
		else if (num==7) {
			System.out.print("SEVEN");}
		else if (num==8) {
			System.out.print("EIGHT");}
		else if (num==9) {
			System.out.print("NINE");}
		else  {
			System.out.print("OTHER");}
	}
}
