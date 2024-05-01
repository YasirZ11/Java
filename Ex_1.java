
public class Ex_1 {

	public static void Areaofcircle(double r) {
		double area= Math.PI*r*r;
		System.out.println("Area of circle is: "+ Math.PI*r*r);
	}
	public static void Areaofrectangle(double w,double l) {
		double area=w*l;
		System.out.println("Area of rectangle is: "+ w*l);
	}
	
	public static void Areaoftriangle(double h,double b) {
		double area= (h*b)/2;
		System.out.println("Area of triangle is: "+ (h*b)/2);
	}
	public static void main(String[] args) {
								Areaofcircle(2.5);
								Areaofrectangle(6.7,5.5);
								Areaoftriangle(7,5.2);
	}

}
