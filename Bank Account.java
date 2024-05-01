
	class bankAccount {

		int accountNo;
		double balance;
		double withdraw;
		double deposit;
		
		public void setAccountNumber(int accountNo) {
			this.accountNo=accountNo;
		}
		
		public int getAccountNumber() {
			return  accountNo;
		}
		
		public double getBalance() {
			return balance;
		}
		
		void  depositMoney(double d){
			
		}
		
		void  withdrawMoney(double w){
			
		}
		
		void display() {
			System.out.println("Account number: "+ getAccountNumber()+"\nBalance: "+getBalance());
			
		}
		
		bankAccount(int a,double b){
			accountNo=a;
			balance=b;
		}
	}
		
		class checkingAccount extends bankAccount{
			double interestRate;
			double minBalance;
			double serviceCharges;
			
		checkingAccount(int accountNo, double balance) {
				super(accountNo, balance);
			
			}

		void setMonthlyInterestRate(double interestRate) {
			this.interestRate=interestRate;
			
		}
		
		public double getInterestRate() {
			return interestRate;
		}
		
		void setMinBalance(double minBalance) {
			this.minBalance=minBalance;
		}
		
		public double getMinBalance() {
			return minBalance;
		}
		
		void setMonthlyCharges(double serviceCharges) {
			this.serviceCharges=serviceCharges;
		}
		
		public double getsetMonthlyCharge() {
			return serviceCharges;
		}
		
		public double monthlyUpdate() {
			return balance=balance+ interestRate-serviceCharges;
			
		}
		
		boolean verify() {
			if (balance>minBalance)
				return true;
			else
				return false;
		}
		
		void  withdrawMoney(double minBalance){
			
		}
		
		void display() {
			System.out.println("Account number: "+ getAccountNumber()+"\nBalance: "+monthlyUpdate());
			
		}
		
		}
		
		class savingAccounts extends bankAccount{
			savingAccounts(int accountNo, double balance) {
				super(accountNo, balance);
		}
			
			
			
		}
	
		
public class Bank {

	public static void main(String[] args) {
		
	}

}
