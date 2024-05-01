package Labsheet_10;

public class Example {

	
	public int [] bubbleSort(int [] a) {
		int n = a.length;
        for (int i = 0; i < n; i++)
            for (int j = 0; j < n-i; j++)
                if (a[j] > a[j+1]){
                   
                    int temp = a[j-1];
                    a[j-1] = a[j];
                    a[j] = temp;
                } 
        return a;
    }

	static void printBubble(int a[]) {
		
		for(int i=0; i<a.length;i++) {
			System.out.print(a[i]+" ");
			
		}
	}
	
	
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
	
	public static void main(String [] args) {
		
		int [] A= { 4, 7, 2, 57, 46, 58, 35, 58, 20, 4};
		int n=A.length;
		
		BubbleSorting bs=new BubbleSorting();
		SelectionSorting ss= new SelectionSorting();
		InsertionSorting is=new InsertionSorting();
		MergeSorting ms=new MergeSorting();
		QuickSorting qs=new QuickSorting();
				
		System.out.println("Elements befrore sorting: ");
			for(int i:A) {
				System.out.print(i+" ");
			}
			System.out.println();
			bs.bubbleSort(A);
			System.out.println("\n"+"Elements after bubble sorting: ");
			bs.printBubble(A);
		
			System.out.println();
			ss.selectionSort(A);
			System.out.println("\n"+"Elements after selection sorting: ");
			ss.printSelection(A);
		
			System.out.println();
			is.insertionSort(A);
			System.out.println("\n"+"Elements after insertion sorting: ");
			is.printInsert(A);
			
			System.out.println();
			ms.mergeSort(A,0,n-1);
			System.out.println("\n"+"Elements after merge sorting: ");
			ms.printMerge(A,n);
			
			System.out.println();
			qs.quickSort(A,0,n-1);
			System.out.println("\n"+"Elements after quick sorting: ");
			qs.printQuick(A,n);
		
	}

	
}
