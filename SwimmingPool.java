
public class SwimmingPool {
	
	int length; 
	int width;
	int depth; 
	double fillrate; 
	double drainrate; 
	int initialWater;
	
	SwimmingPool(){
		 length=0; 
		 width=0;
		 depth=0; 
		fillrate=0; 
		drainrate=0; 
		initialWater=0;
	}
	
	SwimmingPool(int a,int b,int c,double d, double e, int f){
		 length=a; 
		 width=b;
		 depth=c; 
		 fillrate=d; 
		 drainrate=e; 
		 initialWater=f;
	}
	
	public double poolWaterCapacity() {
		int g= width*length*depth;
		return g;
	}
	
	double WaterCapacityToCompletelyFill(){
		return poolWaterCapacity()/7.48; //in gallons	
		
	}
	
	public double AmountOfWater() {
		return (poolWaterCapacity()-initialWater)/7.48;

	}
	
	public double timeFillemptypool() {
		return  (poolWaterCapacity()/7.48)/fillrate;
	}
	
	public double timeFill() {
		return  AmountOfWater()/fillrate;
	}
	
	public double timeDrain() {
		return  AmountOfWater()/drainrate;
	}
	
	
	void display() {
		System.out.println("Total pool water capicity: "+ poolWaterCapacity()+" gallons"+"\nTime needed to fill empty pool:"+ timeFillemptypool()+" minutes"+"\nAmount of water needed:"+AmountOfWater()+" gallons"+"\nTime needed to fill:"+ timeFill()+" minutes"+"\nTime needed to drain:"+timeDrain()+" minutes");
	}

	public static void main(String[] args) {
		
		SwimmingPool s= new SwimmingPool(30,15,10,2.23,2.32,15);
		s.display();
		
	}

}
