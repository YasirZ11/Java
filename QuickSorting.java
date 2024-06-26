	package Labsheet_10;

	public class QuickSorting {
	int partition(int []a , int start, int end) {
		int pivot= a[end];
		int i=(start-1);
		
		for(int j=start; j<= end-1;j++) {
			if (a[j]<pivot) {
			
				i++;
				int temp=a[i];
				a[i]=a[j];
				a[j]=temp;
			}
		}
		
		int temp=a[i+1];
		a[i+1]=a[end];
		a[end]=temp;
		
		return i+1;
	}
	
	void quickSort(int [] a, int start, int end) {
		if(start<end) {
			int p=  partition(a,start,end);
			quickSort(a,start,p-1);
			quickSort(a,p+1,end);
		}
	}
	
	void printQuick(int [] a, int n) {
		for(int i=0; i <n;i++)
			System.out.print(a[i]+" ");
	}

}
