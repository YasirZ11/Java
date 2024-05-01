import java.util.Scanner;

public class Ex_2{
	static Scanner s=new Scanner(System.in);
	public static int sumDigit(){
		System.out.println("Assighn a value: ");
		long num=s.nextLong();
		
		int sum=0;
		for(int i= 1 ;num>0;i++) {
		sum+=(int)num%10;
		num=num/10;
		}
		return sum;
	}
	

	public static void main(String[] args) {
		System.out.println("sum is: "+ sumDigit());
	}

}
