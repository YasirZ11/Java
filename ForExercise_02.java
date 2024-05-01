
public class ForExercise_02 {

	public static void main(String[] args) {
		
		int sum=0;
		double count=0;	
		
		for(int a=1;a<=100;a++) {
			if (a%7==0) {
				sum=sum+a;
				count++;
			}
		}
			System.out.println("Sum is : "+sum );
			System.out.println("Count is : "+count);
			System.out.println("Average is : "+ (double)sum/count);
	}

}
