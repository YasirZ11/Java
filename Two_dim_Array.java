	package Labsheet_03;
	import java.util.Scanner;
	public class Two_dim_Array {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int [][] matrix1={ {1,5,9},
						{2,6,10},
						{3,7,11},
						{4,8,12}};
		
		System.out.println("array[4][3]");
		
		System.out.print("Enter the element to be search the position: ");
		int s= sc.nextInt();
		int a=0;
		for(int i=0 ; i<4 ; i++) {
			for (int j=0;j<3 ;j++) {
		if(matrix1[i][j]==s) 
		{
		System.out.println("Element is ["+(i+1)+"]["+(j+1)+"]");
			 	a++;
			}
		}
		}
		if(a==0) 
			 		System.out.println("false");
			
	
		
			for (int i=0;i<4;i++) {
					for (int j=0;j<3;j++) {
			
						System.out.print(matrix1[i][j]+" ");
			}
			}
	
	}

	}
