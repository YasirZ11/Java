
		public class Tempreature {
		public static double celToFahr(double cel) {
		
			double fahr=(9.0/5) *cel +32;
			return fahr;
		}
		public static double fahrToCel(double fahr) {
			
			double cel=(5.0/9) * (fahr-32);
			return cel;
		}
	public static void main(String[] args) {
		System.out.println("Celsius\t\tFarheit\t|Farheit\t Celsius");
		for(double i=40,j=120;i>=31 && j>=30;i--,j=j-10){
			System.out.println(i+"\t\t"+(int)(celToFahr(i)*10)/10.0+"\t|"+j+"\t\t"+(int)(fahrToCel(j)*100)/100.0);
		}
		}

}
