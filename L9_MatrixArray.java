package Labsheets;

import java.util.Scanner;

public class L9_MatrixArray {

	public static void main(String[] args) {
		double a [][]=new double[4][4];
		Scanner s= new Scanner(System.in);
		System.out.println("Input the matrix: ");
		
		for(int i=0;i<a.length;i++) {
			for(int j=0;j<a[i].length;j++) {
				a[i][j]=s.nextDouble();
			}
		}
	
		double sum=0;
		for(int i=0;i<a.length;i++) {
			for(int j=0;j<a[i].length;j++) {
				if(i==j) {
					sum=sum+a[i][j];
				}
			}
		}
		
		System.out.println("The major diagonal is: "+sum);
	}

}
