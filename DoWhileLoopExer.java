import java.util.Scanner;
public class DoWhileLoopExer {

	public static void main(String[] args) {
		Scanner s= new Scanner(System.in);
		int b;
		int a=1;
		System.out.print("Enter a upper bound");
		b=s.nextInt();
		int sum=0;
		double count=0;
		do {
			sum=sum+a;
			a++;
			count++;
		}
		while (a<=b);	
		System.out.println("Sum is : "+ sum);
		System.out.println("Average is: " + (double)sum/count);
			}
}
