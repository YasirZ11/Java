	import java.util.Scanner;

	class Account{
		private int id;
		private double balance;
		private double annualInterestRate;
		
		Account(){
			id=0;
			balance=0;
			annualInterestRate=0;
		}
		
		Account(int id,double balance){
			this.id=id;
			this.balance=balance;
		}
		
		int getId() {
			return id;
		}
		void setId(int id) {
			this.id=id;
		}
		double getBalance() {
			return balance;
		}
		void setBalance(double balance) {
			this.balance=balance;
		}
		double getAnnualInterestRate() {
			return annualInterestRate;
		}
		void setAnnualInterestRate(double annualInterestRate ) {
			this.annualInterestRate=annualInterestRate;
		}
		double getMonthlyInterestRate() {
			return annualInterestRate/12;
		}
		double getMonthlyInterest() {
			return balance*getMonthlyInterestRate()/100;
		}
		void withdraws(int amount) {
			double balance1=balance;
			balance1=balance-amount;
			System.out.println("The balance is Rs. "+balance1);
		}
		void  deposits(int amount) {
			double balance2=balance;
			balance2=balance+amount;
			System.out.println("The balance is Rs. "+balance2);
		}
		
	}

		class ATM extends Account{
			private int choice;
			private int withdrawAmount;
			private int depositAmount;
			
			ATM(int i, int j){
				super(i,j);
			}
			
			void menu(){
				System.out.println("Main menu\n\t1:check balance\n\t2:withdraw\n\t3:deposit\n\t4:exit");
			}
			void AndChoice(int id) {
				
				Scanner sc=new Scanner (System.in);
					setId(id);
					menu();
					
					do {
						System.out.println("Enter a choice ");
						this.choice=sc.nextInt();
						if (choice==1)
							System.out.println("The balance is Rs. "+getBalance());
					 if (choice==2) {
							System.out.print("Enter an amount to withdraw: RS.");
							withdrawAmount=sc.nextInt();
							withdraws(withdrawAmount);
						}
						 if (choice==3) {
							System.out.print("Enter an amount to deposit : RS.");
							depositAmount=sc.nextInt();
							deposits(depositAmount);
						}
								
					}while (choice!=4);
			}
		}

	public class Banking {

	public static void main(String[] args) {
		
			Scanner sc=new Scanner(System.in);
			Account a=new Account(1122,20000);
			a.setAnnualInterestRate(4.5);
			a.withdraws(2500);
			a.deposits(3000);
			System.out.println("The balance is Rs."+a.getBalance());
			System.out.println("Monthly rate is RS."+a.getMonthlyInterest());
			ATM obj[]=new ATM[10];
			for(int i=0;i<10;i++)
			{
			obj[i]=new ATM(i,500);
			}
			System.out.print("Enter an id:");
			int b=sc.nextInt();
			obj[b].AndChoice(b);
			System.out.print("Exit");
	}

}
