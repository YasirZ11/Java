package ObjectOrientedProgramming;
	import java.util.Date;	
	public class GeometricObject {
		
		private String color="white";
		private boolean filled=false;
		java.util.Date dateCreated;
		GeometricObject(){
			
		}
		
		GeometricObject(String color,boolean filled){
			this.color=color;
			this.filled=filled;
		}

			String getColor() {
				return color;
			}
			void setColor(String newcolor) {
				
			}
			boolean isFilled() {
				return filled;
			}
			void setFilled(boolean newfilled) {
				
			}
			java.util.Date getDateCreated(){
				return dateCreated;
			}
			public String toString() {
				return color+" "+filled+" "+dateCreated;
			}
			class Circle extends GeometricObject{
				
				private double radius;
				
				Circle(){
					
				}
				Circle (double radius){
					this.radius=radius;
				}
				Circle(double radius,String color,boolean filled){
					this.radius=radius;
					setColor(color);
					setFilled(filled);
				}
				double getRadius(){
					return radius;
				}
				void setRadius(double newRadius) {
					
				}
				double getArea() {
					return Math.PI*radius*radius;
					}
				double getPerimeter() {
					return 2*Math.PI*radius;
				}
				double getDiameter() {
					return 2*radius;
				}
				void printCircle() {
					
				}
			}
			class Rectangle extends GeometricObject{
				private double width;
				private double height;
				
				Rectangle(){
					
				}
				Rectangle(double width,double height){
					this.width=width;
					this.height=height;
				}
				Rectangle(double width,double height,String color,boolean filled){
					this.width=width;
					this.height=height;
					setColor(color);
					setFilled(filled);
				}
				double getWidth() {
					return width;
				}
				void setWidth(double newWidth) {
					
				}
				double getHeight() {
					return height;
				}
				void setHeight(double newHeight) {
					
				}
				double getArea() {
					return width*height;
				}
				double getPerimeter() {
					return 2*(height+width);
				}
			}
			
				public static void main(String[] args) {
			
		

	}

}

