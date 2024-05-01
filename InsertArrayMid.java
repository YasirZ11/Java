	package Labsheet_02;
		import java.util.Scanner;
	public class InsertArrayMid {

	public static void main(String[] args) {
		Scanner s= new Scanner(System.in);
		System.out.println("Enter no.of elements you want in array: ");
		int m = s.nextInt();
		int b [] =new int [m+1];
	
		System.out.print("Enter the all elements: ");
		for (int i=0 ; i<m ; i++) {
			b [i] = s.nextInt();
		}
		System.out.print("Enter the position where you want to insert the element: ");
		int p=s.nextInt();
		System.out.print("Enter the element you want to insert: ");
		int y=s.nextInt();
		
		for(int i=m-1 ; i>=p-1 ; i--) {
			b [i+1] = b[i];
		}
		b[p-1]=y;
		System.out.print("After inserting: ");
		for(int i=0 ; i<m+1 ; i++) {
			System.out.print(b[i]+" ");
			
		}
		
		
	}

}
