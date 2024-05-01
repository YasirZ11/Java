	package ObjectOrientedProgramming;

	class Bank{
		int deposit;
		
		public double interestRate() {
			return  deposit*2.5/100;
		}
	}
	
	class BOC extends Bank{
		
		public double interestRate() {
			return  deposit*8.2/100;
		}
	}
	class PeoplesBank extends Bank{
		
		public double interestRate() {
			return  deposit*7.9/100;
		}
	}
	class HNB extends Bank{
		
		public double interestRate() {
			return deposit*7.3/100;
		}
	}
	public class BankingInterest {

	public static void main(String[] args) {
		
	}

}
