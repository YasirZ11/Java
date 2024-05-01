package Labsheet_01;
import java.util.Scanner;
public class Reverse_The_Integers {

	public static void main(String[] args) {
		int [] a= new int[10];
		Scanner S= new Scanner(System.in);
		
		System.out.print("Enter Ten Integers:");
		for(int i=0; i<10; i++) {
			a[i]=S.nextInt();
		}
		
		System.out.println("Integers in reverse order:");
		for(int i=9; i>=0; i--) {
			System.out.print(a[i]+ " ");
			
		}
	}

}
