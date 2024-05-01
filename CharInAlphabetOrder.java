	package Labsheet_10;
	import java.util.*;
	public class CharInAlphabetOrder {

	public static void main(String[] args) {
		
		Scanner sc= new Scanner(System.in);
		int n;
		String temp;
		
		System.out.println("Enter the number of elements: ");
		n=sc.nextInt();
		
		String C[]= new String [n];
		System.out.print("Enter the string: ");
		for (int i=0;i<n;i++) {
			C[i]= sc.next();
		}
		
		for (int i = 0; i < n; i++) {
			for (int j = i + 1; j < n; j++) {
				
				
				if (C[i].compareTo(C[j]) > 0) {
					temp = C[i];
					C[i] = C[j];
					C[j] = temp;
				}
			}
		}
		
		System.out.println("The names in alphabetical order are: ");
	
			System.out.println(Arrays.toString(C));
		}
	}


