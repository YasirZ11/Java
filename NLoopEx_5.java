
public class NLoopEx_5 {

	public static void main(String[] args) {
		for(int row=1;row<=6;row++) {
			for(int col=row*2;col<=11;col++) {
				System.out.print("  ");
			}
			for(int col=2-row;col<=row;col++) {
				System.out.print("# ");
			}
			System.out.println();
		}
}
}