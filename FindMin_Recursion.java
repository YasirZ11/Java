package Labsheet_07;

public class FindMin_Recursion {
	
	public static int FindMin(int a[], int n) {
		if (n==1)
			return a[0];
		return min(a[n-1],FindMin(a,n-1));
	}
	
	public static int min(int n1,int n2) {
		return n1<n2?n1:n2;
	}

	public static void main(String[] args) {

		int [] a= {1,2,3,-4,5,-6,7,8,9,10};
		System.out.println("Minimum Elementin a[] is: "+FindMin(a,a.length));
	}

}
