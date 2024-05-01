
public class Circle {
	private String color="red";
	private double radius=1.0;
	
	Circle(){
		
	}
	Circle(double newRadius,String newcolor){
		radius=newRadius;
		color=newcolor;
	}
	
	double getRadius(){
	return radius;
	}
	
	String getColor(){
		return color;
		}
	
	double getArea() {
		return radius*radius*Math.PI;
	}

public static void main(String[] args) {
	
	Circle c1= new Circle(2.0,"blue");
	System.out.println("Radius is: "+ c1.getRadius()+"\n"+"Color is: "+c1.getColor()+
			"\n"+"Area is: "+c1.getArea());
	System.out.println();
	Circle c2= new Circle(2.0,"red");
	System.out.println("Radius is: "+ c2.getRadius()+"\n"+"Color is: "+c2.getColor()+
			"\n"+"Area is: "+c2.getArea());
	System.out.println();
	Circle c3= new Circle(1.0,"red");
	System.out.println("Radius is: "+ c3.getRadius()+"\n"+"Color is: "+c3.getColor()+
			"\n"+"Area is: "+c3.getArea());
	
}

}
