	package ObjectOrientedProgramming;

	import java.util.Scanner;

	class GeometricObje{
		public String color;
		public boolean filled;
		}
	
	class Triangle extends GeometricObje{
		public double side1=1.0;
		public double side2=1.0;
		public double side3=1.0;
		 
		 Triangle(){
			 
		 }
		 Triangle(double side1,double side2,double side3){
			 this.side1=side1;
			 this.side2=side2;
			 this.side3=side3;
		 }
		public double getSide1(){
			 return side1;
			 }
		public void setSide1(double Side1) {
			 
		 }
		public double getSide2(){
			 return side2;
			 }
		public void setSide2(double Side2) {
			 
		 }
		public double getSide3(){
			 return side3;
			 }
		public void setSide3(double Side3) {
			 
		 }
		public double getArea() {
			return(side1+side2+side3)/2;
		}
		public double getPerimeter() {
			return(side1+side2+side3);
		}
		public String toString() {
			return "Triangle: Side 1= "+side1+" Side 2= "+side2+" Side 3= "+side3;
		}
	}
	
	
	public class TestTriangle {

	public static void main(String[] args) {
		
		Scanner in= new Scanner(System.in);
		System.out.println("Enter three sides of triangle");
		double side1=in.nextDouble();
		double side2=in.nextDouble();
		double side3=in.nextDouble();
		
		System.out.println("Enter the color of triangle");
		String color=in.next();
		
		System.out.println("Enter the boolean value whether the triangle is filled (True or False)?");
		String filled=in.next();
		System.out.println();
		System.out.println("The sides of the triangles are \n Side 1: "+side1+"\n Side 2= "+side2+"\n Side 3= "+side3+
				"\n The area of the triangle: "+((side1+side2+side3)/2)+"\n The perimeter of the triangle: "+(side1+side2+side3)+
				"\n The color of the triangle: "+color+"\n Is the triangle filled? "+filled);
		
			  }
		}

	