	package ObjectOrientedProgramming;

	public class Refrigerator {
	
	boolean power;
	int coolerTemp;
	int freezerTemp;
	boolean door;
	boolean light;
	
	public Refrigerator() {
		
		power=false;
		coolerTemp= 0; //(0 - 4 Celcius)
		freezerTemp=-18;//(-1 to -18 celcius)
		door=false;
		light=false;
	}
	
	public void turnon() {
		power=true;
	}
	
	public void turnoff() {
		power=false;
	}
	
	public void setCoolerTemp(int newCoolerTemp) {
		if(power==true && newCoolerTemp>=0 && newCoolerTemp<=4)
			coolerTemp=newCoolerTemp;
	}
	
	public void setFreezerTemp(int newFreezerTemp) {
		if(power==true && newFreezerTemp>=-18 && newFreezerTemp<=-1)
			freezerTemp=newFreezerTemp;
	}
		
	public void coolerTempUp() {
		if (power==true && coolerTemp<4)
			coolerTemp++;
	}
	
	public void coolerTempDown() {
		if (power==true && coolerTemp>0)
			coolerTemp--;
	}
	
	public void freezerTempup() {
		if (power==true && freezerTemp<-1)
			freezerTemp++;
	}
	
	public void freezerTempDown() {
		if (power==true && freezerTemp>-18)
			freezerTemp--;
	}
	
	public void doorOpen() {
		if (power==true && door==false)
			door=true;
	}
	
	public void doorClose() {
		if (power=true && door==true)
			door=false;
	}
	
	public void lightOn() {
		if (power==true && door==true)
			light=true;
	}

	public void lightOff() {
		if (power==true && door==false || power==false)
			light=false;
	}
	
}
