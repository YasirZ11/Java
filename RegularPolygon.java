
	public class RegularPolygon {
		
		private int n=3;
		private double side=1;
		private double x=0;
		private double y=0;
		
		RegularPolygon(){
			
		}
		RegularPolygon(int n,double length){
			this.n=n;
			side=length;
		}
		RegularPolygon(int n,double length,double x,double y){
			this.n=n;
			side=length;
			this.x=x;
			this.y=y;
		}
		int getN() {
			return n;
		}
		void setN(int N) {
			n=N;
		}
		double getSide() {
			return side;
		}
		void setSide(double Side) {
			side=Side;
		}
		 double getX() {
			return x;
		}
		void setX(double X) {
			x=X;
		}
		double getY() {
			return y ;
		}
		void setY(double Y) {
			y=Y;
		}
		double getPerimeter() {
			return n*side;
		}
		
		double getArea()	{
			return (n*side*side)/(4*(Math.tan(Math.PI/n)));
		}	
		
		void display() {
			System.out.println("Perimeter is: "+getPerimeter()+"  "+"Area is: "+getArea());
		}
			public static void main(String[] args) {
		
				RegularPolygon p1= new RegularPolygon(6,4);
				RegularPolygon p2= new RegularPolygon(10,4,5.6,7.8);
				RegularPolygon p3= new RegularPolygon();
				p1.display();
				p2.display();
				p3.display();
			}
	}

