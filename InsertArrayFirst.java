	package Labsheet_02;
	
	import java.util.Scanner;
	public class InsertArrayFirst {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter no.of elements you want in array: ");
			int n = sc.nextInt();
			int a [] =new int [n+1];
		
			System.out.print("Enter the all elements: ");
			for (int i=0 ; i<n ; i++) {
				a [i] = sc.nextInt();
			}
		
			System.out.print("Enter the element you want to insert: ");
			int x = sc.nextInt();
			for (int i = n-1 ; i>=0 ; i--) {
				a [i+1] = a [i];
			}
				a[0]=x;
				System.out.println("After inserting: ");
				
				for(int i=0 ; i<n+1 ; i++ ) {
					System.out.print(a[i]+" ");
				}
			
			
			
	}

}
