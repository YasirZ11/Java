
public class Max_using_recursive {

	public static int recursiveMax(int [] a,int length) {
		if(length==1)
			return a[0];
		else
		return max(recursiveMax(a,length-1),a[length-1]);
	}
	
	public static int max(int n1, int n2) {
		return n1>n2? n1:n2;
	}
	 
	public static void main(String[] args) {
		
		int [] a= {1,2,3,4,5,6,7,8,9,10};
		int max=recursiveMax(a,a.length);
		
		System.out.println("Maximum Element is: "+max);

	}

}
