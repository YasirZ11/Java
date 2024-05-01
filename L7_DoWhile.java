package Labsheets;

public class L7_DoWhile {

	public static void main(String[] args) {
		int sum=0;
		double count=0;
		int i=1;
		do {
			sum=sum+i;
			i++;
			count++;
		}
		while(i<=100);

		System.out.println("Sum: "+sum);
		System.out.println("Count: "+count);
		System.out.println("Average: "+(double)(sum/count));
	}

}
