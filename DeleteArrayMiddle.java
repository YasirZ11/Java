	package Labsheet_02;

		import java.util.Scanner;

	public class DeleteArrayMiddle {

	public static void main(String[] args) {
		Scanner a=new Scanner(System.in);
		int [] intArr= {1,2,5,8,15};
		
		for(int i =0 ; i<intArr.length ; i++) {
		System.out.print(intArr[i]+" ");
		}
		System.out.println();
		System.out.print("Enter element to be deleted: ");
			int e= a.nextInt();
			for(int i =0 ; i<intArr.length ; i++) {
				if (intArr[i]==e) {
					for(int j=i ; j<intArr.length-1 ; j++) {
						intArr [j] = intArr [j+1];
					}
					break;
				
				}
			}
		
			System.out.println("Elements: ");
			for(int i=0 ; i<intArr.length ;i++ ) {
			System.out.print(intArr[i]+" ");
			
			}
		
		
	}

}
