	package ObjectOrientedProgramming;
	
	abstract class Worker{
		public String name;
		public double salary;
		
		public Worker(String name, double salary_rate) {
			this.name=name;
			salary=salary_rate;
		}
		abstract double computePay();		
	}
	
	class FullTimeWorker extends Worker{
		int hoursWorked;
		public FullTimeWorker (String name, double salary_rate,int hours_Worked) {
			super(name,salary_rate);
			hoursWorked=hours_Worked;
		}
		
		void displayDetails() {
			System.out.println("Full Time Worker");
			System.out.println("Name: "+name);
			System.out.println("Hours Worked: "+hoursWorked);
			System.out.println("Salary: "+computePay());
		}
		double  computePay() {
			if (hoursWorked<=240)
				return hoursWorked*salary;
			else
			return 240*salary;
		}	
	}
	
	class HourlyWorker extends Worker{
		int hoursWorked;
		public HourlyWorker (String name, double salary_rate,int hours_Worked) {
			super(name,salary_rate);
			hoursWorked=hours_Worked;
		}
		
		void displayDetails() {
			System.out.println("Hourly Worker");
			System.out.println("Name: "+name);
			System.out.println("Hours Worked: "+hoursWorked);
			System.out.println("Salary: "+computePay());
		}
		double computePay() {
			if (hoursWorked<=60)
				return hoursWorked*salary;
			else
			return 60*salary;
		}
	}
	public class TestWorker {

	public static void main(String[] args) {
		FullTimeWorker f1=new FullTimeWorker("Bee",100,200);
			f1.displayDetails();
		HourlyWorker h1=new HourlyWorker("Bear",50,40);
			h1.displayDetails();
	}

}
