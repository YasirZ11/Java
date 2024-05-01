package Labsheet_03;
		import java.util.Scanner;
	public class Array_number_with_size {
			
		
			public static int[] Numbers=new int[10];
			
			private static void getNumbers(int[]g, int size) {
				for(int i=0; i<size;i++) {
					Numbers[i]=g[i];
				}
			}
			
			private static void showNumbers(int[]g, int size) {
				for(int i=0; i<size;i++) {
					System.out.print(Numbers[i]+" ");
				}
			}
			
			private static int highestNumbers(int[]g, int size) {
				int r=Numbers[0];
			
				for(int i=1; i<size;i++) {
					if(Numbers[i]>r)
						r=Numbers[i];
				}
				return r;
			}
			
			private static int lowestNumbers(int[]g, int size) {
				int r=Numbers[0];
			
				for(int i=1; i<size;i++) {
					if(Numbers[1]<r)
						r=Numbers[i];
				}
				return r;
			}
			
			private static double averageNumbers(int[]g, int size) {
				double sum=0;
				for(int i=0; i<size;i++) {
					
					sum=sum+Numbers[i];
				}
				return (sum/size);
			}
		
		public static void searchNumber	(int[] g, int size, int Number) {
			int y=0;
		
			for(int i=0; i<size;i++) {
				if(Numbers[i]==Number) {
					System.out.println("Position is: "+(i+1));
					y++;
				}
				
				}
			if(y==0) {
				System.out.println("Invalid element");
			}
			
			}
		
			static void swap( int i, int j) {
				
				int r=Numbers[i];
				Numbers[i]=Numbers[j];
				Numbers[j]=r;
			}
		
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int N []=new int[10];
		System.out.println("Enter ten elements: ");
		for(int i=0; i<10;i++) {
			N[i]=sc.nextInt();
			getNumbers(N,10);
		}
		System.out.println("Highest number is: "+highestNumbers(N,10));
		System.out.println("Lowest number is: "+lowestNumbers(N,10));
		System.out.println("Average is: "+averageNumbers(N,10));
		System.out.println("Enter the element to search: ");
		int p=sc.nextInt();
		searchNumber(N,10,p);
		
		System.out.println("Enter the element to swap: ");
		int i=sc.nextInt();
		int j=sc.nextInt();	
		swap(i-1,j-1);
		
		showNumbers(N,10);
	}

}
