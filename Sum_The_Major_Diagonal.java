	package Labsheet_01;
	import java.util.Scanner;
	public class Sum_The_Major_Diagonal {

	public static void main(String[] args) {
	
		Scanner n=new Scanner(System.in);
		
		System.out.println("Enter a 4-by-4 matrix row by row:");
		double s[][]=new double[4][4];
		
		for(int i=0; i<4; i++) {
			
			for(int j=0; j<4; j++) {
				
				s[i][j]=n.nextDouble();
			}
		}
		
		double sum1=0;
	
		for(int i=0; i<4; i++) {
			
			for(int j=0; j<4; j++) {
				
		if(i==j){
			sum1+=s[i][j];
			
		}
				}

			}
		
		double sum2=0;
		
		for(int i=0; i<4; i++) {
			
			for(int j=3; j>=0; j--) {
				
		if(i+j==3){
			sum2+=s[i][j];
			
		}
				}

			}
		System.out.println("Sum of the elements in the major diagonal: "+((sum1>sum2)?sum1:sum2));
		}
	}


