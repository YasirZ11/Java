package ObjectOrientedProgramming;
	
	class Person{
		String name;
		String address;
		long phone_number;
		String email_address;
		
		public Person(){
			
		}
		
		public String getName(){
			return name;
		}
		
		public String toString() {
			return "Name: "+name+" Class: "+this.getClass().getSimpleName();
		}	
	}
	 
	class Studen extends Person{
		String class_status;
	
		public String toString() {
			return "Name: "+name+" Class: "+this.getClass().getSimpleName();
		}
	}
	class Employee extends Person{
		String office;
		double salary;
		
		public String toString() {
			return "Name: "+name+" Class: "+this.getClass().getSimpleName();
		}
	}
	
	class Faculty extends Employee{
		String office_hours;
		int rank;
		
		public String toString() {
			return "Name: "+name+" Class: "+this.getClass().getSimpleName();
		}
	}
	class Staff extends Employee{
		String title;
		
		public String toString() {
			return "Name: "+name+" Class: "+this.getClass().getSimpleName();
		}
	}
	
	public class University {

	public static void main(String[] args) {
	

	}

}
