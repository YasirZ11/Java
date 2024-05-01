
	class Calculation{
		int z;
		
		public void addition(int x,int y) {
			z=x+y;
			System.out.println("The sum of given number is: "+z);
		}
		public void Substraction(int x,int y) {
			z=x-y;
			System.out.println("The difference between the given number is: "+z);
		}
		
	}
	public class My_Calculation extends Calculation{
		int z;
		
		public void multiplication(int x,int y) {
			z=x*y;
			System.out.println("The difference between the given number is: "+z);
		}
		
		public static void main(String [] args) {
			My_Calculation m1=new My_Calculation();
			m1.addition(10, 15);
			m1.Substraction(20,12);
			m1.multiplication(5,9);
		}
}
