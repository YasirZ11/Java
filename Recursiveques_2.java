
		public class Recursiveques_2 {
		 public static int Sum(int A[],int n) {
			 if (n==0)
				 return A[0];
			 else 
				 return A[n]+Sum(A,n-1);
		 }
	
	public static void main(String[] args) {
			int [] A= {3,4,2,5,6};
			System.out.println("Sum:"+ Sum(A,4));
	
	}
}
