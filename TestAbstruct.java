	package ObjectOrientedProgramming;

	abstract class Bike{
		abstract void run();
	}
	
	class Honda extends Bike{
		void run() {
			System.out.println("Running safely");
		}
	
	public static void main(String[] args) {
		Honda obj= new Honda();
			obj.run();
		}
	}

