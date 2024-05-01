
public class Fan {
	final static int SLOW=1,MEDIUM=2,FAST=3;
	private int speed=SLOW;
	private boolean ON=false;
	private double radius=5;
	private String color="blue";
	
	Fan(){
	
	}
	int getSpeed() {
		return speed;
	}
	void setSpeed(int newSpeed) {
		 speed= newSpeed;
	}
	boolean getOn() {
		return ON;
	}
	void setOn(boolean newOn) {
		ON= newOn;
	}
	double getRadius() {
		return radius;
	}
	void setRadius(double newRadius) {
		 radius= newRadius;
	}
	String getColor() {
		return color;
	}        
		void setColor(String newColor) {
		 color= newColor;
	}
	
	void display() {
		if (ON==true) {
		System.out.println("The Speed of the fan is: "+speed+"\t"+"Color:"+color+"\t"+"Radius:"+radius);	
		}
		else {
			System.out.println("Color:"+color+"\t"+"Radius:"+radius+"\t"+"fan is off");
		}
	}
	public static void main(String[] args) {
		Fan f1=new Fan();
		f1.setSpeed(FAST);
		f1.setRadius(10);
		f1.setColor("yellow");
		f1.setOn(true);
		f1.display();
		System.out.println();
		Fan f2=new Fan();
		f2.setSpeed(2);
		f2.setRadius(5);
		f2.setColor("blue");
		f2.setOn(false);
		f2.display();
		}
	

}
