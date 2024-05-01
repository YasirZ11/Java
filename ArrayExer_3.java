
public class ArrayExer_3 {

	public static void main(String[] args) {
		int [][]a= { {1,0,0,0,0,1},
			     	 {0,1,1,0,1,1},
			     	 {1,0,1,0,1,0},
			     	 {0,0,0,1,1,1},
			     	 {1,1,0,0,0,0},
			     	 {1,1,0,1,0,1} };
	
	System.out.println("Output:");
	for(int i=0;i<a.length;i++) {
		for(int j=0;j<a[i].length;j++) {
			System.out.print(a[i][j]+ " ");
		}
		System.out.println();
	}
	System.out.print("Even Row Numbers:");
	
	for(int i=0;i<a.length;i++) {
		int count=0;
		for(int j=0;j<a[i].length;j++) {
		if(a[i][j]==1)
			count++;
	}
		if(count%2==0)
			System.out.print(i+1+" ");
	}
	System.out.println();
	System.out.print("Even Column Numbers:");
	for(int i=0;i<a.length;i++) {
		int count=0;
		for(int j=0;j<a[i].length;j++) {
		if(a[j][i]==1)
			count++;
	}
		if(count%2==0)
			System.out.print(i+1+" ");


	}
	}
}
