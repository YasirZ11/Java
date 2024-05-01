import java.util.Scanner;

class circleType{
		private double radius;
		
		public circleType() {
			radius=0.0;
		}
		
		public void setRadius(double r) {
			if (r>=0)
				radius=r;
			else
				radius=0;
		}
		public double getRadius() {
			return radius;
		}
		public double area() {
			return Math.PI*radius*radius;
		}
		public double circumference() {
			return 2*Math.PI*radius;
		}
		
		void print() {
			System.out.println("Radius of the circle is: "+radius);
			System.out.println("Area of the circle is: "+area());
			System.out.println("Circumference of the circle is: "+circumference());
		}
	}
	
		class cylinderType extends circleType{
			public double height;
	 
			public cylinderType() {
		
			height=0;
		}
	
			public double getHeight() {
			return height;
		}
		
			public void setHeight(double h) {
				if (h>=0)	
					height=h;
				else
						height=0;
		}
			double volume() {
				return area()*height;
			}
			double surfacearea() {
				return circumference()*(getRadius()+height);
		}
		
			void display() {
				print();
				System.out.println("Height of a cylinder is: "+height);
				System.out.println("Volume of a cylinder is: "+volume());
				System.out.println("Surface area of a cylinder  is: "+surfacearea());
		}
		
	}
		public class TestClass {

			public static void main(String[] args) {
				Scanner in=new Scanner(System.in);
				cylinderType c1=new cylinderType();
				System.out.println("Enter the radius of the base and"
				+ " the height (in centimeter)");
				c1.setRadius(in.nextDouble());
				c1.setHeight(in.nextDouble());
				c1.display();
				System.out.println("Enter the shiping cost per liter");
				double a=in.nextDouble();
				System.out.println("Enter the paint cost per squre feet");
				double b=in.nextDouble();
				System.out.println("shiping cost is RS."+(int)
				(((c1.volume()/1000)*a)*100)/100.0);
				System.out.println("painting cost is RS."+(int)
				(((c1.surfacearea()/1000)*0.0353*b)*100)/100.0);
			
		
	}

}
