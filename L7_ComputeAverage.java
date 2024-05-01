package Labsheets;

	public class L7_ComputeAverage {

	public static void main(String[] args) {
		
		int sum=0;
		double average=0;
		int count=0;
		
		for(int i=111; i<=8899; i++) {
			sum+=i;
			count++;
		}
		
		System.out.println("Total sum: "+sum);
		System.out.println("Average: "+(sum/count));
	}

}
