package Labsheet_10;

public class MergeSorting {

	static void merge(int [] a, int start, int mid, int end ) {
		
		int n1=mid-start+1;
		int n2= end-mid;
		
		int L[]= new int[n1];
		int R[]= new int[n2];
	
		for(int i=0; i<n1;i++)
			L[i]=a[start+i];
		for(int j=0; j<n2;j++)
			R[j]=a[mid+1+j];
		
		int i = 0 ,j=0;
		int k=start;
		
		while(i<n1 && j<n2) {
			if(L[i]<=R[j]) {
				a[k]=L[i];
				i++;
			}
			
			else {
				a[k]=R[j];
				j++;
			}
			k++;
		}
		
		while(i<n1) {
			a[k]=L[i];
			i++;
			k++;
		}
		
		while(j<n2) {
			a[k]=R[j];
			j++;
			k++;
		}
	}

	void mergeSort(int [] a, int start, int end) {
	
		if(start<end) {
			int mid=(start+end)/2;
			mergeSort(a,start,mid);
			mergeSort(a,mid+1, end);
			merge(a,start,mid,end);
		}
	}

	static void printMerge(int [] a, int n) {
		
		for(int i=0; i<n;i++)
			System.out.print(a[i]+" ");
	}
}
