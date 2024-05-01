	package ObjectOrientedProgramming;

	import java.util.Arrays;
	public class Multiple_Return{
	class Main {
		String name;
		int age;
		int salary;
	Main(){
		
	}
	int [] getDetails=new int[3];
		public int[] getDetails()  {
	        int v1 = 30;
	        int v2 = 50;
	        int v3 = 100;
	 
	        return new int[] { v1, v2, v3 };
	    }
		Main(String name,int age,int salary){
			this.name=name;
			this.age=age;
			this.salary=salary;
		}	
		
		public Main getDetails1() {
			String name="John";
			int age=21;
			int salary=30000;
			
			return new Main(name,age,salary);
		}
		
}

	    public static void main(String[] args)
	    {
	    	Multiple_Return obj=new Multiple_Return(); 
	        		
	        
	}
	}
	