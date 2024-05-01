package Labsheets;

public class L7_Sum {

	public static void main(String[] args) {
		
		int sum=0;
		double count=0;
		
		for(int i=1;i<=100;i++) {
			if(i%7==0) {
			sum+=i;
			count++;
			}
		}
		
		System.out.println("Sum: "+sum);
		System.out.println("Count: "+(count));
		System.out.println("Average: "+(sum/count));
	}

}
