
	public class functions {
		public static int find(int num1,int num2) {
			int first,second;
			first=num1*num2;
			second=first-num1+num2;
			if (second>50)
				num1=first/10;
			else
				num2=second/20;
		return num1+num2;}
	
		public static int discover(int one, int two) {
			int secret=1;
			for(int i=one;i<two;i++) {
				secret=secret*i;
			}
		return secret;}
	public static void main(String[] args) {
		int x=20,y=10;
	System.out.println(find(15,25));
	System.out.println(discover(3,7));
	System.out.println(find(10,10)+" "+ discover(5,find(8,5)));
	System.out.println(discover(x,y));
	System.out.println(find(8,5));
	}

}
