	import java.util.Scanner;
public class TwentyIntegers {

	public static void main(String[] args) {
		int [] a=new int[20];
		Scanner in=new Scanner(System.in);
		System.out.print("Enter the integers:");
			for(int i=0;i<20;i++) {
				a[i]=in.nextInt();
			}
			System.out.print("No.of Positive numbers:");
				int x=0;
			for (int i=0;i<20;i++) {
				if(a[i]>0)
					x++;
			}
			System.out.print(x);
			System.out.println();
			System.out.print("No.of negative numbers:");
			int y=0;
		for (int i=0;i<20;i++) {
			if(a[i]<0)
				y++;
		}
		System.out.print(y);
	
	}
}

