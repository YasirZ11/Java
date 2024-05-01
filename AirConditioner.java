package ObjectOrientedProgramming;

public class AirConditioner {
	
	int tempreature;
	boolean on;
	boolean swing;
	
	public AirConditioner (){
		tempreature = 16;
		on = false;
		swing = false;
	}
	
	public void turnOn(){
		on=true;
	}
	
	public void turnOff(){
		on=false;
	}
	
	public void setTempreature(int newTempreature){
		if(on==true && newTempreature>=16 && newTempreature<=30)
		tempreature=newTempreature;
	}
	
	public void TempreatureUp(){
		if(on==true && tempreature<30)
			tempreature++;
	}
	
	public void TempreatureDown(){
		if(on==true && tempreature>16)
			tempreature--;
	}
	
	public void swingOn() {
		if (on==true && swing==false)
			swing=true;
	}

	public void swingOff() {
		if (on==true && swing==true || on==false)
			swing=false;
}

}