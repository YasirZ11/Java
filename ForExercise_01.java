
public class ForExercise_01 {

	public static void main(String[] args) {
	double count=0;
	int sum=0;
	for(int a=111;a<=8899;a++) {
		sum=sum+a;
		count++;
	}
		System.out.println("Sum is : "+sum );
		System.out.println("Count is : "+count);
		System.out.println("Average is : "+ (double)sum/count);
	}
	

}
