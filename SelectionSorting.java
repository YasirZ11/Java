package Labsheet_10;

	public class SelectionSorting {
		public int [] selectionSort(int [] a) {
		
		for(int i=0; i<a.length-1;i++ ) {
			int index=i;
			for(int j=i+1;j<a.length; j++ ) {
				if(a[j]<a[index]) {
					index=j;
					
					int temp=a[index];
					a[index]=a[i];
					a[i]=temp;
				}
			}
		}
	
		return a;
	}
	
	static void printSelection(int a[]) {
		
		for(int i=0; i<a.length;i++) {
			System.out.print(a[i]+" ");
			
			}
		}
}
