	package Labsheet_10;

	public class Ascending_order {

	
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
