	
	class Employee{
		float salary=40000;
	}
	
	class Programmer extends Employee{
		int bonus= 10000;
	}
	
	public class TestInheritance {

		public static void main(String[] args) {

			Programmer p=new Programmer();
			Employee e=new Employee();
			System.out.println("Programmer Salary is: "+p.salary);
			System.out.println("Programmer Bonus is: "+p.bonus);
			System.out.println("Employee Salary is: "+e.salary);

	}

}
	