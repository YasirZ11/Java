import java.util.Scanner;

public class ArrayExer_1 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int [] a= new int[10];
		System.out.print("Enter ten Integers: ");
		for(int i=0;i<10;i++) {
		a[i]=sc.nextInt();
		}
		System.out.println();
		System.out.print("Integers in reverse: ");
		for(int i=9;i>=0;i--) {
			System.out.print(a[i]+" ");
		}
		
	}

}
