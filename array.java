
public class array {

	public static void main(String[] args) {
		int j;
		int [] one=new int[5];
		int [] two=new int[10];
		for(j=0;j<5;j++)
			one[j]=5*j+3;
		System.out.println("One contains:");
		for(j=0;j<5;j++)
			System.out.print( one[j]+" ");
		
		for(j=0;j<5;j++) {
			two[j]=2*one[j]-1;
		two[j+5]=one[4-j]+two[j];
	}
		System.out.println();
		System.out.println(" Two contains:");
		
		for(j=0;j<10;j++)
			System.out.print( two[j]+" ");
	}
}
