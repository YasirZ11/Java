import java.util.Scanner;

public class ArrayExer_2 {

	public static void main(String[] args) {
		Scanner s= new Scanner(System.in);
		System.out.println("Enter 4-by4- Matrix:");
		double[][] b=new double[4][4];
		for(int i=0;i<4;i++) {
			for(int j=0;j<4;j++) {
				b[i][j]=s.nextDouble();
			}
		}
		double sum=0;
		for(int i=0;i<4;i++) {
			for(int j=0;j<4;j++) {
			if(i==j) 
				sum+=b[i][j];	
	}
	}
		System.out.println();
		System.out.print("Sum of the elements in the major diagonal is: "+sum);
	}
}