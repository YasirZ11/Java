import java.util.Scanner;

public class Testarray2 {

	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter the size of the array");
		int n=scan.nextInt();
		int[] arrayInt;
		arrayInt=new int[n];
		
		System.out.print("Input the"+n+" array elements:");
		
		for(int i=0;i<5;i++){
		arrayInt[i]=scan.nextInt();
		}
		for(int i=0;i<5;i++){
		System.out.println(i+1 +"element is "+arrayInt[i]+"has index " + i);
		}
		}
		
	}