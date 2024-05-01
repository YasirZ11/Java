
	public class DefaultConst {
		
		int a=12;
	DefaultConst(){
		System.out.println("Welcome to the New World!");
		System.out.println("Enjoy your time with your Family!");
	}
	
	public static void main(String[] args) {
	
		DefaultConst c1=new DefaultConst();		
		System.out.println(c1.a);
		System.out.println();
		DefaultConst c2=new DefaultConst();
		c2.a=18;
		System.out.println(c2.a);
	}
}
