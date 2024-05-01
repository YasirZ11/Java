import java.util.Scanner;
public class Function_2 {

	public static double findArea(double width,double height) {
		double area=width*height;
		return area;
	}
	
	
	public static void main(String[] args) {
		Scanner in=new Scanner(System.in);
		System.out.println("Enter width and height");
		double width= in.nextDouble();
		double height= in.nextDouble();
		System.out.println(findArea(width,height));
	}

}
