	package ObjectOrientedProgramming;

	public class MyPoint {
		double x=0,y=0;
		double x1,y1;
		MyPoint(){
			
		}
		
		MyPoint(double x1,double y1){
			
		}
		double getX() {
			return x;
		}
		double getY() {
			return y;
		}
			
		double getDistance(){
			return Math.sqrt((y1-y)*(y1*y)+(x1-x)*(x1-x));
		}
		
		
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
