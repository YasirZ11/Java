package Labsheets;

public class L9_Matrix0sand1s {

	public static void main(String[] args) {
	
		int a[][]= {{1,1,0,0,1,0},
					{0,1,0,1,0,1},
					{0,0,0,1,1,1},
					{1,0,0,0,1,0},
					{1,0,1,0,1,0},
					{0,0,1,1,0,1} };
		
		System.out.println("Output");
		for(int i=0;i<a.length;i++) {
			for(int j=0;j<a[i].length;j++) {
				System.out.print(a[i][j]+ " ");
			}
			System.out.println();
		}
		System.out.println();
		System.out.println("Even row numbers: ");
		for(int i=0;i<a.length;i++) {
			int count=0;
			for(int j=0;j<a[i].length;j++) {
				if(a[i][j]==1)
					count++;
			}
			if(count%2==0)
				System.out.println(i+1+" ");
		}
		
		System.out.println("Even column numbers: ");
		for(int i=0;i<a.length;i++) {
			int count=0;
			for(int j=0;j<a[i].length;j++) {
				if(a[i][j]==1)
					count++;
			}
			if(count%2==0)
				System.out.println(i+1+" ");
		}

	}

}
