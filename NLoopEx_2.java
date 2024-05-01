
public class NLoopEx_2 {

	public static void main(String[] args) {
		for(int row=1;row<=7;row++) {
			for(int col=1;col<=7;col++) {
				if(row==1 || row==7 || row==col )
					System.out.print("# ");
				else
					System.out.print("  ");
			}
			System.out.println();
		}
	}
}
