package Exercise;

public class Exercise4 {

	public static void main(String[] args) {

		int x=0;
		for(int i=100; i<= 1000; i++) {
			if (i % 5 == 0 && i % 6 == 0) {
					System.out.print(i + " ");		
					x++;
					if (x % 10 == 0) {
						System.out.println();
					}
			}
		}
		
		}
	}
	 

