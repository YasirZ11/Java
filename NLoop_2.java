
public class NLoop_2 {

	public static void main(String[] args) {
		for(int row=1;row<=5;row++) {
			for(int col=1;col<=5;col++) {
				if(col<=row)
					System.out.print("* ");
				else
					System.out.print(" ");
			}
			System.out.println();
		}
	}
}
