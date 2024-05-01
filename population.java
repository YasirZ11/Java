package Labsheets;

public class population {

	public static int birthperyear() {
		int b=(365*3600*24)/7;
		return b;
	}
	
	public static int deathperyear() {
		int d=(365*3600*24)/13;
		return d;
	}
	

	public static int immigrantperyear() {
		int i=(365*3600*24)/45;
		return i;
	}
	public static void main(String[] args) {
		 int p=312032;
		 int p1=p+birthperyear()-deathperyear()-immigrantperyear();
		 int p2=p1+birthperyear()-deathperyear()-immigrantperyear();
		 int p3=p2+birthperyear()-deathperyear()-immigrantperyear();
		 
		 System.out.println("Year 1: "+p1);
		 System.out.println("Year 2: "+p2);
		 System.out.println("Year 3: "+p3);
		 
		 
	}

}
