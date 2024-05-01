
public class NLoopEx_3 {

	public static void main(String[] args) {
		for(int row=1;row<=6;row++) {
			for(int col=2;col<=row;col++) {
				System.out.print("  ");
			}
			for(int col=row;col<=6;col++) {
				System.out.print("# ");
			}
			for(int col=row;col<=5;col++) {
				System.out.print("# ");
			}
			System.out.println();
	}
	}
}
