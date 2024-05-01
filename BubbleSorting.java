package Labsheet_10;

	public class BubbleSorting {

		public int [] bubbleSort(int [] a) {
			int n = a.length;
	        for (int i = 0; i < n-1; i++)
	            for (int j = 0; j < n-i-1; j++)
	                if (a[j] > a[j+1]){
	                   
	                    int temp = a[j];
	                    a[j] = a[j+1];
	                    a[j+1] = temp;
	                }
	        return a;
	    }

		static void printBubble(int a[]) {
			
			for(int i=0; i<a.length;i++) {
				System.out.print(a[i]+" ");
				
			}
		}
		
		public static void main(String arge[]) {
			
			int [] A= { 4, 7, 2, 57, 46, 58, 35, 58, 20, 4};
		
			BubbleSorting bs=new BubbleSorting();
			
			System.out.println("Elements befrore sorting: ");
			for(int i:A) {
				System.out.print(i+" ");
			}
			
			
			
		}
		
		
		

}
