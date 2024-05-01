	package Labsheet_10;

	public class InsertionSorting {
	
		
		public int[] insertionSort(int []a) {
			
			for(int i=0;i<a.length;i++) {
				int temp=a[i];
				int j=i-1;
				
				while((j>-1) && (a[j]>temp)){
					a[j+1]=a[j];
					j--;
				  }
				a[j+1]=temp;
				}
				
			return a;
			}
		
		void printInsert(int a[]) {
			
			for(int i=0; i<a.length;i++) {
				System.out.print(a[i]+" ");
				}
			}
}
