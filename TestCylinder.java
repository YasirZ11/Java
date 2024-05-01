	package ObjectOrientedProgramming;
	class Circle{
		private double radius;
		private String color;
		
		public Circle(){
			
		}
		public Circle (double radius){
			this.radius=radius;
		}
		
		public double getRadius() {
			return radius;
		}
		public void setRadius(double radius) {
			this.radius=radius;
		}
		public void setColor (String color) {
			this.color=color;
		}
		
		public double getArea() {
			return Math.PI*radius*radius;
		}
		
		void display() {
			System.out.println("\tCircle: ");
			System.out.println("\t\tRadius: "+radius+" cm");
			System.out.println("\t\tColor: "+color);
			System.out.println("\t\tArea: "+Math.round(getArea())+" cm^2");
		}
		
	}
	
	class Cylinder extends Circle {
		private double height;
		
		public Cylinder() {
			
		}
		public Cylinder (double radius){
		setRadius(radius);
		}
		public Cylinder (double radius,double height){
			setRadius(radius);
			this.height=height;
		}
		public double getHeight() {
			return height;
		}
		
		public double getVolume() {
			return Math.round(getArea())*height*100;
		}
		void display() {
			System.out.println("\tCylinder: ");
			System.out.println("\t\tRadius: "+getRadius()+" cm");
			System.out.println("\t\tHeight: "+getHeight()+" m");
			System.out.println("\t\tVolume: "+getVolume()+" cm^3");
		}
	}
	
	
	public class TestCylinder {

	public static void main(String[] args) {
			Circle obj1=new Circle(7);
			obj1.setColor("Green");
			obj1.display();
			Cylinder obj2=new Cylinder(7,1);
			obj2.display();
			
	}

}
