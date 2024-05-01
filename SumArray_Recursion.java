	package Labsheet_07;

	public class SumArray_Recursion {

			public static int FindSum(int a[],int n) {
				if (n==1) {
					return a[0];
				}
				
				return a[n-1]+FindSum(a,n-1);
			}
			
	public static void main(String[] args) {
		
		 int a[]= {1,2,3,4,5};

			 System.out.println("Sum of the array is: "+FindSum(a,a.length));
	}

}
