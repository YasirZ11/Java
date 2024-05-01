
public class Example1 {
		public static void main(String[] args) {

			int[] z={1,4,25,35,34,100,38,68,79,0};
				int count=0,sum=0,average=0;
				
				for(int n=0;n<10;n++) {
					System.out.print(z[n]+" ");
				}
				System.out.println();
				for(int n=0;n<10;n++) {
					sum=sum+z[n];
					count++;
					average=(int)(sum/count);
				}
				System.out.println("Average:" +(average));
				int x=0;
				for(int n=0;n<10;n++) {
					if (average<=z[n])
						x++;}
				System.out.println("Greater or Equal:"+x);
				int y=0;
				for(int n=0;n<10;n++) {
					if (average>z[n])
						y++;}
				System.out.println("Smaller:"+y);
	}
}
