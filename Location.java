	import java.util.Scanner;

	public class Location {

		static int row,column;
		static double maxValue;

	public static Location locateLargest(double [][]a) {
		for(int i=0;i<a.length;i++) {
		for(int j=0;j<a[i].length;j++) {
			if(maxValue<a[i][j]) {
				maxValue=a[i][j];
				row=i;
				column=j;
			}
		}
	}
		return new Location(maxValue,row,column);
	}
		Location(double maxValue,int row,int column){
			this.maxValue=maxValue;
			this.row=row;
			this.column=column;
		}
		
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number of rows and columns:");
		int row=sc.nextInt();
		int column=sc.nextInt();
		System.out.println("Enter the array:");
		double [][]b=new double[row][column];
	
		for(int i=0;i<row;i++) {
		for(int j=0;j<column;j++) {
			b[i][j]=sc.nextDouble();
		}
	}
	Location l=Location.locateLargest(b);		
	System.out.println("The location of the largest element is "+l.maxValue+" at("+l.row+","+l.column+")");    
		}
	}